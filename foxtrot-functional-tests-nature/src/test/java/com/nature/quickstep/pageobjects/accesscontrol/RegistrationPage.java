package com.nature.quickstep.pageobjects.accesscontrol;

import static org.junit.Assert.assertEquals;

import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.nature.quickstep.pageobjects.PageObject;

public class RegistrationPage extends PageObject {

    @Override
    public boolean isPresent() {
        return false;
    }

    @Override
    public void navigateTo() {
        browser().get(context().getURL("nature.com/register"));
    }

    public WebElement firstname() {
        String elementLocator = "//*[@id='firstname']";
        ensure().element(By.xpath(elementLocator)).seconds(15);
        return browser().findElement(By.xpath(elementLocator));
    }

    public WebElement lastname() {
        return browser().findElement(By.xpath("//*[@id='lastname']"));
    }

    public WebElement email() {
        return browser().findElement(By.xpath("/html/body/div/div[2]/form/div/dl/dd[2]/input"));
    }

    public WebElement emailValidation() {
        return browser().findElement(By.cssSelector("strong"));
    }

    public WebElement confirmationEmail() {
        String elementLocator = "your nature registration";
        ensure().element(By.linkText(elementLocator)).seconds(15);
        return browser().findElement(By.linkText(elementLocator));
    }

    public WebElement confirmationEmailLink() throws Exception {
        return browser().findElement(By.partialLinkText(context().getEnvironment() + "nature.com/verify/"));
    }

    public WebElement password() {
        return browser().findElement(By.xpath("/html/body/div/div[2]/form/div/dl/dd[3]/input"));
    }

    public WebElement loginPassword() {
        String elementLocator = "//*[@id='login-password']";
        ensure().element(By.xpath(elementLocator)).seconds(15);
        return browser().findElement(By.xpath(elementLocator));
    }

    public WebElement loginSubmit() {
        return browser().findElement(By.xpath("//*[@id='reg-login']/input"));
    }

    public WebElement registrationComplete() {
        return browser().findElement(By.xpath("//*[@id='content']/h1"));

    }

    public WebElement confirmpassword() {
        return browser().findElement(By.xpath("/html/body/div/div[2]/form/div/dl/dd[4]/input"));
    }

    public WebElement termsAndconditions() {
        return browser().findElement(By.xpath("//*[@id='agreeToTerms']"));
    }

    public WebElement employer() {
        return browser().findElement(By.xpath("//*[@id='company']"));
    }

    public WebElement employerValidation() {
        return browser().findElement(By.xpath("//*[@id='helper-company']/div/div/div/p"));
    }

    public void jobTitle(String position) {
        Select sele = new Select(browser().findElement(By.xpath("//*[@id='position']")));
        sele.selectByVisibleText(position);
    }

    public void industry(String industry) {
        Select sele = new Select(browser().findElement(By.xpath("//*[@id='place']")));
        sele.selectByVisibleText(industry);
    }

    public void areaOfInterest(String field) {
        Select sele = new Select(browser().findElement(By.xpath("//*[@id='field']")));
        sele.selectByVisibleText(field);
    }

    public void specialities(String speciality) {
        Select sele = new Select(browser().findElement(By.xpath("//*[@id='firstspeciality']")));
        sele.selectByVisibleText(speciality);
    }

    public WebElement register() {
        return browser().findElement(By.xpath("//*[@id='content']/input"));
    }

    public WebElement registrationConfirmation() {
        String elementLocator = "//*[@id='content']/h1";
        ensure().element(By.xpath(elementLocator)).seconds(15);
        return browser().findElement(By.xpath(elementLocator));
    }

    public WebElement invalidRegistartionErrorMessage() {
        return browser().findElement(By.xpath("//*[@id='content']/span"));
    }

    public WebElement orcidLink() {
        return browser().findElement(By.xpath("//*[@id='orcid-register']"));
    }

    public WebElement orcidFirstName() {
        return browser().findElement(By.xpath("//*[@id='ng-app']/div/div[1]/div/input"));
    }

    public WebElement orcidLastName() {
        return browser().findElement(By.xpath("//*[@id='ng-app']/div/div[2]/div/input"));
    }

    public WebElement orcidEmail() {
        return browser().findElement(By.xpath("//*[@id='ng-app']/div/div[3]/div/input"));
    }

    public WebElement orcidReEnterEmail() {
        return browser().findElement(By.xpath("//*[@id='ng-app']/div/div[4]/div/input"));
    }

    public WebElement orcidPassword() {
        return browser().findElement(By.xpath("//*[@id='ng-app']/div/div[5]/div/input"));
    }

    public WebElement orcidConfirmationPassword() {
        return browser().findElement(By.xpath("//*[@id='ng-app']/div/div[6]/div/input"));
    }

    public WebElement orcidConsent() {
        return browser().findElement(By.xpath("//*[@id='ng-app']/div/div[9]/div/label[2]/input"));
    }

    public WebElement orcidRegister() {
        return browser().findElement(By.xpath("//*[@id='ng-app']/div/div[10]/button"));
    }

    public WebElement orcidRegisterConfirmation() {
        return browser().findElement(By.xpath("html/body/div[3]/div/div[2]/p[2]"));
    }

    public WebElement orcidAuthorize() {
        return browser().findElement(By.xpath("//*[@id='confirmationForm']/input[2]"));
    }

    public WebElement orcidValidation() {
        return browser().findElement(By.xpath("//*[@id='ng-app']/div/div[3]/div/span[2]/div"));
    }

    public WebElement emailPalgrave() {
        return browser().findElement(By.name("email"));
    }

    public WebElement confirmEmailPalgrave() {
        return browser().findElement(By.name("emailConfirm"));
    }

    public WebElement passwordPalgrave() {
        return browser().findElement(By.name("password"));
    }

    public WebElement confirmPasswordPalgrave() {
        return browser().findElement(By.name("passwordConfirm"));
    }

    public WebElement name1Palgrave() {
        return browser().findElement(By.name("firstname"));
    }

    public WebElement name2Palgrave() {
        return browser().findElement(By.name("lastname"));
    }

    public void palceOfWorkPalgrave(String workplace) {
        Select sele = new Select(browser().findElement(By.name("place")));
        sele.selectByVisibleText(workplace);
    }

    public void positionPalgrave(String position) {
        Select sele = new Select(browser().findElement(By.name("position")));
        sele.selectByVisibleText(position);
    }

    public WebElement companyPalgrave() {
        return browser().findElement(By.name("company"));
    }

    public WebElement continuePlagrave() {
        return browser().findElement(By.cssSelector("input[type=\"image\"]"));
    }

    public WebElement continuepage2Palgrave() {
        return browser().findElement(
                By.xpath("html/body/table[2]/tbody/tr[2]/td[3]/table/tbody/tr/td/"
                        + "table[2]/tbody/tr[1]/td/table/tbody/tr[1]/td/table/tbody/tr/td[1]/form/span[2]/table/"
                        + "tbody/tr[12]/td/input"));
    }

    public WebElement confirmPalgrave() {
        return browser().findElement(
                By.xpath("html/body/table[2]/tbody/tr[2]/td[3]/table/tbody/tr/td/"
                        + "table[2]/tbody/tr[1]/td/table/tbody/tr[1]/td/table/tbody/tr/td[1]/form/p[2]/"
                        + "table/tbody/tr[28]/td/input"));
    }

    public WebElement confirmationMessagePalgrave() {
        return browser().findElement(
                By.xpath("html/body/table[2]/tbody/tr[2]/td[3]/table/tbody/tr/td/"
                        + "table[2]/tbody/tr[1]/td/table/tbody/tr[1]/td/table/tbody/tr/td[1]/p[1]/span[2]/b"));
    }

    public WebElement registrationErrorPalgrave() {
        return browser().findElement(
                By.xpath("html/body/table[2]/tbody/tr[2]/td[3]/table/tbody/tr/td/"
                        + "table[2]/tbody/tr[1]/td/table/tbody/tr[1]/td/table/tbody/tr/td[1]/p[2]"));
    }

    public WebElement confirmationEmailLinkPalgrave() {
        return browser().findElement(By.linkText("http://www.palgrave-journals.com/nams/svc/myaccount"));
    }

    public WebElement userNameValidationPalgrave() {
        return browser()
                .findElement(
                        By.xpath("html/body/table[2]/tbody/tr[2]/td[3]/table/tbody/tr/td/"
                                + "table[2]/tbody/tr[1]/td/table/tbody/tr[1]/td/table/tbody/tr/td[1]/table[2]/tbody/tr[1]/td[2]"));
    }

    public WebElement confirmationEmailPalgrave() {
        return browser().findElement(By.linkText("your palgrave macmillan journals registr"));
    }

    public WebElement mailinatorSearch() {
        return browser().findElement(By.xpath("//*[@id='check_inbox_field']"));
    }

    public WebElement mailinatorGo() {
        return browser().findElement(By.xpath("//*[@id='checkInbox']/form/input[2]"));

    }

    public void validateRegistration() {
        assertEquals("Thank you for registering at nature.com, you are almost done.", registrationConfirmation()
                .getText());
    }

    public void validateEmailVerification() {
        assertEquals("Thank you for registering at nature.com.", registrationConfirmation().getText());
    }

    public long randomNumber() {

        Date dt = new Date();
        long milliseconds = dt.getTime();

        return milliseconds;
    }

    public void navigateToMailBox(long rnum) {
        browser().get("http://" + "quickstep" + rnum + ".mailinator.com/");
    }

    public void validateVerificationEmailExistance() {
        assertEquals("your nature registration", confirmationEmail().getText());
    }

    public void navigateRegistration(String kEY) throws Exception {
        browser().get(context().getURL("nature.com/verify/" + kEY));
    }

}
