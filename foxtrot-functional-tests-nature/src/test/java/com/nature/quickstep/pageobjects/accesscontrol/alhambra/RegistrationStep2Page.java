package com.nature.quickstep.pageobjects.accesscontrol.alhambra;

import static org.junit.Assert.assertEquals;

import org.apache.commons.lang.StringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.nature.quickstep.pageobjects.PageObject;

public class RegistrationStep2Page extends PageObject {

    @Override
    public void navigateTo() {

    }

    @Override
    public boolean isPresent() {
        return false;
    }

    /**
     * @return Job Title Error Message object
     */
    public WebElement fldErrorJobDetail() {
        return browser().findElement(By.xpath("//p[@for='jobTitle']"));
    }

    /**
     * @return Affiliation/Employer text box object
     */
    public WebElement txtAffiliation() {
        return browser().findElement(By.id("company"));
    }

    /**
     * @return Affiliation/Employer Error Message object
     */
    public WebElement fldErrorAffiliation() {
        return browser().findElement(By.xpath("//p[@for='employer']"));
    }

    /**
     * @return Industry Error Message object
     */
    public WebElement fldErrorIndustry() {
        return browser().findElement(By.xpath("//p[@for='industry']"));
    }

    /**
     * @return Area of interest Error Message object
     */
    public WebElement fldErrorAreaOfInterest() {
        return browser().findElement(By.xpath("//p[@for='areaOfInterest']"));
    }

    /**
     * @return Specialities Error Message object
     */
    public WebElement fldErrorSpecialities() {
        return browser().findElement(By.xpath("//p[@for='primarySpeciality']"));
    }

    /**
     * @return Terms and conditions Error Message object
     */
    public WebElement fldErrorTermsAndConditions() {
        return browser().findElement(By.xpath("//*[@id='helper-agreeToTerms']/div/div/div/p"));
    }

    public WebElement btnRegisterStep2Signup() {
        return browser().findElement(By.xpath("//input[@class='form-button form-submit']"));
    }

    public WebElement fldSelectJobTitle() {
        return browser().findElement(By.id("jobTitle"));
    }

    public WebElement fldSelectIndustry() {
        return browser().findElement(By.id("industry"));
    }

    public WebElement fldInputEmployer() {
        return browser().findElement(By.id("employer"));
    }

    /**
     * Submits the empty Form
     */
    public void submitEmptyStep2SignUpForm() {
        btnRegisterStep2Signup().click();
    }

    /**
     * Submits the Form
     */
    public void submitIncompleteStep2SignUpForm() {
        fldInputEmployer().sendKeys("MPS");
        fldSelectJobTitle().sendKeys("Business Consultant");
        btnRegisterStep2Signup().click();
    }

    /**
     * Step 2 Registration Form which validates step2 Registration Form Error
     * Messages
     */
    public void validateStep2RegistrationFormErrorMessages() {
        assertEquals("Job Title is required.", fldErrorJobDetail().getText());
        assertEquals("Affiliation/Employer is required", fldErrorAffiliation().getText());
        assertEquals("Industry is required.", fldErrorIndustry().getText());
        assertEquals("Area of Interest is required.", fldErrorAreaOfInterest().getText());
        assertEquals("This field is required.", fldErrorSpecialities().getText());

    }

    public void validateStep2RegistrationFormErrorMessagesAndFilledValues() {
        assertEquals("MPS", fldInputEmployer().getAttribute("value"));
        assertEquals("Business Consultant", new Select(fldSelectJobTitle()).getFirstSelectedOption().getText());

        assertEquals("Industry is required.", fldErrorIndustry().getText());
        assertEquals("Area of Interest is required.", fldErrorAreaOfInterest().getText());
        assertEquals("This field is required.", fldErrorSpecialities().getText());
    }

    /**
     * Validates the pre-populated field for Affiliation/Employer text box
     */
    public void validateAffiliationPrePopoulatedfield() {
        assertEquals(txtAffiliation().getText(), "");
    }

    public WebElement fldSelectAreaOfIntrest() {
        return browser().findElement(By.xpath(".//*[@id='areaOfInterest']"));
    }

    public WebElement fldSelectPrimarySpeciality() {
        return browser().findElement(By.xpath(".//*[@id='primarySpeciality']"));
    }

    public WebElement fldSelectSecondarySpeciality() {
        return browser().findElement(By.xpath(".//*[@id='secondarySpeciality']"));
    }

    public WebElement fldSelectCountry() {
        return browser().findElement(By.xpath(".//*[@id='country']"));
    }

    public WebElement fldCheckboxtermsConditions() {
        return browser().findElement(By.id("agreeToTerms"));
    }

    public void submitCompletelyFilledStep2registrationFormWhenJSEnabled() throws InterruptedException {
        if (StringUtils.isBlank(fldInputEmployer().getAttribute("value"))) {
            fldInputEmployer().sendKeys("NPG");
        }
        new Select(fldSelectJobTitle()).selectByVisibleText("Business Consultant");
        new Select(fldSelectIndustry()).selectByVisibleText("Biotechnology");
        new Select(fldSelectAreaOfIntrest()).selectByVisibleText("Chemistry");
        // Wait to populate primary speciality based on Area Of Interest
        Thread.sleep(10000);
        new Select(fldSelectPrimarySpeciality()).selectByVisibleText("Chemical Biology");
        new Select(fldSelectSecondarySpeciality()).selectByVisibleText("Chemical Biology");
        new Select(fldSelectCountry()).selectByVisibleText("United Kingdom");
        fldCheckboxtermsConditions().click();
        btnRegisterStep2Signup().click();

    }

    /**
     * Continue button to populate specialties when JS is disabled
     */
    public WebElement btnToPopulateSpecialties() {
        return browser().findElement(By.xpath(".//*[@id='about-yourself']/li[5]/input"));
    }

    public void submitCompletelyFilledStep2registrationFormWhenJSDisabled() throws InterruptedException {
        if (StringUtils.isBlank(fldInputEmployer().getAttribute("value"))) {
            fldInputEmployer().sendKeys("NPG");
        }
        new Select(fldSelectJobTitle()).selectByVisibleText("Business Consultant");
        new Select(fldSelectIndustry()).selectByVisibleText("Biotechnology");
        new Select(fldSelectAreaOfIntrest()).selectByVisibleText("Chemistry");
        btnToPopulateSpecialties().click();
        new Select(fldSelectPrimarySpeciality()).selectByVisibleText("Chemical Biology");
        new Select(fldSelectSecondarySpeciality()).selectByVisibleText("Chemical Biology");
        new Select(fldSelectCountry()).selectByVisibleText("United Kingdom");
        fldCheckboxtermsConditions().click();
        btnRegisterStep2Signup().click();

    }

}
