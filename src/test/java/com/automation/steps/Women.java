package com.automation.steps;

import com.automation.pages.HomePage;
import com.automation.pages.ProductPage;
import com.automation.pages.WomenCategoryPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Women {
    @When("^I click on women tab$")
    public void iClickOnWomenTab() {
        new HomePage().clickOnWomen();
    }

    @Then("^I should navigate to women page successfully$")
    public void iShouldNavigateToWomenPageSuccessfully() {
    }

    @And("^I should see the women text$")
    public void iShouldSeeTheWomenText() {
        new WomenCategoryPage().verifyWomenText();
    }

    @And("^I click on product\"([^\"]*)\"$")
    public void iClickOnProduct(String product) throws InterruptedException {
        new ProductPage().verifyProducts(product);
    }

    @And("^I change quantity\"([^\"]*)\"$")
    public void iChangeQuantity(String qty) {
        new ProductPage().SelectQuantity(qty);

    }

    @And("^I select size\"([^\"]*)\"$")
    public void iSelectSize(String size) {
        new ProductPage().selectSize(size);

    }

    @And("^I select color\"([^\"]*)\"$")
    public void iSelectColor(String colour) {
new ProductPage().selectColour(colour);
    }

    @And("^I click on add to cart button$")
    public void iClickOnAddToCartButton() {
        new ProductPage().clickOnAddToCart();
    }

    @Then("^pop up display \"([^\"]*)\"$")
    public void popUpDisplay(String mess) {
        new ProductPage().verifyProductAddedSuccessfullyMessage(mess);

    }

    @And("^verify message product successfully added to cart$")
    public void verifyMessageProductSuccessfullyAddedToCart() {
    }

    @And("^click on close button$")
    public void clickOnCloseButton() {
        new ProductPage().closePopUpMessage();
    }


}
