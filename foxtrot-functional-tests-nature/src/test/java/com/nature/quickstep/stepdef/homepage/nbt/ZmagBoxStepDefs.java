package com.nature.quickstep.stepdef.homepage.nbt;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import com.nature.quickstep.pageobjects.homepage.nbt.NbtHomepage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ZmagBoxStepDefs {
    NbtHomepage nbt = new NbtHomepage();

    @Then("^The Zmags box appears on the page$")
    public void theZmagsBoxAppearsOnThePage() throws Throwable {
        nbt.zMagsBox().isDisplayed();
    }

    @And("^The should display the text 'The free magazine for business partnerships'$")
    public void theShouldDisplayTheTextTheFreeMagazineForBusinessPartnerships() throws Throwable {
        assertEquals("The FREE magazine for business partnerships", nbt.zMagsBox().getText());
    }

    @When("^The user clicks on the box$")
    public void theBoxShouldLinkToTheSponsorsPage() throws Throwable {
        nbt.zMagsBox().click();
    }

    @Then("^The user is navigated to the biopharmadealmakers zmag page$")
    public void TheUserIsNavigatedToSponsorsPage() throws Throwable {
        assertTrue(nbt.getCurrentAddress().contains("http://viewer.zmags.com/publication/"));
    }

}
