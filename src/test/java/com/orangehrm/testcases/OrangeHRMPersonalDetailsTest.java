package com.orangehrm.testcases;

import com.orangehrm.driverscript.TestBase;
import com.orangehrm.pages.OrangeHRMPersonalDetailsPage;
import com.orangehrm.utilities.ReadDataFromHRMTestDataProp;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class OrangeHRMPersonalDetailsTest extends TestBase {

    OrangeHRMPersonalDetailsPage personalDetails;

    @Test(priority = 1)
    public void fillPersonalDetails() throws IOException, InterruptedException {
        personalDetails = PageFactory.initElements(driver, OrangeHRMPersonalDetailsPage.class);
        personalDetails.enterNickName(ReadDataFromHRMTestDataProp.getPropData("nikname"));
        personalDetails.enterOtherID(ReadDataFromHRMTestDataProp.getPropData("otherId"));
        personalDetails.enterDrivingLicenseNum(ReadDataFromHRMTestDataProp.getPropData("drivingLicenseNum"));
        personalDetails.selectDrivingLicenseExDate(ReadDataFromHRMTestDataProp.getPropData("drivingLicenseExDate"));
        personalDetails.enterSSNNum(ReadDataFromHRMTestDataProp.getPropData("ssn"));
        personalDetails.enterSINNum(ReadDataFromHRMTestDataProp.getPropData("sin"));
        personalDetails.clickNationalityDropdown();
        personalDetails.selectNationality(ReadDataFromHRMTestDataProp.getPropData("nationality"));
        personalDetails.selectGenderRadioBtn(ReadDataFromHRMTestDataProp.getPropData("genderRadioBtn"));
        personalDetails.selectSmokeStatus(ReadDataFromHRMTestDataProp.getPropData("smokeStatus"));
        personalDetails.clickSaveButton();
        personalDetails.clickBloodGroupButton();
        personalDetails.selectBloodGroup(ReadDataFromHRMTestDataProp.getPropData("bloodgroup"));

    }
}
