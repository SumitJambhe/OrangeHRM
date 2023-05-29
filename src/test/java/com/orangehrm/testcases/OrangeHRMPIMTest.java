package com.orangehrm.testcases;

import com.orangehrm.driverscript.TestBase;
import com.orangehrm.pages.OrangeHRMPIMPage;
import com.orangehrm.pages.OrangeHRMPersonalDetailsPage;
import com.orangehrm.utilities.GenerateRandomNumber;
import com.orangehrm.utilities.ReadDataFromHRMTestDataProp;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import java.io.IOException;

public class OrangeHRMPIMTest extends TestBase {

    OrangeHRMPIMPage pim;

    @Test(priority = 1)
    public void addEmployee() throws IOException, InterruptedException {
        pim = PageFactory.initElements(driver, OrangeHRMPIMPage.class);
        pim.clickPIM();
        pim.clickAddEmployee();
        pim.enterFirstName(ReadDataFromHRMTestDataProp.getPropData("firstName"));
        pim.enterMiddleName(ReadDataFromHRMTestDataProp.getPropData("middleName"));
        pim.enterLastName(ReadDataFromHRMTestDataProp.getPropData("lastName"));
        pim.enterEmployeeId(GenerateRandomNumber.getRandomNumber());
        pim.clicksvbtn();
    }
}
