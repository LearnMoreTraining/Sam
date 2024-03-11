Feature: User verify the login functionality of Learn More Application

  #before
  @TS01  @Minions
  Scenario: User validates the error message in login page
   # Given User navigates to url
    When User Enters the username "aravinth" and password "xyz"
    And User clicks the login button
    Then User verify the error message "Invalid Credentials.Please Check Once"
  #after

  #before
  @TS02 @Minions
  Scenario: User validates the login functionality with valid credi
    Given User navigates to url
    When User Enters the username "LearnMore" and password "learnmore@123"
    And User clicks the login button
    Then User verfiy whether navigates to EventCalendar Page
#after

  @TS03 @Minions
  Scenario: new
    Given
    When

  @TS04
  Scenario Outline: User validates the login functionalitywith valid credi
    Given User navigates to url
    When User Enters the username "<Search>" and password "<Password>"
    And User clicks the login button
    Then User verfiy whether navigates to EventCalendar Page
    Examples:
      | SearchKeyword | Title |
      | iphone        | 123   |
      | Anussha       | abc   |
      | Sam           | xyz   |