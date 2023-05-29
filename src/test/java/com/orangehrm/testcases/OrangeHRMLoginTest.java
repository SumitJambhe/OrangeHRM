package com.orangehrm.testcases;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import com.orangehrm.utilities.ReadDataFromHRMTestDataProp;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.orangehrm.driverscript.TestBase;
import com.orangehrm.pages.OrangeHRMQualificationPage;
import com.orangehrm.pages.OrangeHRMLoginPage;

public class OrangeHRMLoginTest extends TestBase{
	
	public static FileInputStream fis;
	public static Properties config = new Properties();
	 OrangeHRMLoginPage loginPage;
	OrangeHRMQualificationPage qualificationPage;
	
	@BeforeClass
	public void readReadData() throws IOException {
		fis = new FileInputStream(System.getProperty("user.dir") + "\\src\\test\\java\\com\\orangehrm\\testdata\\HRMTestData.properties");
		config.load(fis);
		System.out.println("Test Data loaded successfully");
	}
		

	@Test(priority = 1)
	public void loginToApplication() {
		loginPage = PageFactory.initElements(driver, OrangeHRMLoginPage.class);
		loginPage.enterUserName(config.getProperty("username"));
		loginPage.enterPassword(config.getProperty("password"));
		loginPage.clickLoginBtn();
	}

	@Test (priority= 2)
	public void titleValidation() throws IOException {
		loginPage = PageFactory.initElements(driver, OrangeHRMLoginPage.class);
		String actualTitle = loginPage.getTitleOfPage();
		Assert.assertEquals(actualTitle, ReadDataFromHRMTestDataProp.getPropData("expectedTitle"), "The Actaual and Expected Title is NOT same");
		Reporter.log("Actual Title  is " + actualTitle, true);
		Reporter.log("Expected Title is " + ReadDataFromHRMTestDataProp.getPropData("expectedTitle"),true);
		Reporter.log("", true);
	}
}
