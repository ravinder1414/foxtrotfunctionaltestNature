package com.nature.quickstep.pageobjects.site.webadmin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.nature.quickstep.pageobjects.PageObject;

public class WebAdminAccountResultsPage extends PageObject {

    @Override
    public void navigateTo() {
        // TODO Auto-generated method stub

    }

    @Override
    public boolean isPresent() {
        // TODO Auto-generated method stub
        return false;
    }

    /***
     * 
     * @param siteid
     * @return link object of first siteidresult
     */
    public WebElement lnkSiteId() {
        return browser().findElement(By.xpath("html/body/" + "center/p[1]/table[2]/tbody/tr[4]/td[1]/a"));
    }

    /***
     * 
     * @param siteid
     * @return link object of siteidresult
     */
    public WebElement lnkSiteId(String siteid) {
        return browser().findElement(By.linkText(siteid));
    }

    /***
     * 
     * @returns Linked Text object of Cache Account
     */
    public WebElement lnkCacheAccount() {
        return browser().findElement(By.linkText("Account"));
    }

    /***
     * 
     * @returns Linked Text Object of Cache Licences
     */
    public WebElement lnkCacheLicenses() {
        return browser().findElement(By.linkText("Licenses"));
    }

}
