package com.orangehrm.testcases;

import com.orangehrm.driverscript.TestBase;
import com.orangehrm.pages.OrangeHRMLogOutPage;
import com.orangehrm.pages.OrangeHRMLoginPage;
import com.orangehrm.utilities.ReadDataFromHRMTestDataProp;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import java.io.IOException;

public class OrangeHRMLogOutTest extends TestBase {
    OrangeHRMLogOutPage logoutPage;

    @Test(priority = 1)
    public void logoutToApplication() throws InterruptedException {
        logoutPage = PageFactory.initElements(driver, OrangeHRMLogOutPage.class);
        logoutPage.clickUserProfile();
        logoutPage.clickLogout();

    }

    @Test (priority= 2)
    public void titleValidation() throws IOException {
        logoutPage = PageFactory.initElements(driver, OrangeHRMLogOutPage.class);
        String actualTitle = logoutPage.getTitleOfPage();
        Assert.assertEquals(actualTitle, ReadDataFromHRMTestDataProp.getPropData("expectedTitle"), "The Actaual and Expected Title is NOT same");
        Reporter.log("Actual Title  is " + actualTitle, true);
        Reporter.log("Expected Title is " + ReadDataFromHRMTestDataProp.getPropData("expectedTitle"),true);
        Reporter.log("", true);
    }
}
