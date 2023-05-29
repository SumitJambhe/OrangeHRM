package com.orangehrmw.objectrepository;

/*
 * All the locators values are mentioned here
 * 
 * Naming Rule:
 * For link and partial link text locator => add Link as suffix 
 * 
 * Rest of the locators use relative xpath tricks
 * 
 * 
 */

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ObjectRepository {

	// Object Repository of Orange HRM
	
	// Login Page 
	public static final String userNameXpath = "//*[@name='username']";
	public static final String passwordXpath = "//*[@name='password']";
	public static final String loginBtnXpath = "//*[@type='submit']";

	// Home Page
	public static final String myInfoXpath = "//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[6]/a";

	//PIM Application
	public static final String pimXpath = "//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[2]/a";

	public static final String addEmployeeXpath = "//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[3]/a";

	public static final String firstNameXpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[1]/div[1]/div/div/div[2]/div[1]/div[2]/input";

	public static final String middleNameXpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[1]/div[1]/div/div/div[2]/div[2]/div[2]/input";

	public static final String lastNameXpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[1]/div[1]/div/div/div[2]/div[3]/div[2]/input";

	public static final String employeeIdXpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[1]/div[2]/div/div/div[2]/input";

	public static final String svebtnXpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/button[2]";

	//Qualifivation Page
	public static final String qualificationXpath = "//*[text()='Qualifications']";


	//Add Work Experience
	public static final String addWorkExpBtnXpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[2]/div[1]/div/button";
	public static final String companyNameXpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[2]/div[1]/form/div[1]/div/div[1]/div/div[2]/input";
	public static final String jobTitleXpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[2]/div[1]/form/div[1]/div/div[2]/div/div[2]/input";
	public static final String fromDateXpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[2]/div[1]/form/div[2]/div/div[1]/div/div[2]/div/div/input";
	public static final String toDateXpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[2]/div[1]/form/div[2]/div/div[2]/div/div[2]/div/div/input";
	public static final String commentXpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[2]/div[1]/form/div[3]/div/div/div/div[2]/textarea";
	public static final String workExpSaveBtnXpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[2]/div[1]/form/div[4]/button[2]";

	//Add Educational Details
	public static final String addEducationButtonXpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[3]/div[1]/div/button";
	public static final String educationLevelDropXpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[3]/div[1]/form/div[1]/div/div[1]/div/div[2]/div/div";
	public static final String masterDegreeXpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[3]/div[1]/form/div[1]/div/div[1]/div/div[2]/div/div/div[1]";

	public static final String instituteXpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[3]/div[1]/form/div[1]/div/div[2]/div/div[2]/input";
	public static final String specializationXpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[3]/div[1]/form/div[1]/div/div[3]/div/div[2]/input";
	public static final String yearXpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[3]/div[1]/form/div[1]/div/div[4]/div/div[2]/input";
	public static final String cgpaXpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[3]/div[1]/form/div[1]/div/div[5]/div/div[2]/input";
	public static final String startDateXpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[3]/div[1]/form/div[2]/div/div[1]/div/div[2]/div/div/input";
	public static final String endDateXpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[3]/div[1]/form/div[2]/div/div[2]/div/div[2]/div/div/input";
	public static final String cancelButtonXpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[3]/div[1]/form/div[3]/button[1]";

    //Personal Details Page
	public static final String personalDetailsXpath = "(//a[normalize-space()='Personal Details'])[1]";
	public static final String nickNameXpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div[2]/div/div/div[2]/input";
	public static final String otherIDXpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[2]/div[1]/div[2]/div/div[2]/input";
	public static final String drivingLicenseNumXpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[2]/div[2]/div[1]/div/div[2]/input";
	public static final String drivingLicenseExDateXpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[2]/div[2]/div[2]/div/div[2]/div/div/input";
	public static final String ssnNumberXpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[2]/div[3]/div[1]/div/div[2]/input";

	public static final String sinNumberXpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[2]/div[3]/div[2]/div/div[2]/input";


	public static final String nationalityDropdownXpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/div[1]/div[1]/div/div[2]/div/div/div[1]";

	public static final String maritalStatusXpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/div[1]/div[2]/div/div[2]/div/div/div[1]";

	public static final String dobXpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/div[1]/div[2]/div/div[2]/div/div/div[1]";

	public static final String militaryServiceXpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[4]/div/div[1]/div/div[2]/input";
	public static final String genderMaleXpath = "//label[normalize-space()='Male']";


	public static final String genderFemaleXpath = "//label[normalize-space()='Female']";

	public static final String smokeStatusXpath = "//label[normalize-space()='Yes']";

	public static final String saveButtonXpath = "(//button[@type='submit'][normalize-space()='Save'])[1]";

	public static final String bloodGroupDropdownXpath = "(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[3]";
	//public static final String bloodGroupXpath = "//div[contains(text(),'O+')]";
	public static final String bloodGroupXpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[2]/div/form/div[1]/div/div/div/div[2]/div/div/div[1]";

	public static final String saveButtonTwoXpath = "(//button[@type='submit'][normalize-space()='Save'])[2]";

	//Logout Page

	public static final String userProfileXpath = "(//i[@class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon'])[1]";
	public static final String logoutXpath = "(//a[normalize-space()='Logout'])[1]";

	//Forgot Password Page
	public static final String forgotPasswordLinkXpath = "//*[@class='oxd-text oxd-text--p orangehrm-login-forgot-header']";

	public static final String resetPasswordTitleXpath = "//*[@class='oxd-text oxd-text--h6 orangehrm-forgot-password-title']";

	public static final String usernameXpath = "//*[@placeholder='Username']";
	public static final String resetPasswordButtonXpath = "//*[@type='submit']";

	public static final String linkSendSuccessfulMsgXpath = "(//*[@class='oxd-text oxd-text--p'])[1]";


}
