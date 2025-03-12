@Login
Feature: Login function

  Scenario Outline: User updates personal details
    Given User is on the homepage
    When User clicks on the city
    And User clicks on the cabinet button
    And User enters "<number>" and SMS code
    Then Clicks on the Daxil ol button and proceeds to the homepage

    Examples:
      | number    |
      | 556423557 |
