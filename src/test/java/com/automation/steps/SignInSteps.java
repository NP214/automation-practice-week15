package com.automation.steps;

import com.automation.pages.SignInPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class SignInSteps {
    @Then("^I should see Authentication message$")
    public void iShouldSeeAuthenticationMessage() {
        new SignInPage().verifyAuthenticationText();
    }

    @And("^I enter email address\"([^\"]*)\"$")
    public void iEnterEmailAddress(String emailadd) {
        new SignInPage().enterUserName(emailadd);
    }

    @And("^I enter password \"([^\"]*)\"$")
    public void iEnterPassword(String password) {
        new SignInPage().enterPassword(password);
    }

    @And("^I click on signin button$")
    public void iClickOnSigninButton() {
        new SignInPage().clickOnSignInofSignInPage();
    }

    @Then("^I should see the erroe message\"([^\"]*)\"$")
    public void iShouldSeeTheErroeMessage(String errorMessage) {
        new SignInPage().verifyErrorText(errorMessage);
    }

    @Then("^I should see sign out link is displayed$")
    public void iShouldSeeSignOutLinkIsDisplayed() {
        new SignInPage().verifySignOuttext();
    }

    @And("^I click on log out button$")
    public void iClickOnLogOutButton() {
        new SignInPage().clickOnSignOut();
    }

    @Then("^I should see the log in link$")
    public void iShouldSeeTheLogInLink() {
        new SignInPage().verifySignIntext();
    }
}
