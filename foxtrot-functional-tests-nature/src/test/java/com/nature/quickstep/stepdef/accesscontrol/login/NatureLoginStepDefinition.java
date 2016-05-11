package com.nature.quickstep.stepdef.accesscontrol.login;

import com.nature.quickstep.pageobjects.accesscontrol.login.NatureLogin;
import com.nature.quickstep.pageobjects.homepage.HomePage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class NatureLoginStepDefinition {
    NatureLogin login = new NatureLogin();
    HomePage homePage = new HomePage();

    @Given("^User navigate to nature.com login page$")
    public void userNavigateToNatureComHomePage() throws Throwable {
        login.navigateTo();

    }

    @When("^User enters valid credentials$")
    public void userEntersValidCredentials() throws Throwable {
        login.loginUser("quickstepusernature_login@mailinator.com", "qwer1234");

    }

    @Then("^User should be able to login successfully$")
    public void userShouldBeAbleToLoginSuccessfully() throws Throwable {
        login.validateUserSuccessfullyLoggedIN();
        login.clickOnLogoutLink();
        login.validateUserNotLoggedIN();

    }

    @When("^User enters invalid credentials$")
    public void userEntersInvalidCredentials() throws Throwable {
        login.loginUser("invalidUserID", "invalidPassword");

    }

    @Then("^User should not be able to login$")
    public void userShouldNotBeAbleToLogin() throws Throwable {
        login.validateUserNotLoggedIN();

    }

    @Given("^User is loggedin and on nature home page$")
    public void userIsLoggedinAndOnNatureHomePage() throws Throwable {
        homePage.navigateTo();
        homePage.clickOnLoginLink();
        login.loginUser("quickstepusernature_login@mailinator.com", "qwer1234");
        login.validateUserSuccessfullyLoggedIN();

    }

    @When("^User clicks on logout link$")
    public void userClicksOnLogoutLink() throws Throwable {
        login.clickOnLogoutLink();

    }

    @Then("^User should be logout successfully$")
    public void userShouldBeLogoutSuccessfully() throws Throwable {
        login.validateUserNotLoggedIN();

    }

}
