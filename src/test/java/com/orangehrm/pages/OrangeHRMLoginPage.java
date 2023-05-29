package com.orangehrm.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

import com.orangehrmw.objectrepository.ObjectRepository;

public class OrangeHRMLoginPage {

	WebDriver driver;	
	
	public OrangeHRMLoginPage(WebDriver driver) {
		this.driver = driver;
	}	
		
	// Initilize the webelements locators values using FINDBY class	
	@FindBy(xpath= ObjectRepository.userNameXpath) 
	@CacheLookup
	WebElement userName;		
	
	@FindBy(xpath= ObjectRepository.passwordXpath) 
	@CacheLookup
	WebElement password;	
	
	@FindBy(xpath= ObjectRepository.loginBtnXpath) 
	@CacheLookup
	WebElement loginBtn;	
	

	public void enterUserName(String uname) {
		userName.sendKeys(uname);
		Reporter.log("User Name is " + uname, true);
	}
	
	public void enterPassword(String pwd) {
		password.sendKeys(pwd);
		Reporter.log("Password is entered",true);
	}

	public void clickLoginBtn() {
		loginBtn.click();
		Reporter.log("Login Button is Clicked",true);
	}

	public String getTitleOfPage()
	{
		String titleOfPage = driver.getTitle();
		return titleOfPage;
	}
	
}
