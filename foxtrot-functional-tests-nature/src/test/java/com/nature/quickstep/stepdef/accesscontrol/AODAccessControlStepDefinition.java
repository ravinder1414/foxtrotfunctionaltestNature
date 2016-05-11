package com.nature.quickstep.stepdef.accesscontrol;

import com.nature.quickstep.pageobjects.accesscontrol.AODAccessControlPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AODAccessControlStepDefinition {
    AODAccessControlPage aod = new AODAccessControlPage();

    @Given("^I am in within the IP range of an institution which has Corporate Unmediated AOD access$")
    public void I_am_in_within_the_IP_range_of_an_institution_which_has_Corporate_Unmediated_AOD_access()
            throws Throwable {
        aod.corporateUnmediatedPreSetup();
    }

    @When("^I attempt to access a standard article$")
    public void I_attempt_to_access_a_standard_article() throws Throwable {
        aod.navigateTo();
    }

    @Then("^I am granted access via Corporate Unmediated AOD Access$")
    public void I_am_granted_access_via_Corporate_Unmediated_AOD_Access() throws Throwable {
        aod.validateAccess(" Test001");

    }

    @Then("^the number of units is decreased by 1 for Corporated UnMediated AOD acess$")
    public void the_number_of_units_is_decreased_by_Cunmediated() throws Throwable {
        aod.corporateUnmediatedPostSetup();
        System.out.println("Previous :" + aod.CorporateUmmediatedPreviousUints);
        System.out.println("Post :" + aod.CorporateUmmediatedPostUints);
        aod.validateRemainingUnits(aod.CorporateUmmediatedPreviousUints - 1, aod.CorporateUmmediatedPostUints);
    }

    @Given("^I am in within the IP range of an institution which has Corporate Mediated AOD access$")
    public void I_am_in_within_the_IP_range_of_an_institution_which_has_Corporate_Mediated_AOD_access()
            throws Throwable {
        aod.corporateMediatedPreSetup();
    }

    @Then("^I should see a password screen$")
    public void I_should_see_a_password_screen() throws Throwable {
        aod.lnkAccessArticleViaNPGArticlesOnDemand().click();
    }

    @When("^I enter a valid password$")
    public void I_enter_a_valid_password() {
        aod.txtMediatedPassword().sendKeys("mediated");
        aod.btnOK().click();
    }

    @Then("^I am granted access via Corporate Mediated AOD Access$")
    public void I_am_granted_access_via_Corporate_Mediated_AOD_Access() throws Throwable {
        aod.validateAccess(" Test002");
    }

    @Then("^the number of units is decreased by 1 for Corporated Mediated AOD acess$")
    public void the_number_of_units_is_decreased_by_Cmediated() throws Throwable {
        aod.corporateMediatedPostSetup();
        System.out.println("Previous :" + aod.CorporateMediatedPreviousUints);
        System.out.println("Post :" + aod.CorporateMediatedPostUints);
        aod.validateRemainingUnits(aod.CorporateMediatedPreviousUints - 1, aod.CorporateMediatedPostUints);
    }

    @When("^I enter a invalid password$")
    public void I_enter_a_invalid_password() throws Throwable {
        aod.txtMediatedPassword().sendKeys("umediated");
        aod.btnOK().click();
    }

    @Then("^I am denied access via Corporate Mediated AOD Access$")
    public void I_am_denied_access_via_Corporate_Mediated_AOD_Access() throws Throwable {
        aod.validateAccessDenial();
    }

    @Given("^I am in within the IP range of an institution which has Licensed Unmediated AOD access units$")
    public void I_am_in_within_the_IP_range_of_an_institution_which_has_Licensed_Unmediated_AOD_access_units()
            throws Throwable {
        aod.licencedUnmediatedPreSetup();
    }

    @When("^I attempt to access a SciBX article$")
    public void I_attempt_to_access_a_SciBX_article() throws Throwable {
        aod.navigateToSciBX();
    }

    @Then("^I am granted access via Licensed Unmediated AOD access$")
    public void I_am_granted_access_via_Licensed_Unmediated_AOD_access() throws Throwable {
        aod.validateAccessSciBX(" Test003");
    }

    @Then("^the number of units is decreased by 1 for Licensed Unmediated AOD access$")
    public void the_number_of_units_is_decreased_by_Lunmediated() throws Exception {
        aod.licencedUnmediatedPostSetup();
        aod.validateRemainingUnits(aod.LicencedUmmediatedPreviousUints - 1, aod.LicencedUmmediatedPostUints);
    }

    @Given("^I am in within the IP range of an institution which has Licensed Mediated AOD access units$")
    public void I_am_in_within_the_IP_range_of_an_institution_which_has_Licensed_Mediated_AOD_access_units()
            throws Throwable {
        aod.licencedMediatedPreSetup();
    }

    @Then("^I am granted access via Licensed Mediated AOD access$")
    public void I_am_granted_access_via_Licensed_Mediated_AOD_access() throws Throwable {
        aod.validateAccess(" Test004");
    }

    @Then("^the number of units is decreased by 1 for Licensed Mediated AOD access$")
    public void the_number_of_units_is_decreased_by_1_for_Licensed_Mediated_AOD_access() throws Exception {
        aod.licencedMediatedPostSetup();
        aod.validateRemainingUnits(aod.LicencedMediatedPreviousUints - 1, aod.LicencedMediatedPostUints);
    }

    @Then("^I am denied access via Licensed Mediated AOD access$")
    public void I_am_denied_access_via_Licensed_Mediated_AOD_access() throws Throwable {
        aod.validateAccessDenial();
    }
}
