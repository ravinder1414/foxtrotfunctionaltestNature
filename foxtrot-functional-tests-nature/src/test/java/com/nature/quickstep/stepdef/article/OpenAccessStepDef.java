package com.nature.quickstep.stepdef.article;

import com.nature.quickstep.pageobjects.article.OpenAccess;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class OpenAccessStepDef {
    OpenAccess open = new OpenAccess();

    @Given("^I am browsing a journal homepage$")
    public void I_am_browsing_a_journal_homepage() throws Throwable {
        open.navigateTo();
    }

    @Given("^the homepage contains open access articles$")
    public void the_homepage_contains_open_access_articles() throws Throwable {
        open.openArticlesArePresent();
    }

    @When("^I click on an open access article$")
    public void I_click_on_an_open_access_article() throws Throwable {
        open.openLabel().click();

    }

    @Then("^I should see an open Label on the article page$")
    public void I_should_see_an_open_Label_on_the_article_page() throws Throwable {
        open.openLabelText();
    }

}
