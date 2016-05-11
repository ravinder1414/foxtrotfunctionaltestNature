package com.nature.quickstep.pageobjects.accesscontrol.login;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertNotNull;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebElement;

import com.nature.quickstep.pageobjects.PageObject;

public class NatureLogin extends PageObject {

    public static final String LOGIN_COOKIE = "login";

    @Override
    public void navigateTo() {
        browser().get(context().getURL("nature.com/foxtrot/svc/login"));
    }

    @Override
    public boolean isPresent() {
        return false;
    }

    public WebElement fldEmailAddress() {
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

    public WebElement lnkLogout() {
        ensure().element(By.className("logoff")).seconds(15);
        return browser().findElement(By.className("logoff"));
    }

    public void loginUser(String email, String password) {
        fldEmailAddress().clear();
        fldPassword().clear();
        fldEmailAddress().sendKeys(email);
        fldPassword().sendKeys(password);
        btnLogin().click();
    }

    public void validateUserSuccessfullyLoggedIN() {
        Cookie loginCookie = browser().manage().getCookieNamed(LOGIN_COOKIE);
        assertNotNull(loginCookie);
    }

    public void clickOnLogoutLink() {
        lnkLogout().click();
    }

    public void validateUserNotLoggedIN() {
        Cookie loginCookie = browser().manage().getCookieNamed(LOGIN_COOKIE);
        assertNull(loginCookie);
    }

    public WebElement lnkAthensLogin() {
        return browser().findElement(By.linkText("Login via Athens"));
    }

}
