@childrendropdown
Feature: Verify Children Dropdown


  Scenario Outline: Verify user get correct number of dropdown after selecting children
    Given I am on hotels landing page
    When I select '<childrenCount>' in children dropdown
    Then I see '<childrenCount>' child age dropdowns

    Examples:
      |childrenCount|
      |0            |
      |1            |
      |2            |
      |3            |
      |4            |
      |5            |
      |6            |