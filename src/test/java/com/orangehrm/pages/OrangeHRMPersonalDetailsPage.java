package com.orangehrm.pages;

import com.orangehrm.utilities.ReadDataFromHRMTestDataProp;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

import com.orangehrmw.objectrepository.ObjectRepository;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class OrangeHRMPersonalDetailsPage {

    WebDriver driver;

    public OrangeHRMPersonalDetailsPage(WebDriver driver) throws InterruptedException {
        this.driver = driver;
    }

    // Initilize the webelements locators values using FINDBY class

    @FindBy(xpath= ObjectRepository.myInfoXpath)
    WebElement myInfo;
    @FindBy(xpath= ObjectRepository.personalDetailsXpath )
    WebElement personalDetails;

    @FindBy(xpath=ObjectRepository.nickNameXpath)
    WebElement nickName;

    @FindBy(xpath= ObjectRepository.otherIDXpath)
    WebElement otherID;

    @FindBy(xpath= ObjectRepository.drivingLicenseNumXpath)
    WebElement drivingLicenseNum;

    @FindBy(xpath=ObjectRepository.drivingLicenseExDateXpath)
    WebElement drivingLicenseExDate;

    @FindBy(xpath= ObjectRepository.ssnNumberXpath)
    WebElement ssnNumber;

    @FindBy(xpath= ObjectRepository.sinNumberXpath)
    WebElement sinNumber;

    @FindBy(xpath= ObjectRepository.nationalityDropdownXpath)
    WebElement nationalityDropdown;

    @FindBy(xpath=ObjectRepository.genderMaleXpath)
    WebElement genderMale;

    @FindBy(xpath=ObjectRepository.genderFemaleXpath)
    WebElement genderFemale;

    @FindBy(xpath=ObjectRepository.smokeStatusXpath)
    WebElement smokeStatus;

    @FindBy(xpath= ObjectRepository.saveButtonXpath)
    WebElement saveButton;


    @FindBy(xpath= ObjectRepository.bloodGroupDropdownXpath)
    WebElement bloodGroupDropdown;


    @FindBy(xpath= ObjectRepository.bloodGroupXpath)
    WebElement bloodGroup;

    @FindBy(xpath= ObjectRepository.saveButtonTwoXpath)
    WebElement saveButtonTwo;

//    public void clickmyInfo() {
//        myInfo.click();
//        Reporter.log("My Info is Clicked",true);
//    }
//    public void clickPersonalDeails() {
//        personalDetails.click();
//        Reporter.log("Personal Details is Clicked", true);
//    }

    public void enterNickName(String nName) throws IOException {
        nickName.clear();
        nickName.sendKeys(nName);
        Reporter.log("Nick Name is " + nName,true);
    }

    public void enterOtherID(String otherId) {
        otherID.clear();
        otherID.sendKeys(otherId);
        Reporter.log("Other ID is " + otherId,true);
    }

    public void selectDrivingLicenseExDate(String drivingLicExDate) {
        drivingLicenseExDate.clear();
        drivingLicenseExDate.sendKeys(drivingLicExDate);
        Reporter.log("Driving License  Expiry Date is " + drivingLicExDate,true);
    }

    public void enterSSNNum(String ssnNumberInput) {
        ssnNumber.clear();
        ssnNumber.sendKeys(ssnNumberInput);
        Reporter.log("SSN  Number is " + ssnNumberInput,true);
    }

    public void enterSINNum(String sinNumberInut) {
        sinNumber.clear();
        sinNumber.sendKeys(sinNumberInut);
        Reporter.log("SIN  Number is " + sinNumberInut,true);
    }

    public void clickNationalityDropdown() throws IOException {
        nationalityDropdown.click();
        Reporter.log("Nationality Dropdown is Clicked", true);
    }
    public void selectNationality(String nationalityInput) {
        String NationalityInitial = nationalityInput.substring(0, 1);
        Actions act=new Actions(driver);
            act.sendKeys(NationalityInitial).perform();
            act.sendKeys(NationalityInitial).perform();
            act.sendKeys(NationalityInitial).perform();
            act.sendKeys(Keys.ENTER).build().perform();
            Reporter.log("Nationality Selected is " + nationalityInput ,true);
        }

    public void enterDrivingLicenseNum(String drivingID) {
        drivingLicenseNum.clear();
        drivingLicenseNum.sendKeys(drivingID);
        Reporter.log("Driving License  Number is " + drivingID,true);
    }

    public void selectGenderRadioBtn(String gender) {
        if (gender.equalsIgnoreCase("Male")) {
            genderMale.click();
            Reporter.log("Male Radio Button is Selected",true);
        }
        else if (gender.equalsIgnoreCase("Female")) {
            genderFemale.click();
            Reporter.log("Female Radio Button is Selected",true);
        }

    }

    public void selectSmokeStatus(String status) {
        if (smokeStatus.isSelected() && status.equalsIgnoreCase("NO")) {
            // Code to uncheck the Smoke Status
            smokeStatus.click();
            Reporter.log("Smoke Status is Deselected", true);
        } else if (status.equalsIgnoreCase("YES")) {
            // Code to check the Smoke Status
            smokeStatus.click();
            Reporter.log("Smoke Status is selected", true);
        }
    }

    public void clickSaveButton() {
        saveButton.click();
        Reporter.log("Save Button is Clicked", true);
    }

    public void clickBloodGroupButton() {
        bloodGroupDropdown.click();
        Reporter.log("Blood Group Dropdown is Clicked", true);
    }

    public void selectBloodGroup(String bloodGroup) {
        Actions act=new Actions(driver);
        if (bloodGroup.contains("+")){
            String blood = bloodGroup.substring(0, 1);
            act.sendKeys(blood).perform();
            act.sendKeys(Keys.ENTER).perform();
            Reporter.log("Blood Group Selected is " + bloodGroup ,true);
        } else if (bloodGroup.contains("-")) {
            act.sendKeys(bloodGroup).sendKeys(Keys.ENTER).sendKeys(Keys.ENTER).build().perform();
            Reporter.log("Blood Group Selected is " + bloodGroup ,true);
        }
    }

//    public void selectBloodGroup() throws InterruptedException {
//        bloodGroup.click();
//        Reporter.log("Blood Group Selected is O+ ",true);
//    }

    public void clickSaveButtonTwo() {
        saveButtonTwo.click();
        Reporter.log("Save Button Two is Clicked", true);
    }

}