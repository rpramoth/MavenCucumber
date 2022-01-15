Feature: Amazon Order Page
   In order to check my order details (Background keyword scenario)
   as registered user i want to view order details
   
Background:
Given the user is a registered Amazon user
Given the user is on the login page
When the user enters username
And the user enters password
And then clicks the login button
Then the user is navigates to the order page
   
Scenario: Check Previous order details
When user clicks the orders link
Then user checks on the previous order page

Scenario: Check Open order details
When user clicks the open orders link
Then user checks on the open order page

Scenario: Check Cancelled order details
When user clicks the Cancelled orders link
Then user checks on the Cancelled order page