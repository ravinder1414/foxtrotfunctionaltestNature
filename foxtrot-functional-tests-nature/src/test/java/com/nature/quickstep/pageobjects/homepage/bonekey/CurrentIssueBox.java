package com.nature.quickstep.pageobjects.homepage.bonekey;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.nature.quickstep.pageobjects.PageObject;

public class CurrentIssueBox extends PageObject {

    public CurrentIssueBox() {
    }

    @Override
    public void navigateTo() {
        browser().get(context().getURL("nature.com/bonekey/index.html"));

    }

    @Override
    public boolean isPresent() {
        return false;
    }

    public WebElement CurrentIssueCoverLink() {
        return browser()
                .findElement(By.xpath("//div[@class='current-issue-box current-issue-box-with-graphic']/div/a"));
    }

    public WebElement BonekeyReportsLink() {
        return browser().findElement(
                By.xpath("//div[@class='current-issue-box current-issue-box-with-graphic']/div/h1/a"));
    }

    public WebElement CurrentIssueLink() {
        return browser().findElement(
                By.xpath("//div[@class='current-issue-box current-issue-box-with-graphic']/div/ul/li[1]/a"));
    }

    public WebElement SubscribeLink() {
        return browser().findElement(
                By.xpath("//*[@class='current-issue-box current-issue-box-with-graphic']/div/ul/li[2]/a"));
    }

    public WebElement RecommendLink() {
        return browser().findElement(
                By.xpath("//*[@class='current-issue-box current-issue-box-with-graphic']/div/ul/li[3]/a"));
    }

    public void validateCurrentIssueLink() throws Exception {
        assertEquals(context().getURL("nature.com/bonekey/archive/issue/bonekeyreports.html"), browser()
                .getCurrentUrl());
    }

    public void validateBonekeyReportsLink() throws Exception {
        assertEquals(context().getURL("nature.com/bonekey/bonekeyreports/index.html"), browser().getCurrentUrl());
    }

    public void validateSubscribeLink() throws Exception {
        assertEquals(context().getURL("nature.com/bonekey/about/subscription/index.html"), browser().getCurrentUrl());
    }

    public void validateRecommendLink() throws Exception {
        assertEquals(context().getURL("nature.com/librec/svc/request/makeProdRequest?id=bonekeyreports"), browser()
                .getCurrentUrl());
    }

}