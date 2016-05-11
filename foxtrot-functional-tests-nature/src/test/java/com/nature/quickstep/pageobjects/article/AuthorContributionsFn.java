package com.nature.quickstep.pageobjects.article;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.nature.quickstep.pageobjects.PageObject;

public class AuthorContributionsFn extends PageObject {

    @Override
    public boolean isPresent() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public void navigateTo() {
        browser()
                .get(context().getURL("nature.com/bonekeyreports/2013/131204/bonekey2013190/full/bonekey2013190.html"));
    }

    public WebElement contributionStatement1() {
        return browser().findElement(By.cssSelector("#ft-n1 [data-test='af-section-statement']"));
    }

    public WebElement contributionStatement2() {
        return browser().findElement(By.cssSelector("#ft-n2 [data-test='af-section-statement']"));
    }

    public WebElement contributedAuthor1() {
        return browser().findElement(By.linkText("Matthew A Brown"));
    }

    public WebElement contributedAuthor2() {
        return browser().findElement(By.linkText("Aideen M McInerney-Leo"));
    }

    public WebElement contributionPopup() {
        return browser().findElement(By.cssSelector("[data-test='af-popup']"));
    }

    public WebElement popupStatement() {
        return browser().findElement(By.cssSelector("[data-test='af-popup-statement']"));
    }

    public WebElement popupAuthors() {
        return browser().findElement(By.cssSelector("[data-test='af-popup-authors']"));
    }

    public WebElement footnotesAuthors1() {
        return browser().findElement(By.cssSelector("#ft-n1 [data-test='af-section-authors']"));
    }

    public WebElement footnotesAuthors2() {
        return browser().findElement(By.cssSelector("#ft-n2 [data-test='af-section-authors']"));
    }

}
