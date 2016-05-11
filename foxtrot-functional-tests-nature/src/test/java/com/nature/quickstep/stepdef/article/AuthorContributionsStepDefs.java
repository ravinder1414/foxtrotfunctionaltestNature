package com.nature.quickstep.stepdef.article;

import com.nature.quickstep.pageobjects.article.AuthorContributionsFn;
import static org.junit.Assert.assertEquals;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;

public class AuthorContributionsStepDefs {

    AuthorContributionsFn article = new AuthorContributionsFn();

    @Given("^the information is marked up as an author footnote$")
    public void thisInformationIsMarkedUpAsAnAuthorFootnote() throws Throwable {
        article.navigateTo();
    }

    @When("^the name of one of the authors that has jointly supervised is clicked$")
    public void theNameOfOneOfTheAuthorsThatHasJointlySupervisedIsClicked() throws Throwable {
        article.contributedAuthor2().click();
    }

    @Then("^the author information pop-up opens and contains the statement, \"([^\"]*)\" in bold with all of the \"([^\"]*)\" listed below the heading$")
    public void theAuthorInformationPopUpOpensAndContainsTheStatementInBoldWithAllOfTheListedBelowTheHeading(
            String statement, String authors) throws Throwable {
        article.contributionPopup().isDisplayed();
        assertEquals(statement, article.popupStatement().getText());
        assertEquals(authors, article.popupAuthors().getText());
    }

    @And("^the author information section contains the statement, \"([^\"]*)\" with all of the \"([^\"]*)\" who contributed equally displayed below the heading.$")
    public void theAuthorInformationSectionContainsTheStatementWithAllOfTheWhoContributedEquallyDisplayedBelowTheHeading(
            String statement, String authors) throws Throwable {
        assertEquals(statement, article.contributionStatement1().getText());
        assertEquals(authors, article.footnotesAuthors1().getText());
    }

    @When("^the name of one of the authors that has contributed equally is clicked$")
    public void theNameOfOneOfTheAuthorsThatHasContributedEquallyIsClicked() throws Throwable {
        article.contributedAuthor1().click();
    }

    @And("^the author information section contains the statement, \"([^\"]*)\" with all of the \"([^\"]*)\" who jointly supervised displayed below the heading.$")
    public void theAuthorInformationSectionContainsTheStatementWithAllOfTheWhoJointlySupervisedDisplayedBelowTheHeading(
            String statement, String authors) throws Throwable {
        assertEquals(statement, article.contributionStatement2().getText());
        assertEquals(authors, article.footnotesAuthors2().getText());
    }
}
