Feature: Recommendation List

  Scenario: Verify user can successfully add items to My Recommended list

    Given I am on the Homepage
    When I Login
    And I search 'Harry' using search box
    And I click on star icon
    Then I verify item is added to recommended list