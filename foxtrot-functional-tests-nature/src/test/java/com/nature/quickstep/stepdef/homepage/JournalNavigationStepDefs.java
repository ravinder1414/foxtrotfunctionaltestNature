package com.nature.quickstep.stepdef.homepage;

import static org.junit.Assert.assertEquals;

import com.nature.quickstep.pageobjects.homepage.AipHomepage;
import com.nature.quickstep.pageobjects.homepage.nclimate.NclimateHomepage;
import com.nature.quickstep.pageobjects.homepage.nchembio.NchembioHomepage;
import com.nature.quickstep.pageobjects.homepage.nmeth.NmethHomepage;
import com.nature.quickstep.pageobjects.homepage.nbt.NbtHomepage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class JournalNavigationStepDefs {

    private AipHomepage nav = new AipHomepage();
    private NclimateHomepage nclimate = new NclimateHomepage();
    private NchembioHomepage nchembio = new NchembioHomepage();
    private NmethHomepage nmeth = new NmethHomepage();
    private NbtHomepage nbt = new NbtHomepage();

    @Given("^the user is browsing the Nclimate homepage$")
    public void theUserIsBrowsingTheNclimateHomepage() throws Throwable {
        nclimate.navigateTo();
    }

    @Given("^the user is browsing the nchembio homepage$")
    public void theUserIsBrowsingTheNchembioHomepage() throws Throwable {
        nchembio.navigateTo();
    }

    @Given("^the user is browsing the nmeth homepage$")
    public void theUserIsBrowsingTheNmethHomepage() throws Throwable {
        nmeth.navigateTo();
    }

    @Given("^the user is browsing the nbt homepage$")
    public void theUserIsBrowsingTheNbtHomepage() throws Throwable {
        nbt.navigateTo();
    }

    @Given("^the user is browsing the \"([^\"]*)\" homepage$")
    public void theUserIsBrowsingTheHomepage(String journal) throws Throwable {
        nav.navigateToJournalHomepage(journal);
    }

    @When("^the link \"([^\"]*)\" text reads \"([^\"]*)\"$")
    public void theLinkTextReads(String selector, String text) throws Throwable {
        assertEquals(text, nav.linkText(selector));
    }

    @And("^the user clicks on link \"([^\"]*)\"$")
    public void theUserClicksOnLink(String selector) throws Throwable {
        nav.navigateToLink(selector);
    }

    @Then("^the user navigates to \"([^\"]*)\" page$")
    public void theUserNavigatesToPage(String link) throws Throwable {
        nav.validateLinkNavigation(link);
    }

    @When("^the user clicks on the 'Research' dropdown menu$")
    public void theUserClicksOnTheResearchDropdownMenu() throws Throwable {
        nav.clickResearchMenu();
    }

    @When("^the user clicks on the 'Latest research' dropdown menu$")
    public void theUserClicksOnTheLatestResearchDropdownMenu() throws Throwable {
        nav.clickLatestResearchMenu();
    }

    @When("^the user clicks on the 'Archive' dropdown menu$")
    public void theUserClicksOnTheArchiveDropdownMenu() throws Throwable {
        nav.clickArchiveMenu();
    }

    @When("^the user clicks on the 'For authors' dropdown menu$")
    public void theUserClicksOnTheForAuthorsDropdownMenu() throws Throwable {
        nav.clickAuthorsMenu();
    }

    @When("^the user clicks on the 'Authors & referees' dropdown menu$")
    public void theUserClicksOnAuthorsRefereesDropdownMenu() throws Throwable {
        nav.clickAuthorsAndRefereesMenu();
    }

    @When("^the user clicks on the 'About the journal' dropdown menu$")
    public void theUserClicksOnTheAboutTheJournalDropdownMenu() throws Throwable {
        nav.clickAboutMenu();
    }

    @When("^the user hovers on the 'Research' dropdown menu$")
    public void theUserHoversOnTheResearchDropdownMenu() throws Throwable {
        nav.hoverResearchMenu();
    }

    @When("^the user hovers on the 'Latest research' dropdown menu$")
    public void theUserHoversOnTheLatestResearchDropdownMenu() throws Throwable {
        nav.hoverLatestResearchMenu();
    }

    @When("^the user hovers on the 'Archive' dropdown menu$")
    public void theUserHoversOnTheArchiveDropdownMenu() throws Throwable {
        nav.hoverArchiveMenu();
    }

    @When("^the user hovers on the 'For authors' dropdown menu$")
    public void theUserHoversOnTheForAuthorsDropdownMenu() throws Throwable {
        nav.hoverAuthorsMenu();
    }

    @When("^the user hovers on the 'Authors & referees' dropdown menu$")
    public void theUserHoversOnTheAuthorsRefereesDropdownMenu() throws Throwable {
        nav.hoverAuthorsAndRefereesMenu();
    }

    @When("^the user hovers on the 'About the journal' dropdown menu$")
    public void theUserHoversOnTheAboutTheJournalDropdownMenu() throws Throwable {
        nav.hoverAboutMenu();
    }
}
