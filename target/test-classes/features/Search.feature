Feature: Amazon search
Scenario: Search for a product
Given the product search feature is available
When the user search for the product with name "Macbook Pro" and price 100
Then product with name "Macbook Pro" should be displayed