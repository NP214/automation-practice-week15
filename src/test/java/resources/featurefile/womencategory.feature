Feature: Women Category Test
  As a user I want to product add to cart
@sanity
  Scenario: Verify user should navigate to women category page successfully
    Given I am on homepage
    When I click on women tab
    Then I should navigate to women page successfully
    And  I should see the women text
@smoke
  Scenario Outline: verify user should add product in to cart successfully
    Given I am on homepage
    When I click on women tab
    And I click on product"<product>"
    And I change quantity"<qty>"
    And I select size"<size>"
    And I select color"<colour>"
    And I click on add to cart button
    Then pop up display ""
    And verify message product successfully added to cart
    And click on close button
    Examples:
      | product               | qty | size | colour |
      | Blouse                | 2   | M    | White  |
      | Printed Dress         | 3   | L    | Orange |
      | Printed Chiffon Dress | 4   | S    | Green  |
      | Printed Summer Dress  | 2   | M    | Blue   |




