package com.nature.quickstep.stepdef.homepage.nclimate;

import static org.junit.Assert.assertNotNull;

import com.nature.quickstep.pageobjects.homepage.nclimate.LatestResearchPage;
import com.nature.quickstep.pageobjects.homepage.nclimate.LatestResearchTab;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LatestResearchContentStepDefs {

    private LatestResearchPage latest = new LatestResearchPage();
    private LatestResearchTab tab = new LatestResearchTab();

    @Given("^an article which has a linked 'News and Views' with one author appears on the full latest research page$")
    public void an_article_which_has_a_linked_News_and_Views_with_one_author_full() throws Throwable {
        latest.navigateTo();
        latest.seeAlsoArticle();
    }

    @Then("^See also: 'article type name' by 'author name' displays with the article$")
    public void see_also_article_type_name_by_author_name_displays_with_the_article() throws Throwable {
        assertNotNull(latest.seeAlsoArticle().getText());
    }

    @When("^user clicks on link they go to the related article$")
    public void when_user_clicks_on_link_they_go_to_the_related_article() throws Throwable {
        latest.clickSeeAlsoArticleLink();
    }

    @Given("^an article which has a linked  'News and Views' article with multiple authors appears on the full latest research page$")
    public void an_article_which_has_a_linked_article_with_multiple_authors_full() throws Throwable {
        latest.navigateTo();
        latest.seeAlsoArticleWithMultipleAuthors();
    }

    @Then("^See also: 'article type name' by 'author name et al.' displays with the article$")
    public void see_also_article_type_name_by_author_name_et_al() throws Throwable {
        assertNotNull(latest.seeAlsoArticleWithMultipleAuthors().getText());
    }

    @When("^user clicks on link they go to the related article with multiple authors$")
    public void when_user_clicks_on_link_they_go_to_the_related_article_with_multiple_authors() throws Throwable {
        latest.clickSeeAlsoArticleWithMultipleAuthorsLink();
    }

    @Given("^an article which has a linked 'News and Views' with one author appears on the latest research tab on a journal homepage$")
    public void an_article_which_has_a_linked_News_and_Views_with_one_author_latest_research_tab() throws Throwable {
        tab.navigateTo();
        latest.seeAlsoArticle();
    }

    @Given("^an article which has a linked  'News and Views' article with multiple authors appears on the latest research tab on a journal homepage$")
    public void an_article_which_has_a_linked_article_with_multiple_authors_latest_research_tab() throws Throwable {
        tab.navigateTo();
        latest.seeAlsoArticleWithMultipleAuthors();
    }

}
