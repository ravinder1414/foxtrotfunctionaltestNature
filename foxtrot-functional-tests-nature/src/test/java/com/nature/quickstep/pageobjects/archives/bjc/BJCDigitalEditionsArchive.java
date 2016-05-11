package com.nature.quickstep.pageobjects.archives.bjc;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.nature.quickstep.pageobjects.PageObject;

public class BJCDigitalEditionsArchive extends PageObject {

    @Override
    public void navigateTo() {
        browser().get(context().getURL("nature.com/bjc/digitaleditions/index.html"));
    }

    @Override
    public boolean isPresent() {
        return false;
    }

    public WebElement indvidualDigitalEdtionLink() {
        return browser().findElement(By.xpath(".//*[@id='y2013']/ul/li[1]//td[1]/a"));
    }

    public void validateUserNavigatesToLoginPage() {
        assertEquals(context().getURL("nature.com/foxtrot/svc/login"), browser().getCurrentUrl());
    }
}
