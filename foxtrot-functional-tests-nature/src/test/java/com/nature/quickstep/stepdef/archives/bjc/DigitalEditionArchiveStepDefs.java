package com.nature.quickstep.stepdef.archives.bjc;

import static org.junit.Assert.assertEquals;

import com.nature.quickstep.pageobjects.archives.bjc.BJCDigitalEditionsArchive;
import com.nature.quickstep.pageobjects.archives.bjc.BJCMainArchive;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DigitalEditionArchiveStepDefs {

    private BJCMainArchive archive = new BJCMainArchive();
    private BJCDigitalEditionsArchive dearchive = new BJCDigitalEditionsArchive();

    @Given("^A user is on BJC main archive$")
    public void a_user_is_on_BJC_main_archive() throws Throwable {
        archive.navigateTo();
    }

    @Then("^The user Should see a link to the Digital Editions Archive in the left navigation menu$")
    public void the_user_Should_see_a_link_to_the_Digital_Editions_Archive_in_the_left_navigation_menu()
            throws Throwable {
        assertEquals(archive.digitalEditionsLink().getText(), "Digital Editions");
    }

    @Then("^The link should navigate to nature.com/bjc/digitaleditions/index.html$")
    public void the_link_should_navigate_to_nature_com_bjc_digitaleditions_index_html() throws Throwable {
        archive.digitalEditionsLink().click();
        archive.validateLinkNavigatesToDigitalEditionsArchive();
    }

    @Given("^The user is on the BJC Digital Editions Archive page$")
    public void the_user_is_on_the_BJC_Digital_Editions_Archive_page() throws Throwable {
        dearchive.navigateTo();
    }

    @When("^The user clicks on a individual Digital editions page$")
    public void the_user_clicks_on_a_individual_Digital_editions_page() throws Throwable {
        dearchive.indvidualDigitalEdtionLink().click();
    }

    @Then("^The user is taken to the nature.com login page to login using the correct subscription$")
    public void the_user_is_taken_to_the_nature_com_login_page_to_login_using_the_correct_subscription()
            throws Throwable {
        dearchive.validateUserNavigatesToLoginPage();
    }

}
