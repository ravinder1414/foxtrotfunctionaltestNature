package com.nature.quickstep.pageobjects.accesscontrol.login;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebElement;

import com.nature.quickstep.pageobjects.PageObject;
import com.nature.quickstep.util.WebDriverUtils;

public class Loginviacookies extends PageObject {
    public static final String LOGIN_COOKIE = "login";

    @Override
    public boolean isPresent() {
        return false;
    }

    @Override
    public void navigateTo() {
        browser().get(context().getURL("nature.com"));
    }

    public WebElement lnklogin() {
        ensure().element(By.className("login")).seconds(15);
        return browser().findElement(By.className("login"));
    }

    public void Loginpage(String email, String password) throws Exception {
        ensure().element(By.id("login-username")).seconds(15);
        fldEmailaddress().sendKeys(email);
        fldPassword().sendKeys(password);
        btnLogin().click();
        WebDriverUtils.waitForURLToContainSubstring(browser(), "nature.com");
    }

    public WebElement fldEmailaddress() {
        ensure().element(By.id("login-username")).seconds(15);
        return browser().findElement(By.id("login-username"));
    }

    public WebElement fldPassword() {
        ensure().element(By.id("login-password")).seconds(15);
        return browser().findElement(By.id("login-password"));
    }

    public WebElement btnLogin() {
        ensure().element(By.id("login-submit")).seconds(15);
        return browser().findElement(By.id("login-submit"));
    }

    public void validatelnklogout() {
        assertEquals("My account", fldlnklogout().getText());
    }

    public WebElement fldlnklogout() {
        String elementLocator = ".//*[@id='hdr']/div[2]/ul/li[1]/a";
        ensure().element(By.xpath(elementLocator)).seconds(15);
        return browser().findElement(By.xpath(elementLocator));
    }

    public WebElement lnksubscription() {
        ensure().element(By.xpath(".//*[@id='hdr']/div[2]/ul/li[4]/a")).seconds(15);
        return browser().findElement(By.xpath(".//*[@id='hdr']/div[2]/ul/li[4]/a"));
    }

    public void validatesubscriptionlnklogout() {
        assertEquals("Logout", fldsubscriptionlnklogout().getText());
    }

    public WebElement fldsubscriptionlnklogout() {
        ensure().element(By.xpath(".//*[@id='foreword']/nav/ul/li[3]/a")).seconds(15);
        return browser().findElement(By.xpath(".//*[@id='foreword']/nav/ul/li[3]/a"));
    }

    public void navigateTonatureevents() throws Exception {
        browser().get(context().getURL("nature.com/natureevents/science/"));
    }

    public WebElement lnkmyprofile() {
        ensure().element(By.xpath(".//*[@id='hdr']/div[2]/div[1]/ul/li[1]/a")).seconds(15);
        return browser().findElement(By.xpath(".//*[@id='hdr']/div[2]/div[1]/ul/li[1]/a"));
    }

    public void validatemyprofilepage() {
        assertEquals("My profile", fldmyprofile().getText());
    }

    public WebElement fldmyprofile() {
        ensure().element(By.xpath(".//*[@id='content-inner']/h2")).seconds(15);
        return browser().findElement(By.xpath(".//*[@id='content-inner']/h2"));
    }

    public void navigateTonaturejobs() throws Exception {
        browser().get(context().getURL("nature.com/naturejobs/science/"));
    }

    public WebElement lnknaturejobsmyaccount() {
        ensure().element(By.className("user-menu").className("account").tagName("a")).seconds(15);
        return browser().findElement(By.className("user-menu")).findElement(By.className("account"))
                .findElement(By.tagName("a"));
    }

    public void validatenaturejobsmyprofile() {
        assertEquals("Account details", fldaccountdetails().getText());
    }

    public WebElement fldaccountdetails() {
        ensure().element(By.xpath(".//*[@id='content']/div[2]/div[2]/h2[1]")).seconds(15);
        return browser().findElement(By.xpath(".//*[@id='content']/div[2]/div[2]/h2[1]"));
    }

    public void navigateTonaturenews() throws Exception {
        browser().get(context().getURL("nature.com/news/"));
    }

    public WebElement lnknewsmyaccount() {
        ensure().element(By.xpath(".//*[@id='foreword']/nav/ul/li[4]/a")).seconds(15);
        return browser().findElement(By.xpath(".//*[@id='foreword']/nav/ul/li[4]/a"));
    }

    public void validatemyprofile() {
        assertEquals("Profile", fldprofile().getText());
    }

    public WebElement fldprofile() {
        ensure().element(By.xpath(".//*[@id='content']/h1")).seconds(15);
        return browser().findElement(By.xpath(".//*[@id='content']/h1"));

    }

    public WebElement lnkNewsLogout() {
        ensure().element(By.xpath(".//*[@id='foreword']/nav/ul/li[3]/a")).seconds(15);
        return browser().findElement(By.xpath(".//*[@id='foreword']/nav/ul/li[3]/a"));
    }

    public void clickOnLogoutLink() {
        lnkNewsLogout().click();
    }

    public void validateUserNotLoggedIN() {
        Cookie loginCookie = browser().manage().getCookieNamed(LOGIN_COOKIE);
        assertNull(loginCookie);
    }

}
