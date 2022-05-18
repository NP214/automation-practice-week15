package com.automation.pages;

import com.automation.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.Random;

//All the fields locators and create appropriate method for it.

public class CreateAccountPage extends Utility {
    private static final Logger log = LogManager.getLogger(CreateAccountPage.class.getName());


    public CreateAccountPage() {
        PageFactory.initElements(driver, this);
    }

    // ===========================enter emailid and click on create an account =====================
    @CacheLookup
    @FindBy(xpath = "//input[@id='email_create']")
    WebElement Emailadd;
    @CacheLookup
    @FindBy (xpath = "//span[normalize-space()='Create an account']")
    WebElement CreateAnAccountButton;

    //========Your Personal Information data=============================
    @CacheLookup
    @FindBy(xpath = "//input[@id='customer_firstname']")
    WebElement FirstName;
    @CacheLookup
    @FindBy(xpath = "//input[@id='customer_lastname']")
    WebElement LastName;
    @CacheLookup
    @FindBy(xpath = "//input[@id='passwd']")
    WebElement Password;
    @CacheLookup
    @FindBy(xpath = "//select[@id='days']")
    WebElement Days;
    @CacheLookup
    @FindBy(xpath = "//select[@id='months']")
    WebElement Months;
    @CacheLookup
    @FindBy(xpath = "//select[@id='years']")
    WebElement Year;

    public void enterEmailId(){
        log.info("enter email ID : " + Emailadd.toString());
        Random randomGenerator = new Random();
        int randomInt = randomGenerator.nextInt(1000);
        sendTextToElement(Emailadd,"usernid" + randomInt + "@gmail.com");
        System.out.println("usernid" + randomInt + "@gmail.com" );
    }
    public void clickOnCreateAnAccount(){
        log.info("click on create account: " + CreateAnAccountButton.toString());;
        clickOnElement(CreateAnAccountButton);
    }

    public void enterFirstName(String firstname) {
        log.info("enter fiest name : " + FirstName.toString());
        sendTextToElement(FirstName, firstname);
    }

    public void enterLName(String lastname) {
        log.info("enter last name: " + LastName.toString());
        sendTextToElement(LastName, lastname);
    }

    public void enterPassword(String password) {

        log.info("enter password : " + Password.toString());
        sendTextToElement(Password, password);
    }

    public void selectdDayByValue(String date) {

        log.info("select date : " + Days.toString());
        selectByValueFromDropDown(Days, date);
    }

    public void selectdMonthByValue(String month) {
        log.info("select month " + Months.toString());
        selectByValueFromDropDown(Months, month);
    }

    public void selectdYearByValue(String year) {
        log.info("select year " + Year.toString());
        selectByValueFromDropDown(Year, year);
    }

    //=========Your Address Field data==================================
    @FindBy(xpath = "//div[@class='account_creation']/p[4]/input")
    WebElement Address1;


    @FindBy(xpath = "//div[@class='account_creation']/p[6]/input")
    WebElement City;


    @FindBy(xpath = "//select[@id='id_state']")
    WebElement State;


    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/form[1]/div[2]/p[8]/input[1]")
    WebElement Zip;


    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/form[1]/div[2]/p[13]/input[1]")
    WebElement MobileNumber;


    @FindBy(xpath = "//p[@class='pull-right required']/preceding-sibling::button")
    WebElement register;


    @FindBy(xpath = "//ul[@class='footer_links clearfix']/parent::div/child::h1")
    WebElement MyAccountText;



    public void enterAddress1(String address) {
        log.info("enter address : " + Address1.toString());
        sendTextToElement(Address1, address);
    }

    public void enterCity(String city) {
        log.info("enter city: " + City.toString());
        sendTextToElement(City, city);
    }

    public void selectStateByvalue(String state) {

        log.info("select state : " + State.toString());
        selectByValueFromDropDown(State, state);
    }

    public void enterZip(String zip) {
        log.info("enter zip : " + Zip.toString());
        sendTextToElement(Zip, zip);
    }

    public void enterMobileNumber(String mobilenumber) {
        log.info("enter mobile number : " + MobileNumber.toString());
        sendTextToElement(MobileNumber, mobilenumber);
    }

    public void clickOnRegisterButton() {
        log.info("click opn register button : " + register.toString());
        clickOnElement(register);
    }

    public void verifyMyAccountText() {
        log.info("verify My Account text : " + MyAccountText.toString());
        String actualText =  getTextFromElement(MyAccountText);
        String expectedText = "MY ACCOUNT";
        Assert.assertEquals(expectedText,actualText);
    }


}

