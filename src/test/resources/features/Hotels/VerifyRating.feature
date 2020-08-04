@ratings
Feature: Verify rating filter on hotels search page

    Scenario Outline: Verify hotel shows up as star rating selected by user
Given I am on default locations search result screen
When I click on '<star>' star
And I verify hotels are '<star>' star rating
Examples:
| star |
| 5    |
| 4    |
| 3    |
| 2    |
| 1    |