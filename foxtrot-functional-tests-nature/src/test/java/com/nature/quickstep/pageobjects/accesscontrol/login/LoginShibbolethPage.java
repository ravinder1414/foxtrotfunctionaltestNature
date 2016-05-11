package com.nature.quickstep.pageobjects.accesscontrol.login;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByLinkText;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.nature.quickstep.pageobjects.PageObject;

public class LoginShibbolethPage extends PageObject {

    @Override
    public boolean isPresent() {
        return false;
    }

    @Override
    public void navigateTo() {

    }

    public void validateLoginViaInstitutionLinkOnLoginPage() {
        assertEquals("Login via your institution", lnkLoginViaInstitution().getText());
    }

    public void clickOnLoginViaInstitution() {
        lnkLoginViaInstitution().click();

    }

    public WebElement lnkLoginViaInstitution() {
        ensure().element(By.linkText("Login via your institution")).seconds(15);
        return browser().findElement(By.linkText("Login via your institution"));

    }

    public void fldShibbolethCountry(String country) {
        ensure().element(By.id("loc-select")).seconds(15);
        Select countrydropdown = new Select(browser().findElement(By.id("loc-select")));
        countrydropdown.selectByVisibleText(country);
    }

    public void clickOnButtonGo() {
        btnShibbolethGo().click();

    }

    public WebElement btnShibbolethGo() {
        ensure().element(By.id("login-go")).seconds(15);
        return browser().findElement(By.id("login-go"));
    }

    public void searchPortsmouthUniversityName() {
        txtSearchInstitution().sendKeys("University of Portsmouth");

    }

    public WebElement txtSearchInstitution() {
        ensure().element(By.id("loc-search")).seconds(15);
        return browser().findElement(By.id("loc-search"));
    }

    public void clickOnSearchButton() {
        btnSearchButton().click();

    }

    public WebElement btnSearchButton() {
        ensure().element(By.id("login-search")).seconds(15);
        return browser().findElement(By.id("login-search"));
    }

    public void clickOnPortsmouthUniversityLink() {
        lnkPortsmouthUniversity().click();

    }

    public void validatePortsmouthUniversity() {
        assertEquals("University of Portsmouth", lnkPortsmouthUniversity().getText());
    }

    public WebElement lnkPortsmouthUniversity() {
        ensure().element(By.linkText("University of Portsmouth")).seconds(15);
        return browser().findElement(By.linkText("University of Portsmouth"));
    }

    public void validateTextOnPortsmouthUniversityLoginPage() {
        assertEquals("Please log In", txtOnPortsmouthUniversityLoginPage().getText());
    }

    public WebElement txtOnPortsmouthUniversityLoginPage() {
        ensure().element(By.className("formhead")).seconds(15);
        return browser().findElement(By.className("formhead"));
    }

    public void portsmouthUniversityLogin(String username, String password) {
        txtPortsmouthUniversityUserName().sendKeys(username);
        txtPortsmouthUniversityPassword().sendKeys(password);
        btnPortsmouthUniversityLogin().click();
    }

    public WebElement txtPortsmouthUniversityUserName() {
        ensure().element(By.name("j_username")).seconds(15);
        return browser().findElement(By.name("j_username"));
    }

    public WebElement txtPortsmouthUniversityPassword() {
        ensure().element(By.name("j_password")).seconds(15);
        return browser().findElement(By.name("j_password"));
    }

    public WebElement btnPortsmouthUniversityLogin() {
        ensure().element(By.className("buttontext")).seconds(15);
        return browser().findElement(By.className("buttontext"));
    }

    public void validateNatureHomepage() {
        assertEquals("Subscribe", fldHomepageContent().getText());
    }

    public WebElement fldHomepageContent() {
        ensure().element(ByLinkText.linkText("Subscribe")).seconds(15);

        return browser().findElement(ByLinkText.linkText("Subscribe"));
    }

    public void navigateToNM() throws Exception {
        browser().get(context().getURL("nature.com/nm/journal/v20/n1/full/nm.3418.html"));
    }

    public void validateArticleInstitutionLink() {
        assertEquals("Institutional access", lnkArticleInstitutionAccessLink().getText());

    }

    public void clickOnArticleInstitutionAccessLink() {
        lnkArticleInstitutionAccessLink().click();

    }

    public WebElement lnkArticleInstitutionAccessLink() {
        ensure().element(By.id("access-login-institution")).seconds(15);
        return browser().findElement(By.id("access-login-institution"));
    }

    public void clickOnFullTextLink() {
        lnkFullTextLink().click();

    }

    public WebElement lnkFullTextLink() {

        ensure().element(ByLinkText.linkText("Full text")).seconds(15);
        return browser().findElement(ByLinkText.linkText("Full text"));
    }

    public void validateNMContent() {
        assertEquals("At a glance", fldNMContent().getText());
    }

    public WebElement fldNMContent() {

        ensure().element(By.cssSelector(".at-a-glance-heading")).seconds(15);

        return browser().findElement(By.cssSelector(".at-a-glance-heading"));
    }

}
