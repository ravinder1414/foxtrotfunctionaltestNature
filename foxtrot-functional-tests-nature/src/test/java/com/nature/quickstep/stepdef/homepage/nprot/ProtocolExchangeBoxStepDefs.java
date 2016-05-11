package com.nature.quickstep.stepdef.homepage.nprot;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import com.nature.quickstep.pageobjects.homepage.nprot.NprotHomepage;

public class ProtocolExchangeBoxStepDefs {
    private NprotHomepage nprot = new NprotHomepage();

    @Given("^user is on Nature Protocols home page$")
    public void userIsOnNatureProtocolsHomePage() throws Throwable {
        nprot.navigateTo();
    }

    @Then("^protocol exchange section appears directly below the first ad space in right column$")
    public void protocolExchangeSectionAppearsDirectlyBelowTheFirstAdSpaceInRightColumn() throws Throwable {
        assertTrue(nprot.protcolsExchangeBoxIsDisplayed());
    }

    @And("^the section contains three most recent articles from protocol exchange$")
    public void theSectionContainsThreeMostRecentArticlesFromProtocolExchange() throws Throwable {
        assertTrue(nprot.containsThreeProtcolsExchangeArticles());
    }

    @And("^the section contains link 'Browse all from Protocol Exchange'$")
    public void theSectionContainsLinkBrowseAllFromProtocolExchange() throws Throwable {
        assertEquals("Browse all from Protocol Exchange", nprot.browseAllProtcolsExchangeLink().getText());
    }

    @When("^user clicks on link to 'Browse all from Protocol Exchange'$")
    public void userClicksOnLinkToBrowseAllFromProtocolExchange() throws Throwable {
        nprot.browseAllProtcolsExchangeLink().click();
    }

    @Then("^they are taken to the protocol exchange home page$")
    public void theyAreTakenToTheProtocolExchangeHomePage() throws Throwable {
        assertTrue(nprot.getCurrentAddress().contains("nature.com/protocolexchange/"));
    }
}
