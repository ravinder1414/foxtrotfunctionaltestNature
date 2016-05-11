package com.nature.quickstep.pageobjects.accesscontrol;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.nature.quickstep.pageobjects.PageObject;
import com.nature.quickstep.util.WebDriverUtils;

public class MyaccountPageobject extends PageObject {

    public String addressdetailstext = "340 MPS LTD<br>udyog vihar phase 4<br>Gurgaon<br><br>India";

    @Override
    public boolean isPresent() {
        return false;
    }

    @Override
    public void navigateTo() {
        browser().get(context().getURL("nature.com/nams/svc/myaccount"));
    }

    public void MyAccount(String email, String password) throws Exception {
        ensure().element(By.id("email")).seconds(15);
        fldEmailaddress().sendKeys(email);
        fldPassword().sendKeys(password);
        btnLogin().click();
        WebDriverUtils.waitForURLToContainSubstring(browser(), "nature.com/nams/svc/myaccount");
    }

    public WebElement fldEmailaddress() {
        return browser().findElement(By.id("email"));
    }

    public WebElement fldPassword() {
        return browser().findElement(By.id("password"));
    }

    public WebElement btnLogin() {
        return browser().findElement(By.className("button"));
    }

    public void validateProfilePage() {
        assertEquals("Profile", fldProfilePage().getText());
    }

    public WebElement fldProfilePage() {
        String elementLocator = ".//*[@id='content']/h2[1]";
        ensure().element(By.xpath(elementLocator)).seconds(15);
        return browser().findElement(By.xpath(elementLocator));
    }

    public WebElement lnkedit() {
        return browser().findElement(By.xpath(".//*[@id='content']/p[1]/a"));
    }

    public WebElement fldaddressline1() {
        String elementLocator = ".//*[@id='addr1']";
        ensure().element(By.xpath(elementLocator)).seconds(15);
        return browser().findElement(By.xpath(elementLocator));
    }

    public WebElement fldaddressline2() {
        return browser().findElement(By.id("addr2"));
    }

    public WebElement fldcity() {
        return browser().findElement(By.xpath(".//*[@id='city']"));
    }

    public WebElement fldstate() {
        return browser().findElement(By.xpath(".//*[@id='state']"));
    }

    public void country(String value) {
        Select dropdown = new Select(browser().findElement(By.xpath(".//*[@id='country']")));
        dropdown.selectByValue(value);
    }

    public WebElement btnaddressconfirm() {
        return browser().findElement(By.xpath(".//*[@id='content']/form/div/p/input"));
    }

    public void validateaddressProfilePage() {
        assertEquals(addressdetailstext, addressdetails().getText());
    }

    public WebElement addressdetails() {
        String elementLocator = ".//*[@id='content']/dl[1]/dd[2]";
        ensure().element(By.xpath(elementLocator)).seconds(15);
        return browser().findElement(By.xpath(elementLocator));
    }

    public WebElement lnkeditpassword() {
        return browser().findElement(By.xpath(".//*[@id='content']/p[2]/a"));
    }

    public WebElement fldcurrentpassword() {
        String elementLocator = ".//*[@id='current']";
        ensure().element(By.xpath(elementLocator)).seconds(15);
        return browser().findElement(By.xpath(elementLocator));
    }

    public WebElement fldnewpassword() {
        return browser().findElement(By.xpath(".//*[@id='content']/form/dl/dd[2]/input"));
    }

    public WebElement fldconfirmnewpassword() {
        return browser().findElement(By.xpath(".//*[@id='content']/form/dl/dd[3]/input"));
    }

    public WebElement btnpasswordconfirm() {
        return browser().findElement(By.xpath(".//*[@id='content']/form/p/input"));
    }

    public void validatePasswordchange() {
        assertEquals("Password changed", fldchangepassword().getText());
    }

    public WebElement fldchangepassword() {
        String elementLocator = ".//*[@id='content']/h1";
        ensure().element(By.xpath(elementLocator)).seconds(15);
        return browser().findElement(By.xpath(elementLocator));
    }

    public void navigatetoemail() {
        browser().get("http://mailinator.com/inbox.jsp?to=ravinder");
    }

    public WebElement lnkconformation() {
        String elementLocator = ".//*[@id='mailcontainer']/li[1]/a/div[1]";
        ensure().element(By.xpath(elementLocator)).seconds(15);
        return browser().findElement(By.xpath(elementLocator));
    }

    public WebElement lnkverify() {
        return browser().findElement(By.xpath(".//*[@id='mailshowdiv']/div[3]/div/div/a"));
    }

    public WebElement lnkadditionalinformationedit() {
        return browser().findElement(By.xpath(".//*[@id='content']/p[4]/a"));
    }

    public void industry(String value) {
        String elementLocator = ".//*[@id='place']";
        ensure().element(By.xpath(elementLocator)).seconds(15);
        Select dropdown = new Select(browser().findElement(By.xpath(elementLocator)));
        dropdown.selectByValue(value);
    }

    public void Areaofinterest(String value) {
        Select dropdown = new Select(browser().findElement(By.xpath(".//*[@id='field']")));
        dropdown.selectByValue(value);
    }

    public void Speciality(String value) {
        Select dropdown = new Select(browser().findElement(By.xpath(".//*[@id='firstspeciality']")));
        dropdown.selectByValue(value);
    }

    public void Jobtitle(String position) {
        Select dropdown = new Select(browser().findElement(By.xpath(".//*[@id='field']")));
        dropdown.selectByVisibleText(position);
    }

    public WebElement fldAffilation() {
        return browser().findElement(By.xpath(".//*[@id='content']/form/dl/dd[5]/input"));
    }

    public void validateJobtitle() {
        assertEquals("Business Consultant", fldJobtitle().getText());
    }

    public WebElement fldJobtitle() {
        return browser().findElement(By.xpath(".//*[@id='content']/dl[4]/dd[4]"));
    }

    public void validateAreaofinterest() {
        assertEquals("Engineering", fldareaofinterest().getText());
    }

    public WebElement fldareaofinterest() {
        String elementLocator = ".//*[@id='content']/dl[4]/dd[2]";
        ensure().element(By.xpath(elementLocator)).seconds(15);
        return browser().findElement(By.xpath(elementLocator));
    }

    public WebElement btnworkdetailsconfirm() {
        return browser().findElement(By.xpath(".//*[@id='content']/form/p/input"));
    }

    public WebElement lnkAlerts() {
        return browser().findElement(By.xpath(".//*[@id='main-navigation']/li[2]/a/span"));
    }

    public WebElement lnkmodify() {
        String elementLocator = ".//*[@id='content']/p[2]/a";
        ensure().element(By.xpath(elementLocator)).seconds(15);
        return browser().findElement(By.xpath(elementLocator));
    }

    public WebElement natureealerts() {
        return browser().findElement(By.xpath(".//*[@id='alert-1-1']"));
    }

    public WebElement btnconfirm() {
        return browser().findElement(By.className("button"));
    }

    public void validateselectedalearts() {
        assertEquals("Nature", selectedalearts().getText());
    }

    public WebElement selectedalearts() {
        return browser().findElement(By.xpath(".//*[@id='content']/dl/dd[1]/ul/li[1]"));
    }

    public void validatedeselectedalearts() {
        assertEquals("You are currently not signed up to receive any NPG Updates and Alerts.", deselectedalearts()
                .getText());
    }

    public WebElement deselectedalearts() {
        return browser().findElement(By.xpath(".//*[@id='content']/p[1]"));
    }

    public WebElement lnksubscription() {
        return browser().findElement(By.xpath(".//*[@id='main-navigation']/li[3]/a/span"));
    }

    public void validateSubscriptionPage() {
        assertEquals("Subscriptions", subscriptiondetails().getText());
    }

    public WebElement subscriptiondetails() {
        return browser().findElement(By.xpath(".//*[@id='content']/div[1]/h2"));
    }

    public void clickOnAlertTab() {
        lnkAlerts().click();
    }

    public void validateShowEAlertPage() {
        ensure().url().contains("nature.com/nams/svc/myaccount/show/alerts").seconds(15);
    }

    public void clickOnModifyButton() {
        lnkmodify().click();
        validateEditEAlertPage();
    }

    public void validateEditEAlertPage() {
        ensure().element(By.xpath(".//*[@id='content']/h1")).seconds(15);
        assertEquals("Alerts", browser().findElement(By.xpath(".//*[@id='content']/h1")).getText());
        assertEquals(context().getURL("nature.com/nams/svc/myaccount/edit/alerts"), browser().getCurrentUrl());
    }

    public void deSelectAllEAlertsCheckBoxes() {
        clickOnAlertTab();
        clickOnModifyButton();
        List<WebElement> eAlertsList = getAllEAlerts();
        for (WebElement eAlert : eAlertsList) {
            if (eAlert.isSelected()) {
                eAlert.click();
            }
        }
        btnconfirm().click();
    }

    public List<WebElement> getAllEAlerts() {
        return browser().findElement(By.id("content")).findElement(By.id("free-alerts"))
                .findElements(By.tagName("input"));
    }
}
