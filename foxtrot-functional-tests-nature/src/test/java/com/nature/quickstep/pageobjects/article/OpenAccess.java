package com.nature.quickstep.pageobjects.article;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.nature.quickstep.pageobjects.PageObject;

public class OpenAccess extends PageObject {

    @Override
    public void navigateTo() {
        browser().get(context().getURL("nature.com/ncomms"));

    }

    @Override
    public boolean isPresent() {
        return false;
    }

    public WebElement openLabelArticle() {
        return browser().findElement(By.xpath("//abbr[@class='open-access']"));

    }

    public boolean openArticlesArePresent() {
        return browser().findElements(By.className("open-access")).size() == 1;
    }

    public WebElement openLabel() {
        return browser().findElement(By.xpath("(//a[following-sibling::abbr[@class='open-access']])[1]"));

    }

    public void openLabelText() {
        assertEquals("OPEN", openLabelArticle().getText());
    }
}
