package com.nature.quickstep.stepdef.accesscontrol.bdj;

import com.nature.quickstep.pageobjects.accesscontrol.bdj.BdjTeamCpdAdminLogin;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BdjTeamCpdAdminLoginStepDefination {
    BdjTeamCpdAdminLogin login = new BdjTeamCpdAdminLogin();

    @Given("^The user navigates to BDJ Team CPD home page$")
    public void userNavigateToBDJTeamCPDHomePage() throws Throwable {
        login.navigateTo();
    }

    @When("^The user enters valid Admin credentials$")
    public void userEntersValidAdminCredentials() throws Throwable {
        login.loginUser("bdjteamfunctionaltest@mailinator.com", "me@12345");
    }

    @Then("^The user should be logged in successfully$")
    public void userShouldBeAbleToLoginSuccessfully() throws Throwable {
        login.validateUserSuccessfullyLoggedIN();
        login.clickOnLogoutLink();
        login.validateUserNotLoggedIN();
    }

    @When("^The user enters invalid credentials$")
    public void userEntersInvalidCredentials() throws Throwable {
        login.loginUser("invalidUserID", "invalidPassword");
    }

    @Then("^The user should not be able to login and should get error message$")
    public void userShouldNotBeAbleToLoginAndGetErrorMessage() throws Throwable {
        login.validateUserNotLoggedIN();
    }

    @Given("^The user is logged in into BDJ team CPD$")
    public void userIsLoggedIn() throws Throwable {
        login.navigateTo();
        login.loginUser("bdjteamfunctionaltest@mailinator.com", "me@12345");
        login.validateUserSuccessfullyLoggedIN();
    }

    @When("^The user clicks on logout link$")
    public void userClicksOnLogoutLink() throws Throwable {
        login.clickOnLogoutLink();
    }

    @Then("^The user should be logged out successfully$")
    public void userShouldBeLoggedOutSuccessfully() throws Throwable {
        login.validateUserNotLoggedIN();
        login.validateLoginLink();
    }

}
