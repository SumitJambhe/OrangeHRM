package com.orangehrm.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

import com.orangehrmw.objectrepository.ObjectRepository;

public class OrangeHRMQualificationPage {

	WebDriver driver;	
	
	public OrangeHRMQualificationPage(WebDriver driver) {
		this.driver = driver;
	}	
		
	// Initilize the webelements locators values using FINDBY class	
	@FindBy(xpath= ObjectRepository.myInfoXpath) 
	WebElement myInfo;

	@FindBy(xpath= ObjectRepository.qualificationXpath)
	WebElement qualification;

	@FindBy(xpath= ObjectRepository.addWorkExpBtnXpath)
	WebElement addWorkExpBtn;

	@FindBy(xpath= ObjectRepository.companyNameXpath)
	WebElement companyName;

	@FindBy(xpath= ObjectRepository.jobTitleXpath)
	WebElement jobTitle;

	@FindBy(xpath= ObjectRepository.fromDateXpath)
	WebElement fromDate;

	@FindBy(xpath= ObjectRepository.toDateXpath)
	WebElement toDate;

	@FindBy(xpath= ObjectRepository.commentXpath)
	WebElement comment;

	@FindBy(xpath= ObjectRepository.workExpSaveBtnXpath)
	WebElement workExpSaveBtn;

	@FindBy(xpath= ObjectRepository.addEducationButtonXpath)
	WebElement addEducationButton;

	@FindBy(xpath= ObjectRepository.educationLevelDropXpath)
	WebElement educationLevelDrop;

	@FindBy(xpath= ObjectRepository.masterDegreeXpath)
	WebElement masterDegree;


	@FindBy(xpath= ObjectRepository.instituteXpath)
	WebElement institute;

	@FindBy(xpath= ObjectRepository.specializationXpath)
	WebElement specialization;

	@FindBy(xpath= ObjectRepository.yearXpath)
	WebElement year;

	@FindBy(xpath= ObjectRepository.cgpaXpath)
	WebElement cgpa;


	@FindBy(xpath= ObjectRepository.startDateXpath)
    WebElement startDate;

	@FindBy(xpath= ObjectRepository.endDateXpath)
	WebElement endDate;

	@FindBy(xpath= ObjectRepository.cancelButtonXpath)
	WebElement cancelButton;
//	public void clickmyInfo() {
//		myInfo.click();
//		Reporter.log("My Info is Clicked",true);
//	}

	public void clickQualification() {
		qualification.click();
		Reporter.log("Qualification is Clicked",true);
	}

	public void clickAddExperienceButton() {
		addWorkExpBtn.click();
		Reporter.log("Add Work Experience Button is Clicked",true);
	}
	public void enterCompanyName(String cName) {
		companyName.sendKeys(cName);
		Reporter.log("Company Name is " + cName, true);
	}

	public void enterJobTitle(String jTitle) {
		jobTitle.sendKeys(jTitle);
		Reporter.log("Job Title is " + jTitle, true);
	}

	public void selectFromDate(String fDate) {
		fromDate.sendKeys(fDate);
		Reporter.log("From date selected is " + fDate, true);
	}

	public void selectToDate(String tDate) {
		toDate.sendKeys(tDate);
		Reporter.log("To date selected is " + tDate, true);
	}

	public void enterComment(String commentMsg) {
		comment.sendKeys(commentMsg);
		Reporter.log("Comment Entered is " + commentMsg, true);
	}

	public void clickWorkExSaveBtn() {
		workExpSaveBtn.click();
		Reporter.log("Work Experience Save Button is Clicked",true);
	}

	public void clickAddEducationButton() {
		addEducationButton.click();
		Reporter.log("Add Education Button is Clicked",true);
	}

	public void clickEducationLevelDrop() {
		educationLevelDrop.click();
		Reporter.log("Education level Dropdown is Clicked",true);
	}

//	public void selectMasterDegree() {
//		masterDegree.click();
//		Reporter.log("Master Degree is Selected",true);
//	}

	public void selectMasterDegree(String MasterDegreeInput) {
		String MasterDegreeInitial = MasterDegreeInput.substring(0, 1);
		Actions act=new Actions(driver);
		act.sendKeys(MasterDegreeInitial).perform();
		act.sendKeys(Keys.ENTER).build().perform();
		Reporter.log("Qualification Selected is " + MasterDegreeInput ,true);
	}

	public void enterInstituteName(String instituteName) {
		institute.sendKeys(instituteName);
		Reporter.log("Institute Name is " + instituteName, true);
	}

	public void enterSpecalzation(String specializationName) {
		specialization.sendKeys(specializationName);
		Reporter.log("Specialization is " + specializationName, true);
	}

	public void enterYear(String yearInput) {
		year.sendKeys(yearInput);
		Reporter.log("Year Entered is " + yearInput, true);
	}

	public void enterCGPA(String cgpaInput) {
		cgpa.sendKeys(cgpaInput);
		Reporter.log("CGPA Entered is " + cgpaInput, true);
	}

	public void selectStartDate(String startdate) {
		startDate.sendKeys(startdate);
		Reporter.log("Start Date is selected " + startdate,true);
	}
	public void selectEndDate(String enddate) {
		endDate.sendKeys(enddate);
		Reporter.log("End Date is selected " + enddate,true);
	}

	public void clickCancelButton() {
		cancelButton.click();
		Reporter.log("Cancel Button is Clicked",true);
	}

}
