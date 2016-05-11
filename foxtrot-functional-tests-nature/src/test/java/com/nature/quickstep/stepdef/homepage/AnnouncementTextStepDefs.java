package com.nature.quickstep.stepdef.homepage;

import com.nature.quickstep.pageobjects.homepage.AipHomepage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class AnnouncementTextStepDefs {

    private AipHomepage homepage = new AipHomepage();

    @And("^If one or more annuncements displayed on the page$")
    public boolean thereShouldBeOneOrMoreAnnuncementsDisplayedOnThePage() throws Throwable {
        return homepage.announcementBoxIsPresent();
    }

    @Then("^the maximum number of characters for each annoucement should be \"([^\"]*)\"$")
    public void theMaximumNumberOfCharactersForEachAnnoucementShouldBe(int maxLength) throws Throwable {
        if (thereShouldBeOneOrMoreAnnuncementsDisplayedOnThePage()) {
            homepage.validateAnnouncementsTextLength(maxLength, 2);
        }
    }

}
