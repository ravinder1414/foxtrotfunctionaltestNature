package com.nature.quickstep.stepdef.homepage.nclimate;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import com.nature.quickstep.pageobjects.homepage.nclimate.AOPFullPage;
import com.nature.quickstep.pageobjects.homepage.nclimate.NclimateHomepage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AOPLinkStepDefs {
    private NclimateHomepage homepage = new NclimateHomepage();
    private AOPFullPage aop = new AOPFullPage();

    @Given("^user is on the NClimate homepage$")
    public void user_is_on_the_NClimate_homepage() throws Throwable {
        homepage.navigateTo();
    }

    @Then("^there is a link to the advance online publication page available$")
    public void there_is_a_link_to_the_advance_online_publication_page_available() throws Throwable {
        assertEquals("View all advance online publication", homepage.viewAllAOPLink().getText());
        assertTrue(homepage.viewAllAOPLink().getAttribute("href").contains("nature.com/nclimate/research/aop.html"));
    }

    @Given("^user is on the full AOP page$")
    public void user_is_on_the_full_AOP_page() throws Throwable {
        aop.navigateTo();
    }

    @When("^user clicks on 'What is Advance Online Publication\\?'$")
    public void user_clicks_on_What_is_Advance_Online_Publication_() throws Throwable {
        aop.clickWhatIsAOPLink();
    }

    @Then("^a description displays for the user$")
    public void a_description_displays_for_the_user() throws Throwable {
        assertTrue(aop.aOPDiscription().isDisplayed());
        assertEquals(
                "The latest research papers, published online ahead of print. These online versions are definitive and may be cited using the digital object identifier (DOI).",
                aop.aOPDiscription().getText());
    }

    @Then("^user clicks the link again$")
    public void user_clicks_the_link_again() throws Throwable {
        aop.clickWhatIsAOPLink();
    }

    @Then("^the description collapses$")
    public void the_description_collapses() throws Throwable {
        Thread.sleep(5000);
        assertFalse(aop.aOPDiscription().isDisplayed());
    }
}
