package com.nature.quickstep.pageobjects.homepage.nclimate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.nature.quickstep.pageobjects.PageObject;

public class AOPFullPage extends PageObject {

    @Override
    public boolean isPresent() {
        return false;
    }

    @Override
    public void navigateTo() {
        browser().get(context().getURL("nature.com/nclimate/research/aop.html"));
    }

    public WebElement whatIsAOPLink() {
        ensure().element(By.cssSelector("[data-test='what-is-title'] a")).seconds(5);
        return browser().findElement(By.cssSelector("[data-test='what-is-title'] a"));
    }

    public WebElement aOPDiscription() {
        ensure().element(By.cssSelector("[data-test='what-is-desc']")).seconds(10);
        return browser().findElement(By.cssSelector("[data-test='what-is-desc']"));
    }

    public void clickWhatIsAOPLink() {
        whatIsAOPLink().click();
    }
}
