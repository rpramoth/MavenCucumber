Feature: User Registration

Scenario: User registration with different data
Given the user is on the registration page
When the user enters the following details
	| Pramoth | R | pra@gmail.com | 7894 | Chennai |
	| Pradeep | R | pradd@gmail.com | 8932 | Chennai |
Then user registration should be successful

Scenario: User registration with different data with columns
Given the user is on the registration page
When the user enters the following details with columns
	| FirstName | LastName | Email | Phone | Place |
	| Pramoth | R | pra@gmail.com | 7894 | Chennai |
	| Pradeep | R | pradd@gmail.com | 8932 | Chennai |
Then user registration should be successful