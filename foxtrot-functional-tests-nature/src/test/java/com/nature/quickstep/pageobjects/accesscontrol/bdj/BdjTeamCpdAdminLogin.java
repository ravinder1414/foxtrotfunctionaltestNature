package com.nature.quickstep.pageobjects.accesscontrol.bdj;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebElement;

import com.nature.quickstep.pageobjects.PageObject;

public class BdjTeamCpdAdminLogin extends PageObject {

    public static final String LOGIN_COOKIE = "login";
    private static final int wait = 15;

    @Override
    public boolean isPresent() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public void navigateTo() {
        browser().get(context().getURL("nature.com/bdjteamcpd/admin"));
    }

    public WebElement fldEmailAddress() {
        ensure().element(By.id("login-username")).seconds(wait);
        return browser().findElement(By.id("login-username"));
    }

    public WebElement fldPassword() {
        ensure().element(By.id("login-password")).seconds(wait);
        return browser().findElement(By.id("login-password"));
    }

    public WebElement btnLogin() {
        ensure().element(By.id("login-submit")).seconds(wait);
        return browser().findElement(By.id("login-submit"));
    }

    public WebElement lnkLogout() {
        ensure().element(By.className("logoff")).seconds(wait);
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

    public void validateLoginLink() {
        assertEquals("LOGIN", lnkLogin().getText());
    }

    public WebElement lnkLogin() {
        ensure().element(By.xpath(".//*[@id='top']/div[1]/div/div[1]/p/a")).seconds(wait);
        return browser().findElement(By.xpath(".//*[@id='top']/div[1]/div/div[1]/p/a"));
    }
}
