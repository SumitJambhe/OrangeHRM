package com.orangehrm.pages;

import com.orangehrmw.objectrepository.ObjectRepository;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class OrangeHRMLogOutPage {

    WebDriver driver;

    public OrangeHRMLogOutPage(WebDriver driver) {
        this.driver = driver;
    }


    // Initilize the webelements locators values using FINDBY class
    @FindBy(xpath= ObjectRepository.userProfileXpath)
    WebElement userProfile;

    @FindBy(xpath= ObjectRepository.logoutXpath)
    WebElement logout;

    public void clickUserProfile() {
        userProfile.click();
        Reporter.log("User Profile is Clicked", true);
    }

    public void clickLogout() {
        logout.click();
        Reporter.log("Logout is Clicked",true);
    }

    public String getTitleOfPage()
    {
        String titleOfPage = driver.getTitle();
        return titleOfPage;
    }
}
