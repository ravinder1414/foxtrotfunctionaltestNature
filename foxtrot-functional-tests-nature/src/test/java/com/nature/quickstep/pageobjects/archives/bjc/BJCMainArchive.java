package com.nature.quickstep.pageobjects.archives.bjc;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.nature.quickstep.pageobjects.PageObject;

public class BJCMainArchive extends PageObject {

    @Override
    public void navigateTo() {
        browser().get(context().getURL("nature.com/bjc/archive"));
    }

    @Override
    public boolean isPresent() {
        return false;
    }

    public WebElement digitalEditionsLink() {
        return browser().findElement(By.xpath("//li[@class='jn-digitaleditions']/a"));
    }

    public void validateLinkNavigatesToDigitalEditionsArchive() {
        assertEquals(context().getURL("nature.com/bjc/digitaleditions/index.html"), browser().getCurrentUrl());
    }

}
