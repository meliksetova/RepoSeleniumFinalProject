@miles
Feature: Verify Miles

  Scenario: List of all of hotels within 20 miles of airport or downtown
    Given I am on default locations search result screen
    When I select LGA from distance
    And I click on pool from Popular filters
    And I click on free Breakfast from Popular filters
    Then I verify system displays all hotels within '20' miles radius of airport
    And I verify 'Hilton' Hotel is within radius