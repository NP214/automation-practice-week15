package com.automation.pages;

import com.automation.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//    WOMEN text, TOPS and DRESSES links, SortBy drop down, ProductsList Locators
//    and create appropriate methods for it.
public class WomenCategoryPage extends Utility {
    private static final Logger log = LogManager.getLogger(WomenCategoryPage.class.getName());

    public WomenCategoryPage() {
        PageFactory.initElements(driver, this);
    }

   @CacheLookup
    @FindBy(xpath = "//span[@class='cat-name']")
    WebElement WomenText;
    @CacheLookup
    @FindBy(xpath = "//body/div[@id='page']/div[2]/div[1]/div[3]/div[2]/div[2]/ul[1]/li[1]/h5[1]/a[1]")
    WebElement Tops;
    @CacheLookup
    @FindBy(xpath = "//body/div[@id='page']/div[2]/div[1]/div[3]/div[2]/div[2]/ul[1]/li[2]/h5[1]/a[1]")
    WebElement Dresses;
    @CacheLookup
    @FindBy(xpath = "//select[@id='selectProductSort']")
    WebElement SortBy;




    public void verifyWomenText() {
        String expectedText = "WOMEN ";
        String actualText = getTextFromElement(WomenText);
        Assert.assertEquals("text is not displayed",actualText,expectedText);
        log.info("verify women text: " + WomenText.toString());
    }

    public void clickOnDresses() {
        clickOnElement(Dresses);
    }

    public void clickOnTops() {
        clickOnElement(Tops);
    }

    public void clickOnSortBy() {
        clickOnElement(SortBy);
    }



}
