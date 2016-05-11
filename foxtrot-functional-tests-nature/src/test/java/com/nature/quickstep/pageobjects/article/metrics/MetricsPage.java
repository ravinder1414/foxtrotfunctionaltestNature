package com.nature.quickstep.pageobjects.article.metrics;

import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.nature.quickstep.pageobjects.PageObject;

public class MetricsPage extends PageObject {

    @Override
    public boolean isPresent() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public void navigateTo() {
        // TODO Auto-generated method stub
    }

    public void navigateToArticlePage(String articleURL) throws Exception {
        browser().get(context().getURL("nature.com/" + articleURL));
    }

    public void navigateToMetricsPage() {
        ensure().element(By.linkText("Article metrics")).seconds(15);
        lnkArticleMetrics().click();
    }

    public void validateCitations() {
        ensure().element(By.xpath("//div[@class='altmetric-key']/ul/li")).seconds(15);
        assertNotNull(findCrossrefCitationCount().getText());
        assertNotNull(findScopusCitationCount().getText());
    }

    public void validateArticleMetrics() {
        assertNotNull(findByAmsScoreImage());
    }

    public WebElement findCrossrefCitationCount() {
        return browser().findElement(By.xpath("//a[@data-citation-service='crossref']//div[@class='citation-count']"));
    }

    private WebElement findScopusCitationCount() {
        return browser().findElement(By.xpath("//a[@data-citation-service='scopus']//div[@class='citation-count']"));
    }

    private List<WebElement> findByAmsScoreImage() {
        return browser().findElements(By.xpath("//div[@class='altmetric-key']/ul/li"));
    }

    public WebElement lnkArticleMetrics() {
        return browser().findElement(By.linkText("Article metrics"));
    }

}
