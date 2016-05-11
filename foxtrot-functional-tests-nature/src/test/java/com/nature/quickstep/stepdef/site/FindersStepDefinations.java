package com.nature.quickstep.stepdef.site;

import com.nature.quickstep.pageobjects.site.FindersPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FindersStepDefinations {
    FindersPage findersPage = new FindersPage();

    @Given("^I am user on nature.com$")
    public void I_am_a_user_on_nature() throws Exception {

    }

    @When("^I navigate to \"([^\"]*)\" url with doi \"([^\"]*)\"$")
    public void I_navigate_to_finder_url_with_doi(String finder, String doi) throws Exception {
        findersPage.navigateToFinder(finder, doi);
    }

    @Then("^I should see the nature.com article \"([^\"]*)\"$")
    public void I_should_see_the_nature_com_article(String article) throws Exception {
        findersPage.verifyArticlePage(article);
    }
}
