package com.nature.quickstep.stepdef.accesscontrol.alhambra;

import com.nature.quickstep.pageobjects.accesscontrol.alhambra.RegistrationComplete;
import com.nature.quickstep.pageobjects.accesscontrol.alhambra.RegistrationStep1Page;
import com.nature.quickstep.pageobjects.accesscontrol.alhambra.RegistrationStep2Page;
import com.nature.quickstep.pageobjects.accesscontrol.login.LoginPage;
import com.nature.quickstep.pageobjects.homepage.HomePage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RegistrationStepDefinitions {

    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();
    RegistrationStep1Page regStep1Page = new RegistrationStep1Page();
    RegistrationStep2Page regStep2Page = new RegistrationStep2Page();
    RegistrationComplete regComplete = new RegistrationComplete();

    @Given("^I have no account on nature.com$")
    public void I_have_no_account_on_nature() throws Exception {
        homePage.navigateTo();
    }

    @When("^I fill up required information on step 2 when javascript is enabled$")
    public void I_fill_up_required_information_on_step_2_when_javascript_is_enabled() throws Exception {
        regStep1Page.navigateTo();
        regStep1Page.completeStep1Registration();
        regStep2Page.submitCompletelyFilledStep2registrationFormWhenJSEnabled();
    }

    @Then("^I should see a confirmation page stating to verify my email$")
    public void I_should_see_a_confirmation_page_stating_to_verify_my_email() {
        regComplete.validateRegistrationCompleteMsg();

    }

    @Given("^I have no account on nature.com and I click 'register' on srep homepage$")
    public void I_have_no_account_on_nature_and_I_click_register_on_srep_homepage() throws Exception {
        homePage.navigateToJournalHomePage("srep", "Home : Scientific Reports : Nature Publishing Group");
    }

    @When("^I fill up information required on step 1 registration$")
    public void I_fill_up_information_required_on_step_1_registration() throws Exception {
        regStep1Page.navigateTo();
        regStep1Page.completeStep1Registration();
    }

    @When("^I don't fill up all the mandatory fields on step 2$")
    public void I_do_not_fill_up_all_the_mandatory_fields_on_step_2() throws InterruptedException {
        regStep2Page.submitIncompleteStep2SignUpForm();
    }

    @Then("^I should see error messages on step 2$")
    public void I_should_see_error_messages_on_step_2() {
        regStep2Page.validateStep2RegistrationFormErrorMessagesAndFilledValues();
    }

    @Given("^I am logged in nature.com$")
    public void I_am_logged_in_nature() throws Exception {
        homePage.navigateTo();
        homePage.lnkLogIn().click();
        loginPage.login();
    }

    @When("^I try to register from nature.com page$")
    public void I_try_to_register_from_nature_page() throws Exception {
        regStep1Page.navigateTo();
    }

    @Then("^I should see a message that I am already logged in$")
    public void I_should_see_a_message_that_I_am_already_logged_in() throws Exception {
        regStep1Page.validateUserAlreadyLogin();
    }

    @When("^I fill up required information on step 2 when javascript is disabled$")
    public void I_fill_up_required_information_on_step_2_when_javascript_is_disabled() throws Exception {
        regStep1Page.navigateTo();
        regStep1Page.completeStep1Registration();
        regStep2Page.submitCompletelyFilledStep2registrationFormWhenJSDisabled();
    }

}
