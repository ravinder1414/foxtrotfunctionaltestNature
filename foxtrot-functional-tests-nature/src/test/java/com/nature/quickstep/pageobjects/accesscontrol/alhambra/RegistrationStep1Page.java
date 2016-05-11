package com.nature.quickstep.pageobjects.accesscontrol.alhambra;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.nature.quickstep.pageobjects.PageObject;
import com.nature.quickstep.pageobjects.homepage.HomePage;

/**
 * The class represents functions related to the registration process on
 * nature.com. It encapsulates functionality of both page 1 and page 2.
 * 
 * @author mark.micallef
 * 
 */
public class RegistrationStep1Page extends PageObject {

    HomePage home = new HomePage();

    /**
     * Navigates to the page being represented, ideally using the same method
     * that a user would. <BR>
     * <BR>
     * <b>Note:</b>Should be implemented by every page object.
     * 
     */
    @Override
    public void navigateTo() {
        // TODO We are using it for dark live registration
        browser().get(context().getURL("nature.com/alhambra/register"));
    }

    /**
     * Checks whether the page or object represented by the page object is
     * currently present in the browser().
     * 
     * @return <code>true</code> if present, <code>false</code> if not
     */
    @Override
    public boolean isPresent() {
        return false;
    }

    /**
     * @return First name text box WebElement
     */
    public WebElement txtFirstName() {
        return browser().findElement(By.id("firstName"));
    }

    /**
     * @return Last name text box WebElement
     */
    public WebElement txtLastName() {
        return browser().findElement(By.id("lastName"));
    }

    /**
     * @return Middle name text box WebElement
     */
    public WebElement txtMiddleName() {
        return browser().findElement(By.id("middleName"));
    }

    /**
     * @return Email text box WebElement
     */
    public WebElement txtEmail() {
        return browser().findElement(By.id("email"));
    }

    /**
     * @return Password text box WebElement
     */
    public WebElement txtPassword() {
        return browser().findElement(By.id("password"));
    }

    /**
     * @return Confirm password text box WebElement
     */
    public WebElement txtConfirmPassword() {
        return browser().findElement(By.id("confirmPassword"));
    }

    /**
     * @return Date of birth text box WebElement
     */
    public WebElement txtDateOfBirth() {
        return browser().findElement(By.id("dateOfBirth"));
    }

    /**
     * @return Register button WebElement
     */
    public WebElement btnRegister() {
        return browser().findElement(By.xpath("//input[@class='button form-submit']"));
    }

    /**
     * @return Field user already logged in text
     */
    public WebElement fldErrorUserAlreadyLoggedIn() {
        return browser().findElement(By.xpath("//body"));
    }

    /**
     * Validates that the browser is currently showing the step 1 registration page.
     * 
     * @throws Exception
     *             if not showing
     */
    public void validateStep1RegistrationPagePresent() throws Exception {
        assertEquals(context().getURL("nature.com/mockalhambra/register"), browser().getCurrentUrl());
    }

    public void validateUserAlreadyLogin() throws Exception {
        assertEquals(context().getURL("nature.com/alhambra/register"), browser().getCurrentUrl());
        assertEquals("already logged In", fldErrorUserAlreadyLoggedIn().getText());
    }

    /**
     * This method completes the step1 registration of Nature-Alhambra
     * 
     * @throws Exception
     */

    public void completeStep1Registration() throws Exception {
        final String testEmail = "AlhambraTest" + System.currentTimeMillis() + "@mailinator.com";

        txtFirstName().sendKeys("AlhambraFirst");
        txtLastName().sendKeys("AlhambraLast");
        txtMiddleName().sendKeys("AlhambraMiddle");

        txtEmail().sendKeys(testEmail);
        txtPassword().sendKeys("saltalhambra");
        txtConfirmPassword().sendKeys("saltalhambra");

        txtDateOfBirth().sendKeys("15/08/1947");
        btnRegister().click();

    }
}
