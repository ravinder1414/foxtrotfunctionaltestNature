package com.nature.quickstep.pageobjects.accesscontrol;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By.ByLinkText;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import com.nature.quickstep.pageobjects.PageObject;

public class ReferralAccessPage extends PageObject {

    private static String EYE_JOURNAL_ARTICLE = "eye/journal/v28/n4/full/eye201419a.html";
    private static String GIM_JOURNAL_ARTICLE = "gim/journal/v15/n9/full/gim201330a.html";
    private static String REFERRAL_COOKIE = "referral_cookie";
    private static String GROUP_ID_FOR_RCO_SOCIETY = "12";
    private static String GROUP_ID_FOR_ACMG_SOCIETY = "138";

    @Override
    public boolean isPresent() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public void navigateTo() {

    }

    public void navigateToEyeJournalArticle() throws Exception {
        navigateToArticle(EYE_JOURNAL_ARTICLE);
    }

    public void navigateToGimJournalArticle() throws Exception {
        navigateToArticle(GIM_JOURNAL_ARTICLE);
    }

    private void navigateToArticle(String articlePath) throws Exception {
        browser().get(context().getURL("nature.com/") + articlePath);
    }

    public void verifyAccessPageOfEYEJournalArticle() throws Exception {
        assertEquals("Access", browser().findElement(ByXPath.xpath(".//*[@id='content']/h1[1]")).getText());
    }

    public void verifyAccessPageOfGimJournalArticle() throws Exception {
        assertEquals("view full access options",
                browser().findElement(ByXPath.xpath(".//*[@id='content']/article/div/p/a")).getText());
    }

    public void clickOnRCOSocietyLinkOnArticlePage() throws Exception {
        browser().findElement(ByLinkText.linkText("The Royal College of Ophthalmologists web site.")).click();
    }

    public void clickOnACMGSocietyLinkOnArticlePage() throws Exception {
        String hrefLocation = "https://www.acmg.net";
        String script = "return arguments[0].href = '" + hrefLocation + "'";
        clickOnALinkToRedirect(script, "American College of Medical Genetics and Genomics web site.");
    }

    private void clickOnALinkToRedirect(String script, String linkText) throws Exception {
        WebElement webElement = browser().findElement(ByLinkText.linkText(linkText));
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) browser();
        javascriptExecutor.executeScript(script, webElement);
        webElement.click();
    }

    public void clickOnALinkOnRCOSocietyPageToRedirectToArticlePage() throws Exception {
        String hrefLocation = context().getURL("nature.com/") + EYE_JOURNAL_ARTICLE;
        String script = "return arguments[0].href = '" + hrefLocation + "'";
        clickOnALinkToRedirect(script, "Home");
    }

    public void clickOnALinkOnACMGSocietyPageToRedirectToArticlePage() throws Exception {
        // rfrcke is passed as a parameter for HTTPS Referral Access
        String rfrckeParameter = "rfrcke=https%3A%2F%2Fwww.acmg.net";
        String hrefLocation = context().getURL("nature.com/") + GIM_JOURNAL_ARTICLE + "?" + rfrckeParameter;
        String script = "return arguments[0].href = '" + hrefLocation + "'";
        Thread.sleep(10000);
        clickOnALinkToRedirect(script, "HOME");
    }

    public void verifyFullTextPageOfEyeJournalArticle() throws Exception {
        assertEquals(GROUP_ID_FOR_RCO_SOCIETY, browser().manage().getCookieNamed(REFERRAL_COOKIE).getValue());
        assertEquals("Full text", browser().findElement(ByXPath.xpath(".//*[@id='breadcrumb']/div/span[4]")).getText());

        // delete referral cookie as other scenarios might need a access page for an article.
        browser().manage().deleteCookieNamed(REFERRAL_COOKIE);
    }

    public void verifyFullTextPageOfGimJournalArticle() throws Exception {
        if (context().getURL("nature.com/").startsWith("http://staging-www")) {
            GROUP_ID_FOR_ACMG_SOCIETY = "140";
        }
        assertEquals(GROUP_ID_FOR_ACMG_SOCIETY, browser().manage().getCookieNamed(REFERRAL_COOKIE).getValue());
        assertEquals("Materials and Methods",
                browser().findElement(ByXPath.xpath(".//*[@id='abstract']/div/nav/ul/li[2]/a")).getText());

        // delete referral cookie as other scenarios might need a access page for an article.
        browser().manage().deleteCookieNamed(REFERRAL_COOKIE);
    }

}
