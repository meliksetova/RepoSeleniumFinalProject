Feature: Account Changes

  Scenario: Verify user is successfully able to add credit card in My Accounts
    Given I am on the Homepage
    When I Login
    And I go to My Accounts page
    And I add credit card 5405521871661075
   Then I verify credit card ending with 1075 is added successfully in My Accounts
   And I verify added card with 1075 is displayed when shopping using credit card


  Scenario: Verify user is successfully able to update name in My Accounts
    Given I am on the Homepage
    When I Login
    And I go to My Accounts page
   And I update the Name to Anna Happy
   Then I verify name is updated successfully in My Accounts
   And I verify name is updated successfully in Page Header