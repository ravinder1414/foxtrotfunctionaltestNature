package com.nature.quickstep.pageobjects.accesscontrol;

import static org.junit.Assert.assertEquals;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.nature.quickstep.pageobjects.PageObject;
import com.nature.quickstep.pageobjects.site.webadmin.WebAdminAccountResultsPage;
import com.nature.quickstep.pageobjects.site.webadmin.WebAdminSiteLicenceAdministrationAccountPage;

public class AODAccessControlPage extends PageObject {
    WebAdminSiteLicenceAdministrationAccountPage wadmin = new WebAdminSiteLicenceAdministrationAccountPage();
    WebAdminAccountResultsPage wresults = new WebAdminAccountResultsPage();

    public int CorporateUmmediatedPreviousUints = 0;
    public int CorporateUmmediatedPostUints = 0;
    public int CorporateMediatedPreviousUints = 0;
    public int CorporateMediatedPostUints = 0;
    public int LicencedUmmediatedPreviousUints = 0;
    public int LicencedUmmediatedPostUints = 0;
    public int LicencedMediatedPreviousUints = 0;
    public int LicencedMediatedPostUints = 0;

    /***
     * Corporate UnMediated Pre Setup
     * 
     * @throws Exception
     */
    public void corporateUnmediatedPreSetup() throws Exception {
        wadmin.addIpRange("qatest001@mailinator.com", "password", "Corporate Unmediated");
        CorporateUmmediatedPreviousUints = wadmin.remainingAODunits();
        wadmin.btnReturnToMainMenu().click();
        wadmin.webAdminLogout();
    }

    /***
     * Corporate UnMediated Post Setup
     * 
     * @throws Exception
     */
    public void corporateUnmediatedPostSetup() throws Exception {
        wadmin.removeIpRange("qatest001@mailinator.com", "password");
        wresults.lnkSiteId(wadmin.getSiteId()).click();
        CorporateUmmediatedPostUints = wadmin.remainingAODunits();
        wadmin.btnReturnToMainMenu().click();
        wadmin.webAdminLogout();
    }

    /***
     * Corporate Mediated Pre Setup
     * 
     * @throws Exception
     */
    public void corporateMediatedPreSetup() throws Exception {
        wadmin.addIpRange("qatest002@mailinator.com", "password", "Corporate Mediated");
        CorporateMediatedPreviousUints = wadmin.remainingAODunits();
        wadmin.btnReturnToMainMenu().click();
        wadmin.webAdminLogout();
    }

    /***
     * Corporate Mediated Post Setup
     * 
     * @throws Exception
     */
    public void corporateMediatedPostSetup() throws Exception {
        wadmin.removeIpRange("qatest002@mailinator.com", "password");
        wresults.lnkSiteId(wadmin.getSiteId()).click();
        CorporateMediatedPostUints = wadmin.remainingAODunits();
        wadmin.btnReturnToMainMenu().click();
        wadmin.webAdminLogout();
    }

    /***
     * Licenced UnMediated Pre Setup
     * 
     * @throws Exception
     */
    public void licencedUnmediatedPreSetup() throws Exception {
        wadmin.addIpRange("qatest003@mailinator.com", "password", "Licenced Unmediated");
        LicencedUmmediatedPreviousUints = wadmin.remainingAODunits();
        wadmin.btnReturnToMainMenu().click();
        wadmin.webAdminLogout();
    }

    /***
     * Licenced UnMediated Post Setup
     * 
     * @throws Exception
     */
    public void licencedUnmediatedPostSetup() throws Exception {
        wadmin.removeIpRange("qatest003@mailinator.com", "password");
        wresults.lnkSiteId(wadmin.getSiteId()).click();
        LicencedUmmediatedPostUints = wadmin.remainingAODunits();
        wadmin.btnReturnToMainMenu().click();
        wadmin.webAdminLogout();
    }

    /***
     * Licenced Mediated Pre Setup
     * 
     * @throws Exception
     */
    public void licencedMediatedPreSetup() throws Exception {
        wadmin.addIpRange("qatest004@mailinator.com", "password", "Licenced Mediated");
        LicencedMediatedPreviousUints = wadmin.remainingAODunits();
        wadmin.btnReturnToMainMenu().click();
        wadmin.webAdminLogout();
    }

    /***
     * Licenced Mediated Post Setup
     * 
     * @throws Exception
     */
    public void licencedMediatedPostSetup() throws Exception {
        wadmin.removeIpRange("qatest004@mailinator.com", "password");
        wresults.lnkSiteId(wadmin.getSiteId()).click();
        LicencedMediatedPostUints = wadmin.remainingAODunits();
        wadmin.btnReturnToMainMenu().click();
        wadmin.webAdminLogout();
    }

    /***
     * 
     * @return link object of Access article via NPG Articles on Demand on Standard Atricle Page
     */
    public WebElement lnkAccessArticleViaNPGArticlesOnDemand() {
        return browser().findElement(By.linkText("Access article via NPG Articles on Demand"));
    }

    /***
     * 
     * @return link object of Login via NPG Articles on Demand on SciBX Atricle Page
     */
    public WebElement lnkLoginViaNPGArticlesOnDemand() {
        return browser().findElement(By.linkText("Login via NPG Articles on Demand"));
    }

    /***
     * 
     * @returns textbox object of password on Access via NPG Articles on Demand page
     */
    public WebElement txtMediatedPassword() {
        return browser().findElement(By.xpath("//*[@id='password']"));
    }

    /****
     * 
     * @returns button object of OK button on Access via NPG Articles on Demand page
     */
    public WebElement btnOK() {
        return browser().findElement(By.xpath("//*[@id='login-ppv']"));
    }

    /**
     * Navigates to the Standard Article
     */
    @Override
    public void navigateTo() {

        browser().get(context().getURL("nature.com/nature/" + "journal/v501/n7468/full/nature12566.html"));
    }

    /***
     * Navigates to SciBX article
     * 
     * @throws Exception
     */
    public void navigateToSciBX() throws Exception {
        browser().get(context().getURL("nature.com/scibx/" + "journal/v2/n38/full/scibx.2009.1437.html"));
    }

    /***
     * This method validates that full access given to the article
     * 
     * @param accessAccount
     *            which represents type of AOD Licence product
     */
    public void validateAccess(String accessAccount) {
        assertEquals("Access provided to QA by" + accessAccount, "Access provided to QA by "
                + lblAccessValiadtion().getText());
    }

    /***
     * This method validates that full access given to the article
     * 
     * @param accessAccount
     *            which represents type of AOD Licence product
     */
    public void validateAccessSciBX(String accessAccount) {
        assertEquals("Access provided to QA by" + accessAccount, "Access provided to QA by "
                + lblAccessValiadtionSciBX().getText());
    }

    /***
     * 
     * @returns label object of type of AOD product licence
     */
    public WebElement lblAccessValiadtion() {
        return browser().findElement(By.xpath("//*[@id='foreword']/p/span[4]"));

    }

    /***
     * 
     * @returns label object of type of AOD product licence -SciBX
     */
    public WebElement lblAccessValiadtionSciBX() {
        return browser().findElement(By.xpath("//*[@id='hdr']/div[3]/div/p/span[2]"));

    }

    /***
     * This method validates the AOD units decreased by 1 after accessing an article
     * 
     * @param previous
     * @param post
     */
    public void validateRemainingUnits(int previous, int post) {
        assertEquals(previous, post);
    }

    @Override
    public boolean isPresent() {
        // TODO Auto-generated method stub
        return false;
    }

    /***
     * validates error message in case of access denied
     */
    public void validateAccessDenial() {
        assertEquals("Incorrect password entered", fldErrormessageForWrongPassword().getText());
    }

    /***
     * 
     * @returns error message field object in case access denied
     */
    public WebElement fldErrormessageForWrongPassword() {
        return browser().findElement(By.xpath("//*[@id='log-in']/span[2]"));

    }

}
