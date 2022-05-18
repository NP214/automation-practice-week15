package com.automation.pages;

import com.automation.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

//Email address, Password, Sign In Button, Create an account button and
//        "AUTHENTICATION" text, "CREATE AN ACCOUNT" text Locators
//        and create appropriate methods for it.
public class SignInPage extends Utility {
    private static final Logger log = LogManager.getLogger(SignInPage.class.getName());

    public SignInPage() {
        PageFactory.initElements(driver, this);
    }
    //==========Authentication text========
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Authentication')]")
    WebElement AuthenticationText;
    @CacheLookup
    @FindBy(xpath = "//input[@id='email']")
    WebElement userName;
    @CacheLookup
    @FindBy(xpath = "//input[@id='passwd']")
    WebElement password;

    @CacheLookup
    @FindBy(xpath = "//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/form[1]/div[1]/div[3]/button[1]/span[1]")
    WebElement createAnAccountLink;
    @CacheLookup
    @FindBy(xpath = "//h3[contains(text(),'Create an account')]")
    WebElement CreateAnAccountText;
    @CacheLookup
    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/ol[1]/li[1]")
    WebElement ErrorMsgText;
    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='Sign in']")
    WebElement signInButton;
    @CacheLookup
    @FindBy(xpath = "//a[@title='Log me out']")
    WebElement SignOut;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Sign in']")
    WebElement SignInLink;


    public void verifyAuthenticationText() {
        String actualText = getTextFromElement(AuthenticationText);
        String expectedText = "AUTHENTICATION";
        Assert.assertEquals(expectedText, actualText);
        log.info("verify authentcation text : " + AuthenticationText.toString());
    }

    public void enterUserName(String username) {
        log.info("enter username : " + userName.toString());
        sendTextToElement(userName, username);
    }

    public void enterPassword(String passw0rd) {
        log.info("enter password : " + password.toString());
        sendTextToElement(password, passw0rd);
    }

    public void clickOnSignInofSignInPage() {
        log.info("click on sign link : " + signInButton.toString());
        clickOnElement(signInButton);
    }

    public void clickOnCreateAnAccount() {
        log.info("click on create an account button : " + createAnAccountLink.toString());
        clickOnElement(createAnAccountLink);
    }

    public String verifyCreateAnAccountText() {
        log.info("verify create an account text : " + createAnAccountLink.toString());
        return getTextFromElement(createAnAccountLink);
    }

    public void verifyErrorText(String errorMessage) {
        String actualText =  getTextFromElement(ErrorMsgText);
        String expectedText = errorMessage;
        Assert.assertEquals(expectedText,actualText);
        log.info("verify error message : " + ErrorMsgText.toString());
    }

    public void verifySignOuttext() {
        String actualText = getTextFromElement(SignOut);
        String expectedText = "Sign out";
        Assert.assertEquals(expectedText, actualText);
        log.info("verify sign out text : " + SignOut.toString());
    }

    public void clickOnSignOut() {
        log.info("click on sign out : " + SignOut.toString());
        clickOnElement(SignOut);
    }

    public void verifySignIntext() {
        log.info("verify sign in text: " + SignInLink.toString());
        String actualText = getTextFromElement(SignInLink);
        String expectedText = "Sign in";
        Assert.assertEquals(actualText, expectedText);
    }

}



