package com.nature.quickstep.pageobjects.accesscontrol.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.nature.quickstep.pageobjects.PageObject;
import com.nature.quickstep.util.Environment;
import com.nature.quickstep.util.EnvironmentFactory;
import com.nature.quickstep.util.WebDriverUtils;

/**
 * Provides the ability to interact with (and query the state of) the login page
 * on the Nature website.
 * 
 * @author mark.micallef
 * 
 */

public class NatureLoginPage extends PageObject {

    String validUsername = "quickstepuser6@mailinator.com";
    String validPassword = "qwer1234";

    public NatureLoginPage() {
        super();

        Environment env = null;

        try {
            env = context().getEnvironment();
        } catch (Exception e) {
            e.printStackTrace();
        }

        if (env == EnvironmentFactory.live) {
            validUsername = "quickstepuser7@mailinator.com";
            validPassword = "qwer1234";
        }

    }

    /**
     * Retrieves a valid username for the current environment
     * 
     * @return a valid username for the current environment
     */
    public String getValidUsername() {
        return validUsername;
    }

    /**
     * Retrieves a valid password for the current environment
     * 
     * @return a valid password for the current environment
     */
    public String getValidPassword() {
        return validPassword;
    }

    /**
     * Navigates to the Login homepage.
     * 
     * @throws Exception
     */

    @Override
    public void navigateTo() {
        browser().get(context().getURL("nature.com/foxtrot/svc/login"));
    }

    /**
     * Automates the user journey whereby a user attempts to log in using a
     * Nature account.
     * 
     * @param email
     *            - The user's e-mail address.
     * @param password
     *            - The user's password.
     * @throws Exception
     */
    public void loginUsingNatureAccount(String email, String password) throws Exception {
        navigateTo();
        txtEmail().sendKeys(email);
        txtPassword().sendKeys(password);
        btnSubmit().click();
    }

    /**
     * Automates the user journey whereby a user attempts to log in using a
     * <b>valid</b> Nature account.
     * 
     * @throws Exception
     */
    public void loginUsingValidNatureAccount() throws Exception {
        loginUsingNatureAccount(validUsername, validPassword);
    }

    /**
     * Provides a handle to the e-mail field on the login screen.
     * 
     * @return A <code>WebElement</code> as a handle to the e-mail field.
     */
    public WebElement txtEmail() {
        return browser().findElement(By.id("login-username"));
    }

    /**
     * Provides a handle to the password field on the login screen.
     * 
     * @return A <code>WebElement</code> as a handle to the password field.
     */
    public WebElement txtPassword() {
        return browser().findElement(By.id("login-password"));
    }

    /**
     * Provides a handle to the submit button on the login screen.
     * 
     * @return A <code>WebElement</code> as a handle to the submit button.
     */
    public WebElement btnSubmit() {
        return browser().findElement(By.id("login-submit"));
    }

    /**
     * Provides a handle to the "Login via Athens" link on the login screen.
     * 
     * @return A <code>WebElement</code> as a handle to the "Login via Athens"
     *         link.
     */
    public WebElement lnkAthensLogin() {

        return browser().findElement(By.linkText("Login via Athens"));
    }

    /**
     * Provides a handle to the "Login via your institution" link on the login
     * screen.
     * 
     * @return A <code>WebElement</code> as a handle to the
     *         "Login via your institution" link.
     */
    public WebElement lnkInstitutionLogin() {
        return browser().findElement(By.xpath("//a[text() = 'Login via your institution']"));
    }

    @Override
    public boolean isPresent() {
        // TODO Auto-generated method stub
        return false;
    }

    /**
     * Checks whether or not a user is currently logged in.
     * 
     * @return <code>true</code> if a user is logged in, <code>false</code> otherwise.
     */
    public boolean isUserLoggedIn() {

        boolean result = true;

        try {
            (new WebDriverWait(browser(), 10))
                    .until(ExpectedConditions.presenceOfElementLocated(By.className("logoff")));
        } catch (Exception e) {
            result = false;
        }

        return result;
    }

    /**
     * Retrieves the forgotten password for the given e-mail.
     * 
     * @param email
     *            The e-mail address
     * @throws Exception
     *             if something horrible happens
     */
    public void retrieveForgottenPassword(String email) throws Exception {
        navigateTo();
        lnkForgottenPassword().click();
        txtEmailAddressForForgottenPassword().sendKeys(email);
        btnSendForgottenPassword().submit();
    }

    /**
     * Returns a handle to the "Forgotten your password?" link
     * 
     * @return A handle to the "Forgotten your password?" link
     */
    public WebElement lnkForgottenPassword() {
        return browser().findElement(By.linkText("Forgotten your password?"));
    }

    /**
     * Returns a handle to the text field intended for holding the e-mail
     * address when a user has forgotten his/her password.
     * 
     * @return a handle to the text field holding e-mail for forgotten password
     */
    public WebElement txtEmailAddressForForgottenPassword() {
        return browser().findElement(By.name("userId"));
    }

    /**
     * Returns a handle to the button which sends a request for a forgotten password.
     * 
     * @return a handle to the button which sends a request for a forgotten password.
     */
    public WebElement btnSendForgottenPassword() {
        return browser().findElement(By.name("theform"));
    }

    /***
     * validates institutional Page
     * 
     * @throws Exception
     */
    public void validateInstutionalPage() throws Exception {
        WebDriverUtils.waitForURLToContainSubstring(browser(), "institutelogin");
    }

}
