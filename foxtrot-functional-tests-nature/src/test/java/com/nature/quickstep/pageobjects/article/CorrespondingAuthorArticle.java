package com.nature.quickstep.pageobjects.article;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.nature.quickstep.pageobjects.PageObject;

public class CorrespondingAuthorArticle extends PageObject {

    @Override
    public boolean isPresent() {
        return false;
    }

    @Override
    public void navigateTo() {
        browser()
                .get(context().getURL("nature.com/bonekeyreports/2013/131204/bonekey2013190/full/bonekey2013190.html"));
    }

    public WebElement corresAuthorLabel() {
        return browser().findElement(By.cssSelector("[data-test='corres-label']"));
    }

    public WebElement corresAuthor() {
        return browser().findElement(By.linkText("Emma L Duncan"));
    }

    public void clickCorresAuthor() {
        corresAuthor().click();
    }

    public WebElement contactCorresAuthorLink() {
        return browser().findElement(By.cssSelector("[data-test='corres-contact']"));
    }

}
