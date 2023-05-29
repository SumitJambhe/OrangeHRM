package com.orangehrm.testcases;

import com.orangehrm.driverscript.TestBase;
import com.orangehrm.pages.OrangeHRMQualificationPage;
import com.orangehrm.utilities.ReadDataFromHRMTestDataProp;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import java.io.IOException;

public class OrangeHRMQualificationTest extends TestBase {

    OrangeHRMQualificationPage qualificationPage;

//    @Test(priority = 1)
//    public void NavigateToMyInfo() throws InterruptedException {
//        qualificationPage = PageFactory.initElements(driver, OrangeHRMQualificationPage.class);
//        qualificationPage.clickmyInfo();
//
//    }

    @Test(priority = 2)
    public void NavigateToQualification() throws InterruptedException {
        qualificationPage = PageFactory.initElements(driver, OrangeHRMQualificationPage.class);
        qualificationPage.clickQualification();

    }

    @Test(priority = 3)
    public void addWorkExperience() throws InterruptedException, IOException {
        qualificationPage = PageFactory.initElements(driver, OrangeHRMQualificationPage.class);
        qualificationPage.clickAddExperienceButton();
        qualificationPage.enterCompanyName(ReadDataFromHRMTestDataProp.getPropData("companyName"));
        qualificationPage.enterJobTitle(ReadDataFromHRMTestDataProp.getPropData("jobtitle"));
        qualificationPage.selectFromDate(ReadDataFromHRMTestDataProp.getPropData("fromDate"));
        qualificationPage.selectToDate(ReadDataFromHRMTestDataProp.getPropData("toDate"));
        qualificationPage.enterComment(ReadDataFromHRMTestDataProp.getPropData("comment"));
        qualificationPage.clickWorkExSaveBtn();
    }
    @Test(priority = 4)
    public void addEducationDetails() throws InterruptedException, IOException {
        qualificationPage = PageFactory.initElements(driver, OrangeHRMQualificationPage.class);
        qualificationPage.clickAddEducationButton();
        qualificationPage.clickEducationLevelDrop();
        qualificationPage.selectMasterDegree("Master's Degree");
        qualificationPage.enterInstituteName(ReadDataFromHRMTestDataProp.getPropData("instituteName"));
        qualificationPage.enterSpecalzation(ReadDataFromHRMTestDataProp.getPropData("specialization"));
        qualificationPage.enterYear(ReadDataFromHRMTestDataProp.getPropData("year"));
        qualificationPage.enterCGPA(ReadDataFromHRMTestDataProp.getPropData("cgpa"));
        qualificationPage.selectStartDate(ReadDataFromHRMTestDataProp.getPropData("startDate"));
        qualificationPage.selectEndDate(ReadDataFromHRMTestDataProp.getPropData("endDate"));
        qualificationPage.clickCancelButton();
    }
}
