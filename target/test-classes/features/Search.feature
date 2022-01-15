Feature: Amazon search

@Smoke
Scenario: Search for a product Macbook
Given the product search feature is available
When the user search for the product with name "Macbook Pro" and price 100
Then product with name "Macbook Pro" should be displayed


@Regression
Scenario: Search for a product iPhone
Given the product search feature is available
When the user search for the product with name "iPhone" and price 80
Then product with name "iPhone" should be displayed

@Regression @Smoke
Scenario: Search for a product iPad
Given the product search feature is available
When the user search for the product with name "iPad" and price 60
Then product with name "iPad" should be displayed