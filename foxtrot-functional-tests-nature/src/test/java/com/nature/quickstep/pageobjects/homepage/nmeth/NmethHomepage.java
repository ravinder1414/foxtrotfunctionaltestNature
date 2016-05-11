package com.nature.quickstep.pageobjects.homepage.nmeth;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.nature.quickstep.pageobjects.homepage.AipHomepage;

public class NmethHomepage extends AipHomepage {

    @Override
    public void navigateTo() {
        browser().get(context().getURL("nature.com/nmeth/index.html"));
    }

    @Override
    public boolean isPresent() {
        return false;
    }

    public WebElement appNotesBox() {
        return browser().findElement(By.cssSelector("[data-test='app-notes-box']"));
    }

    public WebElement featuredAppNoteHeading() {
        return browser().findElement(By.cssSelector("[data-test='featured-app-note-title']"));
    }

    public WebElement featuredAppNote() {
        return browser().findElement(By.cssSelector("[data-test='app-notes-featured']"));
    }

    public WebElement appNotesMonthly() {
        return browser().findElement(By.cssSelector("[data-test='app-notes-monthly']"));
    }

    public WebElement appNotesMonthlyHeading() {
        return browser().findElement(By.cssSelector("[data-test='app-notes-monthly'] h4"));
    }

    public WebElement AppNotesDatabaseLink() {
        return browser().findElement(By.cssSelector("[data-test='app-notes-more']"));
    }

    public boolean containsUptoSixOtherAppNotes() {
        return browser().findElements(By.cssSelector("app-notes-seeAlso")).size() <= 6;
    }
}