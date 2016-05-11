package com.nature.quickstep.stepdef.accesscontrol;

import com.nature.quickstep.pageobjects.accesscontrol.ReferralAccessPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ReferralAccessStepDefinition {
    ReferralAccessPage referralAccessPage = new ReferralAccessPage();;

    @Given("^I visit to an article access page of 'EYE' journal on nature.com$")
    public void I_visit_to_an_article_access_page_of_EYE_journal_on_nature_com() throws Exception {
        referralAccessPage.navigateToEyeJournalArticle();
        referralAccessPage.verifyAccessPageOfEYEJournalArticle();
    }

    @When("^I click on 'RCO' society link on article page, I redirect to society page$")
    public void I_click_on_RCO_society_link_on_article_page_I_redirect_to_society_page() throws Exception {
        referralAccessPage.clickOnRCOSocietyLinkOnArticlePage();

    }

    @When("^Click on a link on 'RCO' society page which redirects me back to an article page on nature.com$")
    public void Click_on_a_link_on_RCO_society_page_which_redirects_me_back_to_an_article_page_on_nature_com()
            throws Exception {
        referralAccessPage.clickOnALinkOnRCOSocietyPageToRedirectToArticlePage();

    }

    @Then("^I should get access to full text article of 'EYE' journal on nature.com$")
    public void I_should_be_able_to_get_the_full_text_article_of_EYE_journal_on_nature_com() throws Exception {
        referralAccessPage.verifyFullTextPageOfEyeJournalArticle();
    }

    @Given("^I visit to an article access page of 'GIM' journal on nature.com$")
    public void I_visit_to_an_article_access_page_of_GIM_journal_on_nature_com() throws Exception {
        referralAccessPage.navigateToGimJournalArticle();
        referralAccessPage.verifyAccessPageOfGimJournalArticle();
    }

    @When("^I click on 'ACMG' society link on article page, I redirect to society page$")
    public void I_click_on_ACMG_society_link_on_article_page_I_redirect_to_society_page() throws Exception {
        referralAccessPage.clickOnACMGSocietyLinkOnArticlePage();

    }

    @When("^Click on a link on 'ACMG' society page which redirects me back to an article page on nature.com$")
    public void Click_on_a_link_on_ACMG_society_page_which_redirects_me_back_to_an_article_page_on_nature_com()
            throws Exception {
        referralAccessPage.clickOnALinkOnACMGSocietyPageToRedirectToArticlePage();

    }

    @Then("^I should get access to full text article of 'GIM' journal on nature.com$")
    public void I_should_be_able_to_get_the_full_text_article_of_GIM_journal_on_nature_com() throws Exception {
        referralAccessPage.verifyFullTextPageOfGimJournalArticle();
    }

}
