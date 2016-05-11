package com.nature.quickstep.pageobjects.homepage;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.nature.quickstep.pageobjects.PageObject;
import com.nature.quickstep.util.WebDriverUtils;

public class HomePage extends PageObject {

    /**
     * Navigates to the Nature homepage.
     * 
     * @throws Exception
     */
    @Override
    public void navigateTo() {
        browser().get(context().getURL("nature.com/"));
    }

    /**
     * Returns a handle to the log in link.
     * 
     * @return <code>WebElement</code> as a handle to the log in link.
     */
    public WebElement lnkLogin() {
        return browser().findElement(By.className("login"));
    }

    public void clickOnLoginLink() {
        lnkLogin().click();
    }

    /**
     * Checks to see whether the element displaying the cover of the current
     * Nature issue is present.
     * 
     * @return <code>true</code> if present, <code>false</code> if not.
     */
    public boolean isCoverPresent() {
        return browser().findElements(By.className("cover-link")).size() == 1;
    }

    /**
     * Checks to see whether the element displaying the inside nature section is
     * present.
     * 
     * @return <code>true</code> if present, <code>false</code> if not.
     */
    public boolean isInsideNaturePresent() {
        return browser().findElements(By.xpath("//h2[text() = 'Inside nature.com']")).size() == 1;
    }

    /**
     * Checks to see whether the element displaying the news section is present.
     * 
     * @return <code>true</code> if present, <code>false</code> if not.
     */
    public boolean isNewsSectionPresent() {
        return browser().findElements(By.className("news")).size() == 1;
    }

    /**
     * Returns a handle to the log in link.
     * 
     * @return <code>WebElement</code> as a handle to the log in link.
     */
    public WebElement lnkLogIn() {
        ensure().element(By.className("login")).seconds(15);
        return browser().findElement(By.className("login"));
    }

    @Override
    public boolean isPresent() {
        // TODO Auto-generated method stub
        return false;
    }

    /**
     * Returns a handle to the register link.
     * 
     * @return <code>WebElement</code> as a handle to the register link.
     */
    public WebElement lnkRegister() {
        return browser().findElement(By.linkText("Register"));
    }

    /**
     * This method validates weather we are on nature.com home page or not
     * 
     * @throws Exception
     */
    public void validateNatureHomePage() throws Exception {
        WebDriverUtils.waitForURLToContainSubstring(browser(), "nature.com");
    }

    public void navigateToJournalHomePage(String journal, String title) throws Exception {
        browser().get(context().getURL("nature.com/" + journal + "/index.html"));
        validateJournalHomePage(journal, title);
    }

    public void validateJournalHomePage(String journal, String title) throws Exception {
        assertEquals(title, browser().getTitle());
        WebDriverUtils.waitForURLToContainSubstring(browser(), "nature.com/" + journal);
    }

}
