package com.nature.quickstep.pageobjects.site.webadmin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.nature.quickstep.pageobjects.PageObject;
import com.nature.quickstep.util.WebDriverUtils;

public class WebAdminSiteLicenceAdministrationAccountPage extends PageObject {
    WebAdminHomePage whome = new WebAdminHomePage();
    WebAdminLoginPage wlogin = new WebAdminLoginPage();
    WebAdminSearchForSiteLicence wsearch = new WebAdminSearchForSiteLicence();
    WebAdminAccountResultsPage wresults = new WebAdminAccountResultsPage();
    String ip = null;

    /****
     * This method adds the ip ranges to the Site Licence Administration Account
     * 
     * @throws Exception
     */
    public void addIpRange(String username, String password, String description) throws Exception {
        ip = WebDriverUtils.getIpAsSeenFromNatureServer();
        wlogin.loginUsingNatureWebadminAccount(username, password);
        whome.lnkMainSiteLicenseSearch().click();
        wsearch.txtEmailAddress().sendKeys(username);
        wsearch.btnSearch().click();
        wresults.lnkSiteId(getSiteId()).click();
        lnkIpRanges().click();
        txtLowerIPAddress().sendKeys(ip);
        txtHighIPAddress().sendKeys(ip);
        txtDescription().sendKeys(description);
        btnAddIPRange().click();
        lnkEdit().isDisplayed();
    }

    /****
     * This method removes the ip ranges to the Site Licence Administration Account
     * 
     * @throws Exception
     */
    public void removeIpRange(String username, String password) throws Exception {
        ip = WebDriverUtils.getIpAsSeenFromNatureServer();
        wlogin.loginUsingNatureWebadminAccount(username, password);
        whome.lnkMainSiteLicenseSearch().click();
        wsearch.txtEmailAddress().sendKeys(username);
        wsearch.btnSearch().click();
        wresults.lnkSiteId(getSiteId()).click();
        lnkIpRanges().click();
        lnkEdit().click();
        btnDeleteIPRange().click();
        btnReturnToMainMenu().click();
        whome.lnkMainSiteLicenseSearch().click();
        wsearch.txtEmailAddress().sendKeys(username);
        wsearch.btnSearch().click();
        wresults.lnkCacheAccount().click();
        lnkReturnToMain().click();
        whome.lnkMainSiteLicenseSearch().click();
        wsearch.txtEmailAddress().sendKeys(username);
        wsearch.btnSearch().click();
        //    	browser().navigate().back();
        wresults.lnkCacheLicenses().click();
        //    	browser().navigate().back();
        lnkReturnToMain().click();
        whome.lnkMainSiteLicenseSearch().click();
        wsearch.txtEmailAddress().sendKeys(username);
        wsearch.btnSearch().click();
    }

    /***
     * 
     * @returns remaining AOD units
     */
    public int remainingAODunits() {
        lnkAOD().click();
        String remUnits = lblRemainingAODUnits().getText();
        int foo = Integer.parseInt(remUnits);
        return foo;

    }

    /****
     * Logout from WebAdmin
     */
    public void webAdminLogout() {
        whome.lnkLogout().click();
    }

    /**
     * 
     * @returns site id value from account results page
     */
    public String getSiteId() {
        return wresults.lnkSiteId().getText();
    }

    /**
     * 
     * @returns Ip Ranges tab object from WebAdmin SiteLicence Administration Account Page
     */
    //	public WebElement lnkIpRanges(){
    //		return browser().findElement(By.xpath("html/body/table[2]/" +
    //				"tbody/tr/td/table/tbody/tr[1]/td/table/tbody/tr/td[1]/table[1]/tbody/tr[2]/td[10]/a"));
    //	}

    public WebElement lnkIpRanges() {
        return browser().findElement(By.linkText("IP Ranges"));
    }

    /***
     * 
     * @returns Text Box object of Lower IP Address in IP Ranges tab
     */
    public WebElement txtLowerIPAddress() {
        return browser().findElement(By.xpath("html/body/table[2]/"
                + "tbody/tr/td/table/tbody/tr[1]/td/table/tbody/tr/td[1]/table[2]/tbody/tr[4]/td[2]/input"));
    }

    /***
     * 
     * @returns Text Box object of Higher IP Address in IP Ranges tab
     */
    public WebElement txtHighIPAddress() {
        return browser().findElement(By.xpath("html/body/table[2]/"
                + "tbody/tr/td/table/tbody/tr[1]/td/table/tbody/tr/td[1]/table[2]/tbody/tr[5]/td[2]/input"));
    }

    /***
     * 
     * @returns the Text Box object of Description in IP Ranges tab
     */
    public WebElement txtDescription() {
        return browser().findElement(By.xpath("html/body/table[2]/"
                + "tbody/tr/td/table/tbody/tr[1]/td/table/tbody/tr/td[1]/table[2]/tbody/tr[6]/td[2]/input"));
    }

    /***
     * 
     * @returns button object of Add IP Range in IP Ranges tab
     */
    public WebElement btnAddIPRange() {
        return browser().findElement(By.xpath("html/body/table[2]/"
                + "tbody/tr/td/table/tbody/tr[1]/td/table/tbody/tr/td[1]/table[2]/tbody/tr[8]/td/input"));
    }

    /***
     * 
     * @returns Linked Text object Edit in IP Ranges tab
     */
    public WebElement lnkEdit() {
        return browser().findElement(By.linkText("Edit"));
    }

    /***
     * 
     * @returns button Object Delete IP Range in IP Range tab
     */
    public WebElement btnDeleteIPRange() {
        return browser().findElement(By.xpath("html/body/table[2]/"
                + "tbody/tr/td/table/tbody/tr[1]/td/table/tbody/tr/td[1]/table[2]/tbody/tr[7]/td/form/input[2]"));
    }

    /***
     * 
     * @returns button object Return to Main Menu in IP Range tab
     */
    public WebElement btnReturnToMainMenu() {
        return browser().findElement(By.cssSelector("img[alt=\"Return to Main Menu\"]"));
    }

    /**
     * 
     * @returns AOD tab object from WebAdmin SiteLicence Administration Account Page
     */
    public WebElement lnkAOD() {
        return browser().findElement(By.xpath("html/body/table[2]/"
                + "tbody/tr/td/table/tbody/tr[1]/td/table/tbody/tr/td[1]/table[1]/tbody/tr[2]/td[8]/a"));
    }

    /***
     * 
     * @returns lblRemainingAODUnits object from WebAdmin SiteLicence Administration Account Page
     */
    public WebElement lblRemainingAODUnits() {
        return browser().findElement(By.xpath("html/body/table[2]/tbody/tr[1]/td/table/tbody/tr/td[1]/"
                + "table/tbody/tr[1]/td/table[2]/tbody/tr[4]/td[2]"));
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

    public WebElement lnkReturnToMain() {
        return browser().findElement(By.linkText("Return to Main"));

    }

}
