package com.nature.quickstep.pageobjects.site.webadmin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.nature.quickstep.pageobjects.PageObject;

public class WebAdminHomePage extends PageObject {

    @Override
    public void navigateTo() {
        browser().get(context().getURL("nature.com/webadmin/"));
    }

    @Override
    public boolean isPresent() {
        return false;
    }

    /***
     * 
     * @returns link object - Main Site License Search
     */
    public WebElement lnkMainSiteLicenseSearch() {
        return browser().findElement(By.linkText("Main Site License Search"));
    }

    /**
     * 
     * @returns Linked Text Object of Logout
     */
    public WebElement lnkLogout() {
        return browser().findElement(By.linkText("Logout"));
    }

}
