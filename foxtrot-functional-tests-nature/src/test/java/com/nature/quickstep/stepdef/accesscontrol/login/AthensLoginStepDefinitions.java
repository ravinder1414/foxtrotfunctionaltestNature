package com.nature.quickstep.stepdef.accesscontrol.login;

import com.nature.quickstep.pageobjects.accesscontrol.login.AthensLoginPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AthensLoginStepDefinitions {
    AthensLoginPage athens = new AthensLoginPage();

    @Given("^I navigate to nature APS journal access page$")
    public void I_navigate_to_nature_APS_journal_access_page() throws Throwable {
        athens.navigateToAPS();
    }

    @Given("^I click on Article 'Login via Athens' link$")
    public void I_click_on_Article_Login_via_Athens_link() throws Throwable {
        athens.lnkLoginViaAthens().click();
    }

    @Given("^It navigates to the Athens login page$")
    public void It_navigates_to_the_Athens_login_page() throws Throwable {
        athens.validateAthensLoginPage();
    }

    @When("^I enter valid Athens credentials and click on login button$")
    public void I_enter_valid_Athens_credentials_and_click_on_login_button() throws Throwable {
        athens.loginUsingAthensAccount("npgnature_qa_access", "AthMacUs2014");

    }

    @Then("^I can get full access for APS journal$")
    public void I_can_get_full_access_for_APS_journal() throws Throwable {
        Thread.sleep(10000L);
        athens.validatefulltextcontent();
    }
}
