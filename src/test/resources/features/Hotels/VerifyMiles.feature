@miles
Feature: Verify Miles

  Scenario: List of all of hotels within 10 miles of airport or downtown
    Given I am on default locations search result screen
    When I select LGA airport
    And I click on pool
    Then I verify system displays all hotels within 20 miles radius of airport

    And I verify 'Hilton' Hotel is within radius