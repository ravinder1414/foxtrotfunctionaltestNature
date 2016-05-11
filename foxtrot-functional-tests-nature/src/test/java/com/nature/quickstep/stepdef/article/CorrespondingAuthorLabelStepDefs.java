package com.nature.quickstep.stepdef.article;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.Assert.assertEquals;

import com.nature.quickstep.pageobjects.article.CorrespondingAuthorArticle;

public class CorrespondingAuthorLabelStepDefs {

    private CorrespondingAuthorArticle article = new CorrespondingAuthorArticle();

    @Given("^an article has one or more authors that are corresponding authors$")
    public void anArticleHasOneOrMoreAuthorsThatAreCorrespondingAuthors() throws Throwable {
        article.navigateTo();
    }

    @When("^the name of one of the authors that is a corresponding author is clicked$")
    public void theNameOfOneOfTheAuthorsThatIsACorrespondingAuthorIsClicked() throws Throwable {
        article.clickCorresAuthor();
    }

    @Then("^the author information pop-up opens and contains a heading 'Corresponding author'$")
    public void theAuthorInformationPopUpOpensAndContainsAHeadingCorrespondingAuthor() throws Throwable {
        article.corresAuthorLabel().isDisplayed();
        assertEquals("Corresponding author", article.corresAuthorLabel().getText());
    }

    @And("^the link to contact the author appears below$")
    public void theLinkToContactTheAuthorAppearsBelow() throws Throwable {
        article.contactCorresAuthorLink();
    }

}
