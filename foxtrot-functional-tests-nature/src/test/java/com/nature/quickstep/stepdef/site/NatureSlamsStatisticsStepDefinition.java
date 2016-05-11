package com.nature.quickstep.stepdef.site;

import com.nature.quickstep.pageobjects.site.NatureSlamsStatisticsPageObject;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class NatureSlamsStatisticsStepDefinition {
    NatureSlamsStatisticsPageObject natureSlamsStatisticsObj = new NatureSlamsStatisticsPageObject();

    @Given("^I am a SLAM user on nature.com and I navigate to My Site Account$")
    public void I_am_a_SLAM_user_on_nature_com_and_I_navigate_to_My_Site_Account() throws Throwable {
        natureSlamsStatisticsObj.navigateTo();
        natureSlamsStatisticsObj.loginSlam("att", "qwer1234");
    }

    @When("^I navigate to Statistics page in Nature SLAMS$")
    public void I_navigate_to_Statistics_page_in_Nature_SLAMS() throws Throwable {
        natureSlamsStatisticsObj.clickStatics();
    }

    @When("^I click on link Palgrave Macmillan Journals Usage reports$")
    public void I_click_on_link_Palgrave_Macmillan_Journals_Usage_reports() throws Throwable {
        natureSlamsStatisticsObj.clickPalgraveUsageReport();
    }

    @Then("^I should redirect to new MpsInsight site to see palgrave Usage reports$")
    public void I_should_redirect_to_new_MpsInsight_site_to_see_palgrave_Usage_reports() throws Throwable {
        natureSlamsStatisticsObj.validatePalgraveUrl();
    }

    @When("^I click on link Nature Publishing Group usage Reports$")
    public void I_click_on_link_Nature_Publishing_Group_usage_Reports() throws Throwable {
        natureSlamsStatisticsObj.clickNatureUsageReport();
    }

    @Then("^I should redirect to new MpsInsight site to see nature Usage reports$")
    public void I_should_redirect_to_new_MpsInsight_site_to_see_nature_Usage_reports() throws Throwable {
        natureSlamsStatisticsObj.validateNatureUrl();
    }

}
