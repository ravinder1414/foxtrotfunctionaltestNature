package com.nature.quickstep.pageobjects.homepage.nclimate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.nature.quickstep.pageobjects.PageObject;

public class LatestResearchPage extends PageObject {

    @Override
    public void navigateTo() {
        browser().get(context().getURL("nature.com/nclimate/latest-research.html?perpage=50"));
    }

    @Override
    public boolean isPresent() {
        return false;
    }

    public WebElement seeAlsoArticle() {

        return browser()
                .findElement(
                        By.xpath("(//div[@class='standard-teaser news-and-views']/p[@class='see-also'][not(descendant::span/@class='etal')]/a)[1]"));
    }

    public WebElement seeAlsoArticleWithMultipleAuthors() {

        return browser()
                .findElement(
                        By.xpath("(//div[@class='standard-teaser news-and-views']/p[@class='see-also'][descendant::span/@class='etal']/a)[1]"));
    }

    public void clickSeeAlsoArticleLink() {
        seeAlsoArticle().click();
    }

    public void clickSeeAlsoArticleWithMultipleAuthorsLink() {
        seeAlsoArticleWithMultipleAuthors().click();
    }

}
