package com.nature.quickstep.stepdef.homepage.bonekey;

import com.nature.quickstep.pageobjects.homepage.bonekey.CurrentIssueBox;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CurrentIssueBoxStepDefs {

    CurrentIssueBox links = new CurrentIssueBox();

    @Given("^user is on Bonekey homepage$")
    public void user_is_on_Bonekey_homepage() throws Throwable {
        links.navigateTo();
    }

    @When("^user clicks Current Issue link$")
    public void user_clicks_Current_Issue_link() throws Throwable {
        links.CurrentIssueLink().click();

    }

    @When("^Current Issue cover$")
    public void Current_Issue_cover() throws Throwable {
        links.CurrentIssueCoverLink().click();

    }

    @Then("^page navigates to http://www.nature.com/bonekey/archive/issue/bonekeyreports.html$")
    public void page_navigates_to_http_www_nature_com_bonekey_archive_issue_bonekeyreports_html() throws Throwable {
        links.validateCurrentIssueLink();
    }

    @When("^user clicks on Subscribe link$")
    public void user_clicks_on_Subscribe_link() throws Throwable {
        links.SubscribeLink().click();

    }

    @Then("^page navigates to http://www.nature.com/bonekey/about/subscription/index.html$")
    public void page_navigates_to_http_www_nature_com_bonekey_about_subscription_index_html() throws Throwable {
        links.validateSubscribeLink();

    }

    @When("^user clicks on recommend to library link$")
    public void user_clicks_on_recommend_to_library_link() throws Throwable {
        links.RecommendLink().click();

    }

    @Then("^page navigates to http://www.nature.com/librec/svc/request/makeProdRequest\\?id=bonekeyreports$")
    public void page_navigates_to_http_www_nature_com_librec_svc_request_makeProdRequest_id_bonekeyreports()
            throws Throwable {
        links.validateRecommendLink();
    }

    @When("^user clicks on link to Bonekey Reports$")
    public void user_clicks_on_link_to_Bonekey_Reports() throws Throwable {
        links.BonekeyReportsLink().click();

    }

    @Then("^page navigates to http://www.nature.com/bonekey/bonekeyreports/index.html$")
    public void page_navigates_to_http_www_nature_com_bonekey_bonekeyreports_index_html() throws Throwable {
        links.validateBonekeyReportsLink();

    }

}
