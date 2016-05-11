package com.nature.quickstep.stepdef.homepage;

import com.nature.quickstep.pageobjects.homepage.nchembio.NchembioHomepage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ViewAllLinksStepDefs {

    NchembioHomepage homepage = new NchembioHomepage();

    //Latest protocols

    @Given("^user is on the 'Latest protocols' tab on \"([^\"]*)\"$")
    public void userIsOnTheLatestProtocolsTabOn(String journal) throws Throwable {
        homepage.navigateToTabOnJournalHomePage(journal, "latest-research");
        homepage.waitForThePagetoload("nature.com/" + journal + "/index.html#latest-research");
    }

    @Then("^'View all latest protocols' link is available$")
    public void viewAllLatestProtocolsAndViewAllAdvanceOnlinePublicationLinksAreAvailable() throws Throwable {
        assertEquals("View all latest protocols", homepage.viewAllLatestResearchLinkText());
    }

    @When("^user clicks on the 'View all latest protocols'$")
    public void userClicksOnTheViewAllLatestProtocols() throws Throwable {
        homepage.clickViewAllLatestResearchLink();
    }

    @Then("^user navigates to the 'Latest protocols' page$")
    public void userNavigatesToTheLatestProtocolsPage() throws Throwable {
        homepage.waitForThePagetoload("nature.com/nprot/research/index.html");
        assertTrue(homepage.getCurrentAddress().contains("nature.com/nprot/research/index.html"));
    }

    //Latest research

    @Given("^user is on the 'Latest research' tab on \"([^\"]*)\"$")
    public void userIsOnTheLatestResearchTabOn(String journal) throws Throwable {
        homepage.navigateToTabOnJournalHomePage(journal, "latest-research");
        homepage.waitForThePagetoload("nature.com/" + journal + "/index.html#latest-research");
    }

    @Then("^'View all research' link is available$")
    public void viewAllLatestResearchLinkIsAvailable() throws Throwable {
        assertEquals("View all research", homepage.viewAllLatestResearchLinkText());
    }

    @When("^user clicks on the 'View all research'$")
    public void userClicksOnTheViewAllLatestResearch() throws Throwable {
        homepage.clickViewAllLatestResearchLink();
    }

    @Then("^user navigates to the 'research' page for \"([^\"]*)\"$")
    public void userNavigatesToTheLatestResearchPageFor(String journal) throws Throwable {
        homepage.waitForThePagetoload("nature.com/" + journal + "/research/index.html");
        assertTrue(homepage.getCurrentAddress().contains("nature.com/" + journal + "/research/index.html"));
    }

    //Most Read

    @Given("^user is on the 'Most read' tab on \"([^\"]*)\"$")
    public void userIsOnTheMostReadTabOn(String journal) throws Throwable {
        homepage.navigateToTabOnJournalHomePage(journal, "most-read");
        homepage.waitForThePagetoload("nature.com/" + journal + "/index.html#most-read");
    }

    @Then("^'View all most read' link is available$")
    public void viewAllMostReadLinkIsAvailable() throws Throwable {
        assertEquals("View all most read", homepage.viewAllMostReadLinkText());
    }

    @When("^user clicks on the 'View all most read'$")
    public void userClicksOnTheViewAllMostRead() throws Throwable {
        homepage.clickViewAllMostReadLink();
    }

    @Then("^user navigates to the 'most read' page for \"([^\"]*)\"$")
    public void userNavigatesToTheMostReadPageFor(String journal) throws Throwable {
        homepage.waitForThePagetoload("nature.com/" + journal + "/most-read.html");
        assertTrue(homepage.getCurrentAddress().contains("nature.com/" + journal + "/most-read.html"));
    }

    //Trending articles

    @Given("^user is on the 'Trending online' tab on \"([^\"]*)\"$")
    public void userIsOnTheTrendingArticlesTabOn(String journal) throws Throwable {
        homepage.navigateToTabOnJournalHomePage(journal, "trending");
        homepage.waitForThePagetoload("nature.com/" + journal + "/index.html#trending");
        Thread.sleep(2000L);
    }

    @Then("^'View all Trending online' link is available$")
    public void viewAllTrendingArticlesLinkIsAvailable() throws Throwable {
        assertEquals("View all trending online", homepage.viewAllTendingArticlesLinkText());
    }

    @When("^user clicks on the 'View all trending online'$")
    public void userClicksOnTheViewAllTrendingArticle() throws Throwable {
        homepage.clickViewAllTendingArticlesLink();
    }

    @Then("^user navigates to the 'Trending articles' page for \"([^\"]*)\"$")
    public void userNavigatesToTheTrendingArticlesPageFor(String journal) throws Throwable {
        homepage.waitForThePagetoload("nature.com/" + journal + "/trending-articles.html");
        assertTrue(homepage.getCurrentAddress().contains("nature.com/" + journal + "/trending-articles.html"));
    }

    //News & comment

    @Given("^user is on the 'News & comment' tab on \"([^\"]*)\"$")
    public void userIsOnTheNewsCommentTabOn(String journal) throws Throwable {
        homepage.navigateToTabOnJournalHomePage(journal, "news-and-comment");
        homepage.waitForThePagetoload("nature.com/" + journal + "/index.html#news-and-comment");
    }

    @Then("^'View all news & comment' link is available$")
    public void viewAllNewsCommentLinkIsAvailable() throws Throwable {
        assertEquals("View all news & comment", homepage.viewAllNewsnCommentLinkText());

    }

    @When("^user clicks on the 'View all news & comment'$")
    public void userClicksOnTheViewAllNewsComment() throws Throwable {
        homepage.clickViewAllNewsnCommentLink();
    }

    @Then("^user navigates to the 'News & comment' page for \"([^\"]*)\"$")
    public void userNavigatesToTheNewsCommentPageFor(String journal) throws Throwable {
        homepage.waitForThePagetoload("nature.com/" + journal + "/newsandcomment/index.html");
        assertTrue(homepage.getCurrentAddress().contains("nature.com/" + journal + "/newsandcomment/index.html"));
    }

    @Given("^user is on the 'Comment' tab on \"([^\"]*)\"$")
    public void userIsOnTheCommentTabOn(String journal) throws Throwable {
        homepage.navigateToTabOnJournalHomePage(journal, "news-and-comment");
        homepage.waitForThePagetoload("nature.com/" + journal + "/index.html#news-and-comment");
    }

    @Then("^'View all comment' link is available$")
    public void viewAllCommentLinkIsAvailable() throws Throwable {
        assertEquals("View all comment", homepage.viewAllNewsnCommentLinkText());
    }

    @When("^user clicks on the 'View all comment'$")
    public void userClicksOnTheViewAllComment() throws Throwable {
        homepage.clickViewAllNewsnCommentLink();
    }

    @Then("^user navigates to the 'Comment' page for \"([^\"]*)\"$")
    public void userNavigatesToTheCommentPageFor(String journal) throws Throwable {
        homepage.waitForThePagetoload("nature.com/" + journal + "/newsandcomment/index.html");
        assertTrue(homepage.getCurrentAddress().contains("nature.com/" + journal + "/newsandcomment/index.html"));
    }

}
