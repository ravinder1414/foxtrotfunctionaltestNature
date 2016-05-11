package com.nature.quickstep.pageobjects.site.webadmin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.nature.quickstep.pageobjects.PageObject;

public class WebAdminSearchForSiteLicence extends PageObject {
    WebAdminHomePage whome = new WebAdminHomePage();
    WebAdminLoginPage wlogin = new WebAdminLoginPage();

    /***
     * Automates the user journey whereby a user attempts to log in using a
     * <b>valid</b> Nature Webadmin account - Corporate UnMediated Licence
     * 
     * @throws Exception
     */
    public void webadminLoginCorporateUnmediated(String username, String password, String siteid) throws Exception {
        wlogin.loginUsingNatureWebadminAccount(username, password);
        whome.lnkMainSiteLicenseSearch().click();
        txtEmailAddress().sendKeys(username);
        btnSearch().click();
        //    	browser().findElement(By.linkText(siteid));
    }

    /**
     * 
     * @returns textbox object of Email Address
     */
    public WebElement txtEmailAddress() {
        return browser().findElement(By.xpath("html/body/center/" + "table[2]/tbody/tr[10]/td[2]/input"));
    }

    public WebElement btnSearch() {
        return browser().findElement(By.xpath("//*[@id='search2']"));

    }

    @Override
    public void navigateTo() {
        // TODO Auto-generated method stub

    }

    @Override
    public boolean isPresent() {
        // TODO Auto-generated method stub
        return false;
    }
}
