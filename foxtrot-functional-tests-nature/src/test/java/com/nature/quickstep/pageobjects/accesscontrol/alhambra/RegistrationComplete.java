package com.nature.quickstep.pageobjects.accesscontrol.alhambra;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;

import com.nature.quickstep.pageobjects.PageObject;

public class RegistrationComplete extends PageObject {

    @Override
    public boolean isPresent() {
        return false;
    }

    @Override
    public void navigateTo() {
        // TODO Auto-generated method stub
    }

    public String getRegistrationCompleteMsg() {
        return browser().findElement(By.xpath(".//*[@id='page-title']/h1")).getText();
    }

    public String getLocationAddress() {
        return browser().getCurrentUrl();
    }

    public int totalVisibleDots() {
        return (browser().findElements(By.xpath(".//*[@id='progress']/span[@class='circle completed']"))).size();
    }

    public void validateRegistrationCompleteMsg() {
        assertEquals("Thank you for registering at nature.com, you are almost done", getRegistrationCompleteMsg());
        assertEquals(3, totalVisibleDots());

    }
}
