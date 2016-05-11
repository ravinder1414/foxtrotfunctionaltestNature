package com.nature.quickstep.pageobjects.homepage;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.nature.quickstep.pageobjects.PageObject;
import com.nature.quickstep.util.WebDriverUtils;

public class AipHomepage extends PageObject {

    @Override
    public void navigateTo() {

    }

    @Override
    public boolean isPresent() {
        return false;
    }

    public void navigateToJournalHomepage(String journal) {
        browser().get(context().getURL("nature.com/" + journal));
    }

    public void navigateToTabOnJournalHomePage(String journal, String tab) throws Exception {
        browser().get(context().getURL("nature.com/" + journal + "/index.html#" + tab));
        Thread.sleep(5000L);
    }

    public WebElement currentIssueBox() {
        return browser().findElement(By.cssSelector("[data-test='current-issue-box']"));
    }

    public WebElement submitManuscriptBox() {
        return browser().findElement(By.cssSelector("[data-test='submit-manuscript']"));
    }

    public WebElement trendingArticleLink() {
        return browser().findElement(By.linkText("View all Trending Articles"));
    }

    public WebElement whatIsAltmetricScoreLink() {
        return browser().findElement(By.cssSelector("[data-test='what-is-title'] a"));
    }

    public void clickWhatIsAltmetricScoreLink() {
        whatIsAltmetricScoreLink().click();
    }

    public WebElement altmetricText() {
        return browser().findElement(By.cssSelector("[data-test='what-is-desc']"));
    }

    public WebElement altmetricScoreLink() {
        return browser().findElement(By.cssSelector("[data-test='what-is-desc'] a"));
    }

    public WebElement viewAllAOPLink() {
        return browser().findElement(By.cssSelector("[data-test='all-aop']"));
    }

    public WebElement viewAllTendingArticlesLink() {
        return browser().findElement(By.cssSelector("[data-test='all-trending']"));
    }

    public WebElement viewAllMostReadLink() {
        return browser().findElement(By.cssSelector("[data-test='all-most-read']"));
    }

    public WebElement viewAllLatestResearchLink() {
        return browser().findElement(By.cssSelector("[data-test='all-research']"));
    }

    public WebElement viewAllNewsnCommentLink() {
        return browser().findElement(By.cssSelector("[data-test='link-newsandcomment']"));
    }

    public void waitForThePagetoload(String url) throws Exception {
        WebDriverUtils.waitForURLToContainSubstring(browser(), url);
    }

    public String getCurrentAddress() {
        return browser().getCurrentUrl();
    }

    public String viewAllLatestResearchLinkText() {
        return viewAllLatestResearchLink().getText();
    }

    public String viewAllAOPLinkText() {
        return viewAllAOPLink().getText();
    }

    public String viewAllMostReadLinkText() {
        return viewAllMostReadLink().getText();
    }

    public String viewAllTendingArticlesLinkText() {
        return viewAllTendingArticlesLink().getText();
    }

    public String viewAllNewsnCommentLinkText() {
        return viewAllNewsnCommentLink().getText();
    }

    public void clickViewAllLatestResearchLink() {
        viewAllLatestResearchLink().click();
    }

    public void clickViewAllAOPLink() {
        viewAllAOPLink().click();
    }

    public void clickViewAllMostReadLink() {
        viewAllMostReadLink().click();
    }

    public void clickViewAllTendingArticlesLink() {
        viewAllTendingArticlesLink().click();
    }

    public void clickViewAllNewsnCommentLink() {
        viewAllNewsnCommentLink().click();
    }

    //Main Mavigation
    public WebElement homeLink() {
        return browser().findElement(By.cssSelector("[data-test='home']"));
    }

    public WebElement currentIssueLink() {
        return browser().findElement(By.cssSelector("[data-test='currentIssue']"));
    }

    public void clickCurrentIssueLink() throws Exception {
        currentIssueLink().click();
    }

    public WebElement researchMenu() {
        return browser().findElement(By.cssSelector("[data-test='research']"));
    }

    public void clickResearchMenu() throws Exception {
        researchMenu().click();
    }

    public void hoverResearchMenu() throws Exception {
        Actions actions = new Actions(browser());
        actions.moveToElement(researchMenu()).perform();
    }

    public WebElement latestResearchMenu() {
        return browser().findElement(By.cssSelector("[data-test='latestResearch']"));
    }

    public void clickLatestResearchMenu() throws Exception {
        latestResearchMenu().click();
    }

    public void hoverLatestResearchMenu() throws Exception {
        Actions actions = new Actions(browser());
       actions.moveToElement(latestResearchMenu()).perform();
    }

    public WebElement archiveMenu() {
        return browser().findElement(By.cssSelector("[data-test='archive']"));
    }

    public void clickArchiveMenu() throws Exception {
        archiveMenu().click();
    }

    public void hoverArchiveMenu() throws Exception {
        Actions actions = new Actions(browser());
        actions.moveToElement(archiveMenu()).perform();
    }

    public WebElement authorsMenu() {
        return browser().findElement(By.cssSelector("[data-test='authorsPolicy']"));
    }

    public void clickAuthorsMenu() throws Exception {
        authorsMenu().click();
    }

    public void hoverAuthorsMenu() throws Exception {
        Actions actions = new Actions(browser());
        actions.moveToElement(authorsMenu()).perform();
    }

    public WebElement authorsAndRefereesMenu() {
        return browser().findElement(By.cssSelector("[data-test='authors']"));
    }

    public void clickAuthorsAndRefereesMenu() throws Exception {
        authorsAndRefereesMenu().click();
    }

    public void hoverAuthorsAndRefereesMenu() throws Exception {
        Actions actions = new Actions(browser());
        actions.moveToElement(authorsAndRefereesMenu()).perform();
    }

    public WebElement aboutMenu() {
        return browser().findElement(By.cssSelector("[data-test='about']"));
    }

    public void clickAboutMenu() throws Exception {
        aboutMenu().click();
    }

    public void hoverAboutMenu() throws Exception {
        Actions actions = new Actions(browser());
        actions.moveToElement(aboutMenu()).perform();
    }

    public void navigateToLink(String selector) throws Exception {
        ensure().element(By.cssSelector("[data-test='" + selector + "']")).seconds(2);
        browser().findElement(By.cssSelector("[data-test='" + selector + "']")).click();
    }

    public void validateLinkNavigation(String link) throws Exception {
        assertEquals(context().getURL(link), browser().getCurrentUrl());
    }

    public String linkText(String selector) throws Exception {
        ensure().element(By.cssSelector("[data-test='" + selector + "']")).seconds(5);
        return browser().findElement(By.cssSelector("[data-test='" + selector + "']")).getText();
    }

    public void validatelinkText(String selector, String text) throws Exception {
        ensure().element(By.cssSelector("[data-test='" + selector + "']")).seconds(5);
        assertEquals(browser().findElement(By.cssSelector("[data-test='" + selector + "']")).getText(), text);
    }

    public List<WebElement> announcementBoxes() {
        return browser().findElements(By.cssSelector("[data-test='announcement']"));
    }

    public boolean announcementBoxIsPresent() {
        if (announcementBoxes().size() > 0) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * This method validates the character length for the announcements text on an AIP homepages.
     * Takes the maxLength from the feature file and allows for any additional characters added by the truncate tool as
     * the allowableDifference.
     * 
     * @param maxLength
     *            The maximum number of characters allowed for any announcement
     * @param allowableDifference
     *            This is to allow for any additional characters added at the end of the sequence by the truncate tool
     */
    public void validateAnnouncementsTextLength(int maxLength, int allowableDifference) throws Exception {
        List<WebElement> announcementsTexts = browser().findElements(By.cssSelector("[data-test='announcement-text']"));

        for (WebElement announcementsText : announcementsTexts) {
            String characters = announcementsText.getText();
            int charCount = characters.length();
            assertTrue(charCount <= maxLength + allowableDifference);
        }
    }

}
