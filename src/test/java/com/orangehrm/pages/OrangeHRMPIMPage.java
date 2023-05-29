package com.orangehrm.pages;

import com.orangehrmw.objectrepository.ObjectRepository;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

import java.io.IOException;

public class OrangeHRMPIMPage {

    WebDriver driver;

    public OrangeHRMPIMPage(WebDriver driver)  {
        this.driver = driver;
    }

    // Initilize the webelements locators values using FINDBY class

    @FindBy(xpath= ObjectRepository.pimXpath)
    WebElement pim;

    @FindBy(xpath= ObjectRepository.addEmployeeXpath)
    WebElement addEmployee;

    @FindBy(xpath= ObjectRepository.firstNameXpath)
    WebElement firstName;

    @FindBy(xpath= ObjectRepository.middleNameXpath)
    WebElement middleName;

    @FindBy(xpath= ObjectRepository.lastNameXpath)
    WebElement lastName;

    @FindBy(xpath= ObjectRepository.employeeIdXpath)
    WebElement employeeId;

    @FindBy(xpath= ObjectRepository.svebtnXpath)
    WebElement svebtn;

    public void clickPIM() {
        pim.click();
        Reporter.log("PIM is Clicked", true);
    }

    public void clickAddEmployee() {
        addEmployee.click();
        Reporter.log("Add Employee is Clicked", true);
    }

    public void enterFirstName(String fName) throws IOException {
        firstName.clear();
        firstName.sendKeys(fName);
        Reporter.log("First Name is " + fName,true);
    }

    public void enterMiddleName(String mName) throws IOException {
        middleName.clear();
        middleName.sendKeys(mName);
        Reporter.log("Middle Name is " + mName,true);
    }

    public void enterLastName(String lName) throws IOException {
        lastName.clear();
        lastName.sendKeys(lName);
        Reporter.log("Last Name is " + lName,true);
    }

    public void enterEmployeeId(String empId) throws IOException {
        employeeId.clear();
        employeeId.sendKeys(empId);
        Reporter.log("Employee Id is " + empId,true);
    }

    public void clicksvbtn() {
        svebtn.click();
        Reporter.log("Save Button is Clicked", true);
    }
}
