package com.nature.quickstep.stepdef.site;

import com.nature.quickstep.pageobjects.site.SendToFriendPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SendToFriendStepDefination {

    SendToFriendPage sendToFriendPage = new SendToFriendPage();

    @Given("^I am a user on nature.com and I navigate to send an email to friend form$")
    public void I_am_a_user_on_nature_and_I_navigate_to_send_an_email_to_friend_form() throws Throwable {
        sendToFriendPage.navigateTo();
        sendToFriendPage.validateSendToFriendPage();
    }

    @When("^I don't fill up all the mandatory fields and submit the send email form$")
    public void I_do_not_fill_up_all_the_mandatory_fields_and_submit_the_send_email_form() {
        sendToFriendPage.submitIncompleteForm();
    }

    @Then("^I should see error messages on send email to friend form$")
    public void I_should_see_error_messages_on_send_email_to_friend_form() {
        sendToFriendPage.validateSendToFriendErrorMessages();
        sendToFriendPage.logout();
    }

    @When("^I fill up required information and submit the send email form$")
    public void I_fill_up_required_information_and_submit_the_send_email_form() {
        sendToFriendPage.submitCompleteSendToFriendEmailForm();
    }

    @Then("^I should see email confirmation message$")
    public void I_should_see_email_confirmation_message() {
        sendToFriendPage.validateEmailSentMessage();
        sendToFriendPage.logout();
    }
}
