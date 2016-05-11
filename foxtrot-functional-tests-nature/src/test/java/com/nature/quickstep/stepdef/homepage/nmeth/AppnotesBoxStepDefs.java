package com.nature.quickstep.stepdef.homepage.nmeth;

import com.nature.quickstep.pageobjects.homepage.nmeth.NmethHomepage;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class AppnotesBoxStepDefs {

    private NmethHomepage homepage = new NmethHomepage();

    @Given("^I am on Nature Methods homepage$")
    public void iAmOnNatureMethodsHomepage() throws Throwable {
        homepage.navigateTo();
    }

    @Then("^application notes box appears in the right hand column$")
    public void applicationNotesBoxAppearsInTheRightHandColumn() throws Throwable {
        homepage.appNotesBox().isDisplayed();
    }

    @And("^contains one featured appnote under a heading 'Featured Application Note'$")
    public void containsOneFeaturedAppnoteUnderAHeadingFeaturedApplicationNote() throws Throwable {
        assertEquals("Featured Application Note", homepage.featuredAppNoteHeading().getText());
        homepage.featuredAppNote();
    }

    @And("^can contain upto six other appnotes$")
    public void canContainUptoOtherAppnotes() throws Throwable {
        assertTrue(homepage.containsUptoSixOtherAppNotes());
    }

    @And("^has a link to application notes database page$")
    public void hasALinkToApplicationNotesDatabasePage() throws Throwable {
        assertEquals("Go to the Application Notes database", homepage.AppNotesDatabaseLink().getText());
        homepage.AppNotesDatabaseLink().click();
        assertTrue(homepage.getCurrentAddress().contains("nature.com/app_notes/nmeth/index.html"));
    }
}
