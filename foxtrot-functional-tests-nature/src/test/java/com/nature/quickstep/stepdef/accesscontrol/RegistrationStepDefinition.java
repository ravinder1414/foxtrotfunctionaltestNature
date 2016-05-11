package com.nature.quickstep.stepdef.accesscontrol;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.map.ObjectMapper;

import com.nature.quickstep.pageobjects.accesscontrol.RegistrationPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RegistrationStepDefinition {
    RegistrationPage reg = new RegistrationPage();

    final long rnum = reg.randomNumber();
    String email = "quickstep" + rnum + "@mailinator.com";
    String verificationKey;

    public void registration() throws Exception {
        reg.navigateTo();
        reg.firstname().sendKeys("Cucumber");
        reg.lastname().sendKeys("Jvm" + rnum);
        reg.email().sendKeys(email);
        reg.password().sendKeys("password");
        reg.confirmpassword().sendKeys("password");

        reg.termsAndconditions().click();
        reg.employer().clear();
        reg.employer().sendKeys("NPG");
        reg.jobTitle("Other");
        reg.industry("Other");
        reg.areaOfInterest("Other");
        reg.specialities("Other");
    }

    //1 
    @Given("^I enter the valid parameters$")
    public void I_enter_the_valid_parameters() throws Exception {
        registration();
    }

    @When("^I click Register button$")
    public void I_click_Register_button() throws InterruptedException {
        reg.register().click();
    }

    @Then("^Registration should be successful$")
    public void Registration_should_be_successful() {
        reg.validateRegistration();
    }

    @Given("^I invoked DRUM API's and get Email Verification String$")
    public void Email_Verification_Link_Construct() throws Exception {
        registration();
        reg.register().click();

        HttpClient httpClient = HttpClientBuilder.create().build();
        HttpGet getRequest = new HttpGet("http://test.npg-services.nature.com/naturewebapi/users/accounts;email="
                + email + "?client=s@l1QA");
        System.out.println("http://test.npg-services.nature.com/naturewebapi/users/accounts;email=" + email
                + "?client=s@l1QA");

        getRequest.addHeader("accept", "application/json");

        HttpResponse response = httpClient.execute(getRequest);

        BufferedReader br = new BufferedReader(new InputStreamReader((response.getEntity().getContent())));

        StringBuffer apiRespponse = new StringBuffer();

        String output;
        while ((output = br.readLine()) != null) {
            apiRespponse.append(output);
        }

        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode contentNode = objectMapper.readTree(apiRespponse.toString());
        JsonNode usersNode = contentNode.get("users");

        JsonNode ID = usersNode.get(0).get("id");

        HttpClient httpClient1 = HttpClientBuilder.create().build();
        HttpGet getRequest1 = new HttpGet("http://test.npg-services.nature.com/naturewebapi/" + "users/emails/" + ID
                + "/verificationKey?client=s@l1QA");
        System.out.println("http://test.npg-services.nature.com/naturewebapi/" + "users/emails/" + ID
                + "/verificationKey?client=s@l1QA");
        getRequest1.addHeader("accept", "application/json");

        HttpResponse response1 = httpClient1.execute(getRequest1);

        if (response1.getStatusLine().getStatusCode() != 200) {
            throw new RuntimeException("Failed : HTTP error code : " + response1.getStatusLine().getStatusCode());
        }

        BufferedReader br1 = new BufferedReader(new InputStreamReader((response1.getEntity().getContent())));

        StringBuffer apiResponse1 = new StringBuffer();

        String output1;
        while ((output1 = br1.readLine()) != null) {
            apiResponse1.append(output1);
        }

        ObjectMapper objectMapper1 = new ObjectMapper();
        JsonNode contentNode1 = objectMapper1.readTree(apiResponse1.toString());
        JsonNode usersNode1 = contentNode1.get("emailVerificationKey");

        verificationKey = usersNode1.get("key").toString().replaceAll("\"", "");
    }

    @Then("^Email Verification should be successful$")
    public void Email_Verification_should_be_successful() {
        reg.validateEmailVerification();
    }

    //2
    @Given("^Verification Email appear in my Inbox$")
    public void Verification_Email_Appears_in_my_inbox() throws Exception {
        registration();
        reg.register().click();
        reg.navigateToMailBox(rnum);
        reg.validateVerificationEmailExistance();
    }

    @When("^I click the Email Verification Link and It should redirect to Nature.com website$")
    public void I_click_Email_Confirmation_Link() throws Exception {
        reg.confirmationEmail().click();
        reg.confirmationEmailLink().click();
    }

    @When("^I enter password and click 'Submit' button$")
    public void I_enter_password_click_submit_button() {
        reg.loginPassword().sendKeys("password");
        reg.loginSubmit().click();

    }

    @When("^I open the email verification link$")
    public void I_open_the_email_verification_link() throws Exception {
        reg.navigateRegistration(verificationKey);
    }

    @Then("^Registration Email Verification should be successful$")
    public void Registration_Email_Verification_should_be_successful() {
        reg.validateEmailVerification();
    }
}
