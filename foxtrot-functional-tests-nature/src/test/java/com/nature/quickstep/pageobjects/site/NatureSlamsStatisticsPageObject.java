package com.nature.quickstep.pageobjects.site;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByLinkText;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import com.nature.quickstep.pageobjects.PageObject;
import com.nature.quickstep.util.WebDriverUtils;

public class NatureSlamsStatisticsPageObject extends PageObject {

    private static String NPG_USAGE_REPORTS_URL = "Nature Publishing Group usage reports";
    private static String PALGRAVE_USAGE_REPORTS_URL = "Palgrave Macmillan Journals usage reports";

    @Override
    public void navigateTo() {
        browser().get(context().getURL("nature.com/nams/svc/mysiteaccount"));

    }

    public void loginSlam(String email, String password) throws Exception {

        fldEmailaddress().sendKeys(email);
        fldPassword().sendKeys(password);
        btnLogin().click();
        WebDriverUtils.waitForURLToContainSubstring(browser(), "nature.com/nams/svc/mysiteaccount");
    }

    public void clickStatics() throws Exception {
        lnkStatics().click();
        WebDriverUtils.waitForURLToContainSubstring(browser(), "nature.com/nams/svc/mysiteaccount/show/statistics");
    }

    public WebElement fldEmailaddress() {
        ensure().element(By.id("userid")).seconds(15);
        return browser().findElement(By.id("userid"));
    }

    public WebElement fldPassword() {
        ensure().element(By.id("password")).seconds(15);
        return browser().findElement(By.id("password"));
    }

    public void clickNatureUsageReport() throws Exception {
        String script = "return arguments[0].target = '" + "'";
        clickOnALinkToRedirect(script, NPG_USAGE_REPORTS_URL);

    }

    public void clickPalgraveUsageReport() throws Exception {
        String script = "return arguments[0].target = '" + "'";
        clickOnALinkToRedirect(script, PALGRAVE_USAGE_REPORTS_URL);

    }

    public WebElement btnLogin() {
        return browser().findElement(By.id("loginbtn"));
    }

    public void validateNatureUrl() {
        String currentUrl = browser().getCurrentUrl();
        assertEquals("https://www.mpsinsight.com/npg", currentUrl);
    }

    public void validatePalgraveUrl() {
        String currentUrl = browser().getCurrentUrl();
        assertEquals("https://www.mpsinsight.com/pal", currentUrl);
    }

    @Override
    public boolean isPresent() {
        // TODO Auto-generated method stub
        return false;
    }

    private void clickOnALinkToRedirect(String script, String linkText) throws Exception {
        ensure().element(ByLinkText.linkText(linkText)).seconds(15);
        WebElement webElement = browser().findElement(ByLinkText.linkText(linkText));
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) browser();
        javascriptExecutor.executeScript(script, webElement);
        webElement.click();
    }

    private WebElement lnkStatics() throws Exception {
        ensure().element(ByLinkText.linkText("Statistics")).seconds(15);
        return browser().findElement(ByLinkText.linkText("Statistics"));
    }

}
