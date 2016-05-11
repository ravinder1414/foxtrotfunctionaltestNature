package com.nature.quickstep.pageobjects.homepage.nprot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.nature.quickstep.pageobjects.homepage.AipHomepage;

public class NprotHomepage extends AipHomepage {

    @Override
    public void navigateTo() {
        browser().get(context().getURL("nature.com/nprot/index.html"));
    }

    @Override
    public boolean isPresent() {
        return false;
    }

    public WebElement protcolsExchangeBox() {
        return browser().findElement(By.cssSelector("[data-test='protocolexchange-latest']"));
    }

    public boolean protcolsExchangeBoxIsDisplayed() {
        return protcolsExchangeBox().isDisplayed();
    }

    public WebElement protcolsExchangeBoxHeading() {
        return browser().findElement(By.cssSelector("[data-test='protocolexchange-latest'] > h1"));
    }

    public WebElement browseAllProtcolsExchangeLink() {
        return browser().findElement(By.cssSelector("[data-test='all-protocolexchange']"));
    }

    public WebElement protcolsExchangeArticles() {
        return browser().findElement(By.cssSelector("[data-test='protocolexchange-latest'] > article"));
    }

    public boolean containsThreeProtcolsExchangeArticles() {
        return browser().findElements(By.cssSelector("[data-test='protocolexchange-latest'] > article")).size() == 3;
    }

}
