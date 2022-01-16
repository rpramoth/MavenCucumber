@All
Feature: Uber Booking

@Smoke
Scenario: Booking cab Sedan 
Given user wants to select the car "Sedan" for ride
When user selects "Sedan" and pickup point "Bangalore" and drop point "Chennai"
Then driver starts the journey
And driver ends the journey
Then the user pays 1000 rupees
Then the ride is considered as completed

@Regression @Smoke
Scenario: Booking cab SUV car
Given user wants to select the car "SUV" for ride
When user selects "Sedan" and pickup point "Chennai" and drop point "Trichy"
Then driver starts the journey
And driver ends the journey
Then the user pays 500 rupees

@Prod
Scenario: Booking cab mini car
Given user wants to select the car "Mini" for ride
When user selects "Sedan" and pickup point "Madurai" and drop point "Bangalore"
Then driver starts the journey
And driver ends the journey
Then the user pays 800 rupees