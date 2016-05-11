package com.nature.quickstep.pageobjects.site;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.nature.quickstep.pageobjects.PageObject;

public class SendToFriendPage extends PageObject {

    @Override
    public boolean isPresent() {
        return false;
    }

    @Override
    public void navigateTo() {
        browser().get(context().getURL("nature.com/ncomms/2013/131004/ncomms3560/abs/ncomms3560.html"));
        ensure(sendToFriendLocator(), 15);
        lnkEmail().click();
        ensure(By.id("login-submit"), 15);
        login();
    }

    private By sendToFriendLocator() {
        return By.xpath("//a[@data-tooltip='Email']");
    }

    public WebElement lnkEmail() {
        return browser().findElement(sendToFriendLocator());
    }

    public WebElement fldErrorFriendEmail() {
        return browser().findElement(By.xpath("//ul[@class='error']/li[1]"));
    }

    public WebElement fldErrorSenderEmail() {
        return browser().findElement(By.xpath("//ul[@class='error']/li[2]"));
    }

    public WebElement friendEmail() {
        return browser().findElement(By.xpath("//input[@id='staf_email']"));
    }

    public WebElement senderEmail() {
        return browser().findElement(By.xpath("//input[@id='staf_sender']"));
    }

    public WebElement btnSendToFriend() {
        return browser().findElement(sendToFrndFormSubmitButtonLocator());
    }

    private By sendToFrndFormSubmitButtonLocator() {
        return By.xpath("//input[@value='Send link to friend']");
    }

    public String fldEmailSent() {
        return browser().findElement(By.xpath(".//div[@id='content']/article/p")).getText();
    }

    public String fldMaximumLimitExceeded() {
        return browser().findElement(By.xpath(".//p[@class='bodytext14px']")).getText();
    }

    public WebElement lnkLogOut() {
        return browser().findElement(By.className("logout"));
    }

    /**
     * @return Register login button WebElement
     */
    public WebElement btnLogin() {
        return browser().findElement(By.xpath("//input[@id='login-submit']"));
    }

    /**
     * @return user name text box WebElement
     */
    public WebElement userName() {
        return browser().findElement(By.xpath("//input[@id='login-username']"));
    }

    /**
     * @return Password text box WebElement
     */
    public WebElement password() {
        return browser().findElement(By.xpath("//input[@id='login-password']"));
    }

    public void logout() {
        lnkLogOut().click();
    }

    public void login() {
        userName().sendKeys("quickstepuser8@mailinator.com");
        password().sendKeys("qwer1234");
        btnLogin().click();
    }

    public void submitIncompleteForm() {
        ensure(sendToFrndFormSubmitButtonLocator(), 15);
        btnSendToFriend().submit();
    }

    public void submitCompleteSendToFriendEmailForm() {
        ensure(sendToFrndFormSubmitButtonLocator(), 15);
        friendEmail().sendKeys("quickstepuser9@mailinator.com");
        senderEmail().sendKeys("quickstepuser8@mailinator.com");
        btnSendToFriend().submit();
    }

    public void validateSendToFriendErrorMessages() {
        ensure(sendToFrndFormSubmitButtonLocator(), 15);
        assertEquals("Invalid your friend's e-mail address format.", fldErrorFriendEmail().getText());
        assertEquals("Invalid sender e-mail address format.", fldErrorSenderEmail().getText());
    }

    public void validateSendToFriendPage() throws Exception {
        ensure(sendToFrndFormSubmitButtonLocator(), 15);
        assertEquals(
                context()
                        .getURL("nature.com/foxtrot/svc/mailform?doi=10.1038/ncomms3560&file=/ncomms/2013/131004/ncomms3560/abs/ncomms3560.html"),
                browser().getCurrentUrl());
    }

    public void validateEmailSentMessage() {
        ensure(By.className("back-to-article"), 15);
        try {
            assertEquals("A link to this article has been sent to quickstepuser9@mailinator.com", fldEmailSent());
        } catch (AssertionError assertionError) {
            // Check if email sent Maximum Limit Exceeded
            assertEquals("Your limit within a 24 hour window has been reached.", fldMaximumLimitExceeded());
        }
    }

    private void ensure(By by, int seconds) {
        ensure().element(by).seconds(seconds);
    }
}
