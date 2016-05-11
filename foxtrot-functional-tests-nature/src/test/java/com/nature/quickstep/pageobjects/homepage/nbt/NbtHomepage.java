package com.nature.quickstep.pageobjects.homepage.nbt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.nature.quickstep.pageobjects.homepage.AipHomepage;
import com.nature.quickstep.util.WebDriverUtils;

public class NbtHomepage extends AipHomepage {

    @Override
    public void navigateTo() {
        browser().get(context().getURL("nature.com/nbt/index.html"));
    }

    @Override
    public boolean isPresent() {
        return false;
    }

    public WebElement zMagsBox() {
        return browser().findElement(By.cssSelector("[data-test='zmag-box']"));
    }

    public WebElement bioentrepreneurFeed() {
        return browser().findElement(By.cssSelector("[data-test='bioentrepreneur-latest']"));
    }

    public WebElement bioentrepreneurFeedHeading() {
        return browser().findElement(By.cssSelector("[data-test='bioentrepreneur-latest'] > div > h1"));
    }

    public WebElement moreBioentrepreneurLink() {
        return browser().findElement(By.cssSelector("[data-test='all-bioentrepreneur']"));
    }

    public void validateFullBioentrepreneurPage() throws Exception {
        WebDriverUtils.waitForURLToContainSubstring(browser(), "nature.com/bioent/index.html");
    }
}
