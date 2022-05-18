package com.automation.steps;

import com.automation.pages.CreateAccountPage;
import com.automation.pages.HomePage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MyStepdefs {
    @Given("^I am on homepage$")
    public void iAmOnHomepage() {
    }

    @When("^I click on signin link$")
    public void iClickOnSigninLink() {
        new HomePage().clickOnSignInLink();

    }


    @Then("^I should navigate to sign in page$")
    public void iShouldNavigateToSignInPage() {
    }

    @And("^I enter email Id$")
    public void iEnterEmailId() {
        new CreateAccountPage().enterEmailId();
    }

    @And("^I click on register button on sign in page$")
    public void iClickOnRegisterButtonOnSignInPage() {
new CreateAccountPage().clickOnCreateAnAccount();
    }


    @And("^I should navigate to register page$")
    public void iShouldNavigateToRegisterPage() {
    }

    @And("^I enter first name\"([^\"]*)\"$")
    public void iEnterFirstName(String firstname )  {
      new CreateAccountPage().enterFirstName(firstname);
    }

    @And("^I enter last name\"([^\"]*)\"$")
    public void iEnterLastName(String lastname)  {
        new CreateAccountPage().enterLName(lastname);
    }

    @And("^I enter password name\"([^\"]*)\"$")
    public void iEnterPasswordName(String password)  {
        new CreateAccountPage().enterPassword(password);
    }

    @And("^I enter date\"([^\"]*)\"$")
    public void iEnterDate(String date)  {
        new CreateAccountPage().selectdDayByValue(date);
    }

    @And("^I enter month\"([^\"]*)\"$")
    public void iEnterMonth(String month)  {
        new CreateAccountPage().selectdMonthByValue(month);
    }

    @And("^I enter year\"([^\"]*)\"$")
    public void iEnterYear(String year)  {
        new CreateAccountPage().selectdYearByValue(year);
    }

    @And("^I enter address\"([^\"]*)\"$")
    public void iEnterAddress(String address)  {
        new CreateAccountPage().enterAddress1(address);
    }

    @And("^I enter city\"([^\"]*)\"$")
    public void iEnterCity(String city)  {
        new CreateAccountPage().enterCity(city);
    }

    @And("^I enter state from dropdown\"([^\"]*)\"$")
    public void iEnterStateFromDropdown(String state)  {
        new CreateAccountPage().selectStateByvalue(state);
    }
    @And("^I enter zip\"([^\"]*)\"$")
    public void iEnterZip(String zip) {
        new CreateAccountPage().enterZip(zip);

    }
    @And("^I enter mobile number\"([^\"]*)\"$")
    public void iEnterMobileNumber(String mobilenumber)  {
        new CreateAccountPage().enterMobileNumber(mobilenumber);
    }

    @And("^I click on register button on register page$")
    public void iClickOnRegisterButtonOnRegisterPage() {
        new CreateAccountPage().clickOnRegisterButton();
    }

    @And("^I should see the My account text$")
    public void iShouldSeeTheMyAccountText() {
        new CreateAccountPage().verifyMyAccountText();
    }


}
