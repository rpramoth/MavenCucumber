package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UberBookImpl {

	@Given("user wants to select the car {string} for ride")
	public void user_wants_to_select_the_car_for_ride(String carType) {
	
		System.out.println("Step 1");
	
	}

	@When("user selects {string} and pickup point {string} and drop point {string}")
	public void user_selects_and_pickup_point_and_drop_point(String carType, String pickupLocation, String dropLocation) {
	
		System.out.println("Step 2");

	}

	@Then("driver starts the journey")
	public void driver_starts_the_journey() {
	
		System.out.println("Step 3");

	}

	@Then("driver ends the journey")
	public void driver_ends_the_journey() {
		
		System.out.println("Step 4");

	}

	@Then("the user pays {int} rupees")
	public void the_user_pays_rupees(Integer int1) {
	
		System.out.println("Step 5");

	}
	
}
