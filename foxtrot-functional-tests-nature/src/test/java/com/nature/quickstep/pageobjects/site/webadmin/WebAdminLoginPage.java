package com.nature.quickstep.pageobjects.site.webadmin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.nature.quickstep.pageobjects.PageObject;
import com.nature.quickstep.pageobjects.accesscontrol.login.NatureLoginPage;

public class WebAdminLoginPage extends PageObject {
    NatureLoginPage nlogin = new NatureLoginPage();

    /***
     * Navigates to the Nature WebAdmin Page
     */
    @Override
    public void navigateTo() {
        browser().get(context().getURL("nature.com/webadmin/adminlogin.do"));
    }

    @Override
    public boolean isPresent() {
        return false;
    }

    /***
     * Automates the user journey whereby a user attempts to log in using a Nature Webadmin account.
     * 
     * @param email
     *            - The user's e-mail address.
     * @param password
     *            - The user's password.
     * @throws Exception
     */
    public void loginUsingNatureWebadminAccount(String email, String password) throws Exception {
        navigateTo();
        nlogin.txtEmail().sendKeys(email);
        nlogin.txtPassword().sendKeys(password);
        nlogin.btnSubmit().click();
    }

    /***
     * 
     * @returns Add Site Licence linked list object on Webadmin Page
     */
    public WebElement lnkaddSiteLicence() {
        return browser().findElement(By.linkText("Add Site Account"));
    }

}
