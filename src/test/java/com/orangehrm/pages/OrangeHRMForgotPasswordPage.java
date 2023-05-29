package com.orangehrm.pages;

import com.orangehrmw.objectrepository.ObjectRepository;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Reporter;

public class OrangeHRMForgotPasswordPage {

    public WebDriver driver;

    public OrangeHRMForgotPasswordPage(WebDriver driver)
    {
        this.driver = driver ;
    }
    @FindBy( how = How.XPATH, using = ObjectRepository.forgotPasswordLinkXpath)
    WebElement forgotPasswordLink;

    @FindBy( how = How.XPATH, using = ObjectRepository.resetPasswordTitleXpath)
    WebElement resetPasswordTitle;

    @FindBy( how = How.XPATH, using = ObjectRepository.usernameXpath)
    WebElement username;

    @FindBy( how = How.XPATH, using = ObjectRepository.resetPasswordButtonXpath)
    WebElement resetPasswordButton;

    @FindBy( how = How.XPATH, using =ObjectRepository.linkSendSuccessfulMsgXpath)
    WebElement linkSendSuccessfulMsg;

    //Action Methods
    public void clickOnForgotPasswordLink ()
    {
        forgotPasswordLink.click();
        Reporter.log("Successfully clicked on Forgot Password Link" , true);
        Reporter.log(" ",true);
    }

    public void enterUsername (String usernameInput)
    {
        username.sendKeys(usernameInput);
        Reporter.log("Username is: " + usernameInput, true);
        Reporter.log(" ",true);
    }

    public void clickOnresetPasswordButton ()
    {
        resetPasswordButton.click();
        Reporter.log("Reset Password Button Clicked successfully",true);
        Reporter.log(" ",true);
    }
    public String getResetPasswordTitle()
    {
        String resetPwdTitle = resetPasswordTitle.getText();
        return resetPwdTitle;
    }

    public String getlinkSendSuccessfulMsg()
    {
        String linkSendSuccessfulText = linkSendSuccessfulMsg.getText();
        return linkSendSuccessfulText;
    }


}
