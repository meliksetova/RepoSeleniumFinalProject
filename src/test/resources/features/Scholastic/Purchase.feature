Feature: Purchase


  Scenario: User can make a purchase using credit card
Given I am on the Homepage
When I login
And I select 'Your Teacher Order' from Enter Orders
And I go to 'BY FlYER' category
And I add '10' item of '1N1'
And I click on 'REVIEW CART' button
And I proceed to checkout
Then I verify order has been placed successfully
