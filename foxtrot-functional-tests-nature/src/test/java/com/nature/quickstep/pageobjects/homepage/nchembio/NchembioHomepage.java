package com.nature.quickstep.pageobjects.homepage.nchembio;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.nature.quickstep.pageobjects.homepage.AipHomepage;

public class NchembioHomepage extends AipHomepage {

    @Override
    public void navigateTo() {
        browser().get(context().getURL("nature.com/nchembio/index.html"));
    }

    @Override
    public boolean isPresent() {
        return false;
    }

    public WebElement currentIssueLink() {
        return browser().findElement(By.cssSelector("[data-test='current-issue-link']"));
    }

    public WebElement subscribeLink() {
        return browser().findElement(By.cssSelector("[data-test='subscribe-link']"));
    }

    public WebElement libraryLink() {
        return browser().findElement(By.cssSelector("[data-test='library-link']"));
    }

    public WebElement ealertLink() {
        return browser().findElement(By.cssSelector("[data-test='ealert-link']"));
    }

    public WebElement rssLink() {
        return browser().findElement(By.cssSelector("[data-test='rss-link']"));
    }

    public WebElement facebookLink() {
        return browser().findElement(By.cssSelector("[data-test='facebook-link']"));
    }

    public WebElement twitterLink() {
        return browser().findElement(By.cssSelector("[data-test='twitter-link']"));
    }

}
