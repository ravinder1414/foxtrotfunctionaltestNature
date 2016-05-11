package com.nature.quickstep.stepdef.accesscontrol.login;

import com.nature.quickstep.pageobjects.accesscontrol.login.Loginviacookies;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginViaCookiesStepdefination {
    Loginviacookies login = new Loginviacookies();

    @Given("^user navigate to nature page$")
    public void user_navigate_to_nature_page() throws Throwable {
        login.navigateTo();
    }

    @Given("^user click on login button$")
    public void user_click_on_login_button() throws Throwable {
        login.lnklogin().click();
    }

    @When("^user enter valid credentials and click on Login button$")
    public void user_enter_valid_credentials_and_click_on_Login_button() throws Throwable {
        login.Loginpage("quickstepuser1@mailinator.com", "qwer1234");
    }

    @Then("^user logged in and able to see the logout link$")
    public void user_logged_in_and_able_to_see_the_logout_link() throws Throwable {
        login.validatelnklogout();
    }

    @When("^user click on subscription link$")
    public void user_click_on_subscription_link() throws Throwable {
        login.lnksubscription().click();
    }

    @Then("^user should be able to see the subscription page and also the logout link$")
    public void user_should_be_able_to_see_the_subscription_page_and_also_the_logoutlink() throws Throwable {
        login.validatesubscriptionlnklogout();
    }

    @Given("^user navigate to nature events$")
    public void user_navigate_to_nature_events() throws Throwable {
        login.navigateTonatureevents();
    }

    @When("^user click on my profile link$")
    public void user_click_on_my_profile_link() throws Throwable {
        login.lnkmyprofile().click();
    }

    @Then("^user able to see the my profile details$")
    public void user_able_to_see_the_my_profile_details() throws Throwable {
        login.validatemyprofilepage();
    }

    @Given("^user navigate to naturejobs$")
    public void user_navigate_to_naturejobs() throws Throwable {
        login.navigateTonaturejobs();
    }

    @When("^click on myaccount link$")
    public void click_on_myaccount_link() throws Throwable {
        login.lnknaturejobsmyaccount().click();
    }

    @Then("^user able to see the user details on that page$")
    public void user_able_to_see_the_user_details_on_that_page() throws Throwable {
        login.validatenaturejobsmyprofile();
    }

    @Given("^user navigate to news application$")
    public void user_navigate_to_news_application() throws Throwable {
        login.navigateTonaturenews();
    }

    @When("^user click on myaccount link on news page$")
    public void user_click_on_myaccount_link_on_news_page() throws Throwable {
        login.lnknewsmyaccount().click();
    }

    @Then("^user able to see the userdetails$")
    public void user_able_to_see_the_userdetails() throws Throwable {
        login.validatemyprofile();
        login.clickOnLogoutLink();
        login.validateUserNotLoggedIN();
    }
}