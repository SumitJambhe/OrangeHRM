package com.orangehrm.testcases;

import com.orangehrm.driverscript.TestBase;
import com.orangehrm.pages.OrangeHRMForgotPasswordPage;
import com.orangehrm.pages.OrangeHRMLogOutPage;
import com.orangehrm.utilities.ReadDataFromHRMTestDataProp;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import java.io.IOException;

public class OrangeHRMForgotPasswordTest extends TestBase {
    OrangeHRMForgotPasswordPage forgotPwd;

    @Test(priority = 1)
    public void resetPassword() throws InterruptedException, IOException {
        forgotPwd = PageFactory.initElements(driver, OrangeHRMForgotPasswordPage.class);
        forgotPwd.clickOnForgotPasswordLink();
        forgotPwd.enterUsername(ReadDataFromHRMTestDataProp.getPropData("username"));
        forgotPwd.clickOnresetPasswordButton();
    }

    @Test (priority= 2)
    public void successfulMsgValidatiion() throws IOException {
        forgotPwd = PageFactory.initElements(driver, OrangeHRMForgotPasswordPage.class);
        String actualSuccessfulMsg = forgotPwd.getlinkSendSuccessfulMsg();
        Assert.assertEquals(actualSuccessfulMsg, ReadDataFromHRMTestDataProp.getPropData("expectedSuccessfulMessage"), "The Actaual and Expected Message is NOT same");
        Reporter.log("Actual Successful Message  is  " + actualSuccessfulMsg, true);
        Reporter.log("Expected Successful Message is " + ReadDataFromHRMTestDataProp.getPropData("expectedSuccessfulMessage"),true);

    }
}
