$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("register.feature");
formatter.feature({
  "line": 1,
  "name": "Register Test",
  "description": "As user I want to register into automation practice",
  "id": "register-test",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 4,
  "name": "User should create account successfully",
  "description": "",
  "id": "register-test;user-should-create-account-successfully",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@sanity"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "I am on homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I click on signin link",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I should navigate to sign in page",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "I enter email Id",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I click on register button on sign in page",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I should navigate to register page",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I enter first name\"\u003cfirstname\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I enter last name\"\u003clastname\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I enter password name\"\u003cpassword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I enter date\"\u003cdate\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "I enter month\"\u003cmonth\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "I enter year\"\u003cyear\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "I enter address\"\u003caddress\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "I enter city\"\u003ccity\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "I enter state from dropdown\"\u003cstate\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "I enter zip\"\u003czip\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "I enter mobile number\"\u003cmobilenumber\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "I click on register button on register page",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "I should see the My account text",
  "keyword": "And "
});
formatter.examples({
  "line": 25,
  "name": "",
  "description": "",
  "id": "register-test;user-should-create-account-successfully;",
  "rows": [
    {
      "cells": [
        "firstname",
        "lastname",
        "password",
        "date",
        "month",
        "year",
        "address",
        "city",
        "state",
        "zip",
        "mobilenumber"
      ],
      "line": 26,
      "id": "register-test;user-should-create-account-successfully;;1"
    },
    {
      "cells": [
        "yesica",
        "emily",
        "yesica@123",
        "25",
        "10",
        "1991",
        "7750, w alvarado rd",
        "phoenix",
        "3",
        "33567",
        "5752345678906"
      ],
      "line": 27,
      "id": "register-test;user-should-create-account-successfully;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 8249400900,
  "status": "passed"
});
formatter.scenario({
  "line": 27,
  "name": "User should create account successfully",
  "description": "",
  "id": "register-test;user-should-create-account-successfully;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@sanity"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "I am on homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I click on signin link",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I should navigate to sign in page",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "I enter email Id",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I click on register button on sign in page",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I should navigate to register page",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I enter first name\"yesica\"",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I enter last name\"emily\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I enter password name\"yesica@123\"",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I enter date\"25\"",
  "matchedColumns": [
    3
  ],
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "I enter month\"10\"",
  "matchedColumns": [
    4
  ],
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "I enter year\"1991\"",
  "matchedColumns": [
    5
  ],
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "I enter address\"7750, w alvarado rd\"",
  "matchedColumns": [
    6
  ],
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "I enter city\"phoenix\"",
  "matchedColumns": [
    7
  ],
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "I enter state from dropdown\"3\"",
  "matchedColumns": [
    8
  ],
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "I enter zip\"33567\"",
  "matchedColumns": [
    9
  ],
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "I enter mobile number\"5752345678906\"",
  "matchedColumns": [
    10
  ],
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "I click on register button on register page",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "I should see the My account text",
  "keyword": "And "
});
formatter.match({
  "location": "MyStepdefs.iAmOnHomepage()"
});
formatter.result({
  "duration": 124147900,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iClickOnSigninLink()"
});
formatter.result({
  "duration": 2180623200,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iShouldNavigateToSignInPage()"
});
formatter.result({
  "duration": 27000,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iEnterEmailId()"
});
formatter.result({
  "duration": 160063900,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iClickOnRegisterButtonOnSignInPage()"
});
formatter.result({
  "duration": 108256200,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iShouldNavigateToRegisterPage()"
});
formatter.result({
  "duration": 21600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "yesica",
      "offset": 19
    }
  ],
  "location": "MyStepdefs.iEnterFirstName(String)"
});
formatter.result({
  "duration": 1339072500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "emily",
      "offset": 18
    }
  ],
  "location": "MyStepdefs.iEnterLastName(String)"
});
formatter.result({
  "duration": 93860400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "yesica@123",
      "offset": 22
    }
  ],
  "location": "MyStepdefs.iEnterPasswordName(String)"
});
formatter.result({
  "duration": 113165000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "25",
      "offset": 13
    }
  ],
  "location": "MyStepdefs.iEnterDate(String)"
});
formatter.result({
  "duration": 210758600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "10",
      "offset": 14
    }
  ],
  "location": "MyStepdefs.iEnterMonth(String)"
});
formatter.result({
  "duration": 177457600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1991",
      "offset": 13
    }
  ],
  "location": "MyStepdefs.iEnterYear(String)"
});
formatter.result({
  "duration": 89477200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "7750, w alvarado rd",
      "offset": 16
    }
  ],
  "location": "MyStepdefs.iEnterAddress(String)"
});
formatter.result({
  "duration": 127425100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "phoenix",
      "offset": 13
    }
  ],
  "location": "MyStepdefs.iEnterCity(String)"
});
formatter.result({
  "duration": 107900800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "3",
      "offset": 28
    }
  ],
  "location": "MyStepdefs.iEnterStateFromDropdown(String)"
});
formatter.result({
  "duration": 120931200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "33567",
      "offset": 12
    }
  ],
  "location": "MyStepdefs.iEnterZip(String)"
});
formatter.result({
  "duration": 93109700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "5752345678906",
      "offset": 22
    }
  ],
  "location": "MyStepdefs.iEnterMobileNumber(String)"
});
formatter.result({
  "duration": 122892200,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iClickOnRegisterButtonOnRegisterPage()"
});
formatter.result({
  "duration": 1326400300,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iShouldSeeTheMyAccountText()"
});
formatter.result({
  "duration": 46149100,
  "status": "passed"
});
formatter.after({
  "duration": 832030700,
  "status": "passed"
});
formatter.uri("signin.feature");
formatter.feature({
  "line": 1,
  "name": "Signin Test",
  "description": "As user I want to sign into automation practice",
  "id": "signin-test",
  "keyword": "Feature"
});
formatter.before({
  "duration": 4876871900,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "User should navigate to signIn page successFully.",
  "description": "",
  "id": "signin-test;user-should-navigate-to-signin-page-successfully.",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@sanity"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "I am on homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I click on signin link",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I should see Authentication message",
  "keyword": "Then "
});
formatter.match({
  "location": "MyStepdefs.iAmOnHomepage()"
});
formatter.result({
  "duration": 54300,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iClickOnSigninLink()"
});
formatter.result({
  "duration": 1446700900,
  "status": "passed"
});
formatter.match({
  "location": "SignInSteps.iShouldSeeAuthenticationMessage()"
});
formatter.result({
  "duration": 50670500,
  "status": "passed"
});
formatter.after({
  "duration": 996837600,
  "status": "passed"
});
formatter.uri("womencategory.feature");
formatter.feature({
  "line": 1,
  "name": "Women Category Test",
  "description": "As a user I want to product add to cart",
  "id": "women-category-test",
  "keyword": "Feature"
});
formatter.before({
  "duration": 4952865000,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Verify user should navigate to women category page successfully",
  "description": "",
  "id": "women-category-test;verify-user-should-navigate-to-women-category-page-successfully",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@sanity"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "I am on homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I click on women tab",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I should navigate to women page successfully",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "I should see the women text",
  "keyword": "And "
});
formatter.match({
  "location": "MyStepdefs.iAmOnHomepage()"
});
formatter.result({
  "duration": 24400,
  "status": "passed"
});
formatter.match({
  "location": "Women.iClickOnWomenTab()"
});
formatter.result({
  "duration": 1799745800,
  "status": "passed"
});
formatter.match({
  "location": "Women.iShouldNavigateToWomenPageSuccessfully()"
});
formatter.result({
  "duration": 32000,
  "status": "passed"
});
formatter.match({
  "location": "Women.iShouldSeeTheWomenText()"
});
formatter.result({
  "duration": 47993200,
  "status": "passed"
});
formatter.after({
  "duration": 946723600,
  "status": "passed"
});
});