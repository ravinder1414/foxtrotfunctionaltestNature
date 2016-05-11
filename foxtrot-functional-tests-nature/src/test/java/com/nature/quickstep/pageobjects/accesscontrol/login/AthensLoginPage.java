package com.nature.quickstep.pageobjects.accesscontrol.login;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.nature.quickstep.pageobjects.PageObject;
import com.nature.quickstep.util.WebDriverUtils;

public class AthensLoginPage extends PageObject {

    @Override
    public boolean isPresent() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public void navigateTo() {
        browser().get(context().getURL("nature.com/foxtrot/svc/login"));
    }

    public void navigateToAPS() throws Exception {
        browser().get(context().getURL("nature.com/aps/journal/v34/n10/full/aps201393a.html"));
    }

    public WebElement lnkLoginViaAthens() {
        return browser().findElement(By.xpath(".//*[@id='extranav']/div/div[1]/ul/li[5]/p[2]/a"));

    }

    public void validateAthensLoginPage() {
        assertEquals("Authentication Point", fldAthensLoginpage().getText());
    }

    public WebElement fldAthensLoginpage() {
        return browser().findElement(By.xpath(".//*[@id='c2']/div/div[2]/div/h2/big"));
    }

    public void loginUsingAthensAccount(String username, String password) throws Exception {

        fldUsername().sendKeys(username);
        fldPassword().sendKeys(password);
        btnLogin().click();

        WebDriverUtils.waitForURLToContainSubstring(browser(), "nature.com");
    }

    public WebElement fldUsername() {
        return browser().findElement(By.id("ath_uname"));
    }

    public WebElement fldPassword() {
        return browser().findElement(By.id("ath_passwd"));
    }

    public WebElement btnLogin() {
        return browser().findElement(By.name("submit"));
    }

    public void validateNatureHomepage() {
        assertEquals("Subscribe", fldHomepageContent().getText());
    }

    public WebElement fldHomepageContent() {
        return browser().findElement(By.xpath(".//*[@id='hdr']/div[2]/ul/li[4]/a"));
    }

    public void validatefulltextcontent() {
        assertEquals("Right ventricular hypertrophy and pulmonary arterial remodeling", fldfulltextcontent().getText());
    }

    public WebElement fldfulltextcontent() {
        return browser().findElement(By.xpath(".//*[@id='Materials-and-methods']/h4[4]"));

    }
}
