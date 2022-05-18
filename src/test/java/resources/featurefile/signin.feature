Feature: Signin Test
  As user I want to sign into automation practice
@sanity
  Scenario: User should navigate to signIn page successFully.
    Given I am on homepage
    When I click on signin link
    Then I should see Authentication message
@smoke
  Scenario Outline: User should verify error message with invalid credentials
    Given I am on homepage
    When I click on signin link
    Then I should navigate to sign in page
    And I enter email address"<emailadd>"
    And I enter password "<password>"
    And I click on signin button
    Then I should see the erroe message"<errorMessage>"

    Examples:
      | emailadd       | password | errorMessage               |
      |                | 123456   | An email address required. |
      | abcd@gmail.com |          | Password is required.      |
      | adfdfgfg       | 123456   | Invalid email address.     |
      | abcd@gmail.com | 123456   | Authentication failed.     |
@regression
    Scenario: User should log in successfully with valid credentials
      Given I am on homepage
      When I click on signin link
      Then I should navigate to sign in page
      And I enter email address"usernid105@gmail.com"
      And I enter password "yesica@123"
      And I click on signin button
      Then I should see sign out link is displayed
@regression
Scenario: User should logout successfully
  Given I am on homepage
  When I click on signin link
  Then I should navigate to sign in page
  And I enter email address"usernid105@gmail.com"
  And I enter password "yesica@123"
  And I click on signin button
  And I click on log out button
  Then I should see the log in link
