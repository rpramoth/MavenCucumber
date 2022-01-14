Feature: Uber Booking

Scenario: Booking cab 
Given user wants to select the car "Sedan" for ride
When user selects "Sedan" and pickup point "Bangalore" and drop point "Chennai"
Then driver starts the journey
And driver ends the journey
Then the user pays 1000 rupees