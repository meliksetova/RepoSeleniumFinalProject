@timeline
Feature: Verify Darksky Timeline

  Scenario: Verify timeline is displayed in correct format
    Given I am on Darksky home page
    Then I verify timeline is displayed with '2' hours increment with '12' data points