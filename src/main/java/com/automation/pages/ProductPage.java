package com.automation.pages;

import com.automation.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

//Quantity, Size drop down, colour Add To Cart button locatores and
//        create appropriate method for it
public class ProductPage extends Utility {
    private static final Logger log = LogManager.getLogger(ProductPage.class.getName());

    public ProductPage() {
        PageFactory.initElements(driver, this);
    }

    //@FindBy(xpath = "//form[@id='buy_block']/child::div/child::div[2]/p[1]/input")
    @CacheLookup
    @FindBy(id = "quantity_wanted")
    WebElement quantity;

    @CacheLookup
    @FindBy(xpath = "//select[@id='group_1']")
    WebElement Size;
    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Add to cart')]")
    WebElement AddtoCart;
    @FindBy(xpath = "//div[@class='clearfix']/div[1]/h2")
    WebElement popUpMessageTextLink;

    @FindBy(xpath = "//span[@title='Close window']")
    WebElement popUpCloseButtonLink;

    public void SelectQuantity(String qty) {
        clearTextFromField(By.id("quantity_wanted"));
        sendTextToElement(quantity, qty);
        log.info("Select quantity :" + qty);
    }

    public void selectSize(String size) {
        log.info("select size : " + Size.toString());
        selectByVisibleTextFromDropDown(Size, size);
    }

    public void selectColour(String col) {
        if (col == "White") {
            driver.findElement(By.id("color_8")).click();
            log.info("Select colour : " + col);
        } else if (col == "Orange") {
            driver.findElement(By.id("color_13")).click();
            log.info("Select colour : " + col);
        } else if (col == "Green") {
            driver.findElement(By.id("color_15")).click();
            log.info("Select colour : " + col);
        } else if (col == "Blue") {
            driver.findElement(By.id("color_14")).click();
            log.info("Select colour : " + col);
        } else {
            System.out.println("Please select a colour");
        }

    }

    public void clickOnAddToCart() {
        log.info("click opn add to cart button : " + AddtoCart.toString());
        clickOnElement(AddtoCart);
    }


    public void verifyProducts(String product) throws InterruptedException {
        List<WebElement> ProductLists = driver.findElements(By.xpath("//a[@class='product-name']"));
        for (WebElement item : ProductLists) {
            if (item.getText().equalsIgnoreCase(product)) {
                Thread.sleep(2000);
                item.click();
                log.info("selecting product : " + product);
                break;
            }
        }

    }

    public void verifyProductAddedSuccessfullyMessage(String mess) {
        verifyElements(popUpMessageTextLink, mess, "verify product added successfully");
        log.info("product added successfully message : " + popUpMessageTextLink.toString());
    }

    public void closePopUpMessage() {
        clickOnElement(popUpCloseButtonLink);
        log.info("Closing the popup message : " + popUpMessageTextLink.toString());
    }

}

