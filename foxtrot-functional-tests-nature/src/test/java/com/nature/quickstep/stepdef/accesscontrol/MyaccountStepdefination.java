package com.nature.quickstep.stepdef.accesscontrol;

import com.nature.quickstep.pageobjects.accesscontrol.MyaccountPageobject;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MyaccountStepdefination {

    MyaccountPageobject account = new MyaccountPageobject();

    @Given("^user navigate to myaccount page$")
    public void user_navigate_to_myaccount_page() throws Throwable {
        account.navigateTo();
    }

    @When("^user enter valid usercredentials and click on Login button$")
    public void user_enter_valid_usercredentials_and_click_on_Login_button() throws Throwable {
        account.MyAccount("quickstepuser2@mailinator.com", "qwer1234");
    }

    @Then("^user see the profile page$")
    public void user_see_the_profile_page() throws Throwable {
        account.validateProfilePage();
    }

    @Given("^user click on edit button on profile tab$")
    public void user_click_on_edit_button_on_profile_tab() throws Throwable {
        account.lnkedit().click();
    }

    @Given("^user modify their address details$")
    public void user_modify_their_address_details() throws Throwable {
        account.fldaddressline1().clear();
        account.fldaddressline1().sendKeys("340 MPS LTD");
        account.fldaddressline2().clear();
        account.fldaddressline2().sendKeys("udyog vihar phase 4");
        account.fldcity().clear();
        account.fldcity().sendKeys("Gurgaon");
        account.fldstate().clear();
        account.fldstate().sendKeys("Haryana");
        account.country("IN");

    }

    @When("^user click on confirm button$")
    public void user_click_on_confirm_button() throws Throwable {
        account.btnaddressconfirm().click();
    }

    @Then("^user should be able to see the modified address details$")
    public void user_should_be_able_to_see_the_modified_address_details() throws Throwable {
        //account.validateaddressProfilePage();
    }

    @Given("^user click on edit password button on profile tab$")
    public void user_click_on_edit_password_button_on_profile_tab() throws Throwable {
        account.lnkeditpassword().click();

    }

    @Given("^user modify their password details$")
    public void user_modify_their_password_details() throws Throwable {
        account.fldcurrentpassword().clear();
        account.fldcurrentpassword().sendKeys("qwer1234");
        account.fldnewpassword().clear();
        account.fldnewpassword().sendKeys("qwer4321");
        account.fldconfirmnewpassword().clear();
        account.fldconfirmnewpassword().sendKeys("qwer4321");
    }

    @When("^user click on password change confirm button$")
    public void user_click_on_password_change_confirm_button() throws Throwable {
        account.btnpasswordconfirm().click();

    }

    @Then("^user should be able to see the password change message$")
    public void user_should_be_able_to_see_the_password_change_message() throws Throwable {
        account.validatePasswordchange();
    }

    @Given("^user navigate to mailinator mail box$")
    public void user_navigate_to_mailinator_mail_box() throws Throwable {
        account.navigatetoemail();
    }

    @When("^user click on email verification link$")
    public void user_click_on_email_verification_link() throws Throwable {
        account.lnkconformation().click();

        account.lnkverify().click();
    }

    @Then("^user enter valid new usercredentials and click on Login button$")
    public void user_enter_valid_new_usercredentials_and_click_on_Login_button() throws Throwable {
        account.fldEmailaddress().clear();
        account.fldPassword().clear();

        account.MyAccount("quickstepuser2@mailinator.com", "qwer4321");

    }

    @Given("^user modify their password newly details$")
    public void user_modify_their_password_newly_details() throws Throwable {
        account.fldcurrentpassword().clear();

        account.fldcurrentpassword().sendKeys("qwer4321");

        account.fldnewpassword().clear();

        account.fldnewpassword().sendKeys("qwer1234");

        account.fldconfirmnewpassword().clear();

        account.fldconfirmnewpassword().sendKeys("qwer1234");

    }

    @Then("^user enter valid again new usercredentials and click on Login button$")
    public void user_enter_valid_again_new_usercredentials_and_click_on_Login_button() throws Throwable {

        account.fldEmailaddress().clear();
        account.fldPassword().clear();

        account.MyAccount("quickstepuser2@mailinator.com", "qwer1234");
    }

    @Given("^user click on edit button on additional information$")
    public void user_click_on_edit_button_on_additional_information() throws Throwable {
        account.lnkadditionalinformationedit().click();
    }

    @Given("^user modify their Work details$")
    public void user_modify_their_Work_details() throws Throwable {

        account.industry("7");
        account.Areaofinterest("5");
        account.Speciality("61");
        account.fldAffilation().clear();
        account.fldAffilation().sendKeys("MPS1");
    }

    @When("^user click on confirm button of work details$")
    public void user_click_on_confirm_button_of_work_details() throws Throwable {
        account.btnworkdetailsconfirm().click();
    }

    @Then("^user should be able to see the modified work details$")
    public void user_should_be_able_to_see_the_modified_work_details() throws Throwable {
        account.validateAreaofinterest();
    }

    @When("^user click on alerts tab$")
    public void user_click_on_alerts_tab() {

        account.clickOnAlertTab();
        account.validateShowEAlertPage();
    }

    @When("^user click on modify button$")
    public void user_click_on_modify_button() {

        account.clickOnModifyButton();
    }

    @When("^user select ealerts and click on confirm button$")
    public void user_select_ealerts_and_click_on_confirm_button() throws Throwable {

        account.natureealerts().click();
        account.btnconfirm().click();
    }

    @Then("^user should be able to see the selected ealerts$")
    public void user_should_be_able_to_see_the_selected_ealerts() throws Throwable {
        account.validateselectedalearts();

    }

    @When("^user unselect ealerts and click on confirm button$")
    public void user_unselect_ealerts_and_click_on_confirm_button() throws Throwable {
        account.natureealerts().click();
        account.btnconfirm().click();

    }

    @Then("^user should not be able to see the selected ealerts$")
    public void user_should_not_be_able_to_see_the_selected_ealerts() throws Throwable {
        account.validatedeselectedalearts();
    }

    @When("^user click on subscription and purchase tab$")
    public void user_click_on_subscription_and_purchase_tab() throws Throwable {
        account.lnksubscription().click();

    }

    @Then("^user should be able to see the assigned subscription$")
    public void user_should_be_able_to_see_the_assigned_subscription() throws Throwable {
        account.validateSubscriptionPage();

    }

    @Given("^user has not signed up to receive any NPG Updates and Alerts$")
    public void user_has_not_signed_up_to_receive_any_NPG_Updates_and_Alerts() {
        account.deSelectAllEAlertsCheckBoxes();
        account.validatedeselectedalearts();
    }
}
