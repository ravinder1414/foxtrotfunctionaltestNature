package com.nature.quickstep.stepdef.accesscontrol.login;

import com.nature.quickstep.pageobjects.accesscontrol.login.LoginShibbolethPage;
import com.nature.quickstep.pageobjects.accesscontrol.login.NatureLoginPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginShibbolethStepDefinition {
    NatureLoginPage natureLogin = new NatureLoginPage();
    LoginShibbolethPage shibboleth = new LoginShibbolethPage();

    @Given("^I navigate to nature.com login page$")
    public void I_navigate_to_nature_com_login_page() throws Throwable {
        natureLogin.navigateTo();
        shibboleth.validateLoginViaInstitutionLinkOnLoginPage();

    }

    @When("^I click on 'Login via institution' link$")
    public void I_click_on_Login_via_institution_link() throws Throwable {
        shibboleth.clickOnLoginViaInstitution();

    }

    @When("^I select 'United Kingdom' from the country's drop down and click on Go button$")
    public void I_select_United_Kingdom_from_the_country_s_drop_down_and_click_on_Go_button() throws Throwable {
        shibboleth.fldShibbolethCountry("United Kingdom");
        shibboleth.clickOnButtonGo();
    }

    @When("^I search for 'University of Portsmouth'in Institution search box and click on search button$")
    public void I_search_for_University_of_Portsmouth_in_Institution_search_box_and_click_on_search_button()
            throws Throwable {
        shibboleth.searchPortsmouthUniversityName();
        shibboleth.clickOnSearchButton();
        shibboleth.validatePortsmouthUniversity();

    }

    @When("^I click on 'University of Portsmouth'link$")
    public void I_click_on_University_of_Portsmouth_link() throws Throwable {
        shibboleth.clickOnPortsmouthUniversityLink();
        shibboleth.validateTextOnPortsmouthUniversityLoginPage();

    }

    @When("^I enter credentials on university login page$")
    public void I_enter_credentials_on_university_login_page() throws Throwable {
        shibboleth.portsmouthUniversityLogin("jefferyl", "m1dt0wnvt");

    }

    @Then("^It redirects to the nature.com homepage$")
    public void It_redirects_to_the_nature_com_homepage() throws Throwable {
        shibboleth.validateNatureHomepage();

    }

    @Given("^I navigate to NM journal access page$")
    public void I_navigate_to_NM_journal_access_page() throws Throwable {
        shibboleth.navigateToNM();
        shibboleth.validateArticleInstitutionLink();

    }

    @When("^I click on article 'Login via institution' link$")
    public void I_click_on_article_Login_via_institution_link() throws Throwable {
        shibboleth.clickOnArticleInstitutionAccessLink();

    }

    @Then("^I should get full text access for NM journal for valid site account$")
    public void I_should_get_full_text_access_for_NM_journal_for_valid_site_account() throws Throwable {
        shibboleth.clickOnFullTextLink();
        shibboleth.validateNMContent();
    }

}
