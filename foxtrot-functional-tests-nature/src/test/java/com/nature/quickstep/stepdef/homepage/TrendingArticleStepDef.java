package com.nature.quickstep.stepdef.homepage;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import com.nature.quickstep.pageobjects.homepage.nclimate.NclimateHomepage;
import com.nature.quickstep.pageobjects.homepage.nclimate.TrendingArticlePage;
import com.nature.quickstep.pageobjects.homepage.nclimate.TrendingArticleTab;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TrendingArticleStepDef {
    NclimateHomepage trending = new NclimateHomepage();
    TrendingArticlePage full = new TrendingArticlePage();
    TrendingArticleTab tab = new TrendingArticleTab();

    // Trending article tab on the homepage

    @Given("^user is on an AIP homepage with trending online tab open$")
    public void userIsOnAnAIPHomepageWithTrendingOnlineTabOpen() throws Throwable {
        tab.navigateTo();
    }

    @When("^Powered by Altmetric link is clicked$")
    public void poweredByAltmetricLinkIsClicked() throws Throwable {
        trending.clickWhatIsAltmetricScoreLink();
    }

    @Then("^explanation text appears$")
    public void explanation_text_appears() throws Throwable {
        assertTrue(trending.altmetricText().isDisplayed());
    }

    @And("^message should read: \"([^\"]*)\"$")
    public void messageShouldRead(String message) throws Throwable {
        Thread.sleep(5000);
        assertEquals(message, trending.altmetricText().getText());
    }

    @And("Altmetric text should link to http://www.altmetric.com$")
    public void text_should_link_to_http_www_altmetric_com() throws Throwable {
        assertEquals("http://www.altmetric.com/", trending.altmetricScoreLink().getAttribute("href"));
    }

    @When("^user clicks on link again$")
    public void user_clicks_on_link_again() throws Throwable {
        trending.clickWhatIsAltmetricScoreLink();
    }

    @Then("^text collapses$")
    public void text_collapses() throws Throwable {
        Thread.sleep(5000);
        assertFalse(trending.altmetricText().isDisplayed());
    }

    // Trending article tab on the homepage with JS Disabled

    @Then("^no explanation text appears and a link to the full trending online page is given$")
    public void noExplanationTextAppearsAndALinkToTheFullTrendingOnlinePageIsGiven() throws Throwable {
        assertFalse(trending.altmetricText().isDisplayed());
        assertTrue(trending.viewAllTendingArticlesLink().getAttribute("href")
                .contains("nature.com/nclimate/trending-articles.html"));
    }

    // Full Trending articles page

    @Given("^user is on the full trending online page$")
    public void user_is_on_the_full_trending_online_page() throws Throwable {
        full.navigateTo();
    }

}
