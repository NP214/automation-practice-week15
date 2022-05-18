Feature: Register Test
  As user I want to register into automation practice
@sanity
  Scenario Outline: User should create account successfully
    Given I am on homepage
    When I click on signin link
    Then I should navigate to sign in page
    And I enter email Id
    And I click on register button on sign in page
    And I should navigate to register page
    And I enter first name"<firstname>"
    And I enter last name"<lastname>"
    And I enter password name"<password>"
    And I enter date"<date>"
    And I enter month"<month>"
    And I enter year"<year>"
    And I enter address"<address>"
    And I enter city"<city>"
    And I enter state from dropdown"<state>"
    And I enter zip"<zip>"
    And I enter mobile number"<mobilenumber>"
    And I click on register button on register page
    And I should see the My account text

    Examples:
      | firstname | lastname | password   | date | month | year | address             | city    | state | zip   | mobilenumber  |
      | yesica    | emily    | yesica@123 | 25   | 10    | 1991 | 7750, w alvarado rd | phoenix | 3     | 33567 | 5752345678906 |
