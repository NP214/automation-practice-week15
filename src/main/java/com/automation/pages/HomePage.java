package com.automation.pages;

import com.automation.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Sign in']")
    WebElement signinLink;
    @CacheLookup
    @FindBy(xpath = "//header/div[3]/div[1]/div[1]/div[6]/ul[1]/li[1]/a[1]")
    WebElement Womenlink;
    @CacheLookup
    @FindBy(xpath = "//header/div[3]/div[1]/div[1]/div[6]/ul[1]/li[2]/a[1]")
    WebElement Dresseslink;
    @CacheLookup
    @FindBy(xpath = "//header/div[3]/div[1]/div[1]/div[6]/ul[1]/li[3]/a[1]")
    WebElement Tshirtlink;
    @CacheLookup
    @FindBy(xpath = "//header/div[3]/div[1]/div[1]/div[1]/a[1]/img[1]")
    WebElement logolink;

    public void clickOnWomen() {
        log.info("click on women tab: " + Womenlink.toString());
        clickOnElement(Womenlink);
    }

    public void clickOnDresses() {
        clickOnElement(Dresseslink);
    }

    public void clickOnTshirt() {
        clickOnElement(Tshirtlink);
    }
    public String verifyLogo() {
        return getTextFromElement(logolink);
    }
    public void clickOnSignInLink() {
        log.info("click on sign in link on home page: " + signinLink.toString());
        clickOnElement(signinLink);
    }
}
