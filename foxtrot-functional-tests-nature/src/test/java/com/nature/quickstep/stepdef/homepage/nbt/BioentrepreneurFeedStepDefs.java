package com.nature.quickstep.stepdef.homepage.nbt;

import com.nature.quickstep.pageobjects.homepage.nbt.NbtHomepage;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BioentrepreneurFeedStepDefs {
    private NbtHomepage nbt = new NbtHomepage();

    @Then("^The Bioentrepreneur Feed appears on the page$")
    public void theBioentrepreneurFeedAppearsOnThePage() throws Throwable {
        assertTrue(nbt.bioentrepreneurFeed().isDisplayed());
    }

    @And("^The should display the heading 'Latest from bioentrepreneur'$")
    public void theShouldDisplayTheHeadingLatestFromBioentrepreneur() throws Throwable {
        assertEquals("Latest from bioentrepreneur", nbt.bioentrepreneurFeedHeading().getText());
    }

    @And("^Should have a link 'Browse all from Bioentrepreneur'$")
    public void shouldHaveALinkBrowseAllFromBioentrepreneur() throws Throwable {
        assertTrue(nbt.moreBioentrepreneurLink().isDisplayed());
    }

    @When("^The user clicks on the link$")
    public void theUserClicksOnTheLink() throws Throwable {
        nbt.moreBioentrepreneurLink().click();
    }

    @Then("^The user is navigated to the full Bioentrepreneur page$")
    public void theUserIsNavigatedToTheFullBioentrepreneurPage() throws Throwable {
        nbt.validateFullBioentrepreneurPage();
        assertTrue(nbt.getCurrentAddress().contains("nature.com/bioent/index.html"));
    }

}
