package com.nature.quickstep.stepdef.article.metrics;

import com.nature.quickstep.pageobjects.article.metrics.MetricsPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MetricsStepdef {

    MetricsPage metricsPage = new MetricsPage();

    @Given("^I navigate to article \"([^\"]*)\"$")
    public void I_navigate_to_article(String articleURL) throws Throwable {
        metricsPage.navigateToArticlePage(articleURL);
    }

    @When("^I click on article metrics link$")
    public void I_click_on_article_metrics_link() throws Throwable {
        metricsPage.navigateToMetricsPage();
    }

    @Then("^I can see citations of this article$")
    public void I_can_see_citations_of_this_article() throws Throwable {
        metricsPage.validateCitations();
    }

    @Then("^I can see article metrics score of this article$")
    public void I_can_see_article_metrics_score_of_this_article() throws Throwable {
        metricsPage.validateArticleMetrics();
    }
}
