package com.nature.quickstep.pageobjects.accesscontrol.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.nature.quickstep.pageobjects.PageObject;

public class LoginPage extends PageObject {

    @Override
    public void navigateTo() {
        browser().get(context().getURL("nature.com/foxtrot/svc/login"));
    }

    @Override
    public boolean isPresent() {
        return false;
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

    /**
     * @return Register login button WebElement
     */
    public WebElement btnLogin() {
        return browser().findElement(By.xpath("//input[@id='login-submit']"));
    }

    /**
     * Returns a handle to the log out link.
     * 
     * @return <code>WebElement</code> as a handle to the log out link.
     */
    public WebElement lnkLogOut() {
        return browser().findElement(By.className("logoff"));
    }

    public void login() {
        userName().sendKeys("quickstepuser4@mailinator.com");
        password().sendKeys("qwer1234");
        btnLogin().click();
    }

    public void loginWithCorrectLegacyUserCredentials() {
        ensure().element(By.xpath("//input[@id='login-username']")).seconds(15);
        userName().sendKeys("quickstepuser4@mailinator.com");
        password().sendKeys("qwer1234");
        btnLogin().click();
    }

    public void loginWithCorrectAlhambraUserCredentials() {
        ensure().element(By.xpath("//input[@id='login-username']")).seconds(15);
        userName().sendKeys("quickstepuser5@mailinator.com");
        password().sendKeys("qwer1234");
        btnLogin().click();
    }

    public boolean isUserLoggedIn() {
        ensure().element(By.className("logoff")).seconds(15);
        return (lnkLogOut() != null);
    }

}
