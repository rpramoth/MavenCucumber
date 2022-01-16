package stepDefinitions;

import java.util.List;
import java.util.Map;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UserRegistrationImpl { // for datalist

	@Given("the user is on the registration page")
	public void the_user_is_on_the_registration_page() {
	
	System.out.println("User goes to the registration page");
	}

	@When("the user enters the following details")
	public void the_user_enters_the_following_details(DataTable dataTable) {
	
		List<List<String>> userList = dataTable.asLists();
	
		for(List<String> e: userList) {
		//	System.out.println(e.get(0) + " "+e.get(1)+" "+e.get(2) +" " +e.get(3));
		System.out.println(e);
		
		}
	
	}
	
	@When("the user enters the following details with columns")
	public void the_user_enters_the_following_details_with_columns(DataTable dataTable) {
	
	List<Map<String,String>> listMaps=	dataTable.asMaps();
	System.out.println(listMaps);
//	System.out.println(listMaps.get(1).get("FirstName"));
	
	for(Map<String,String> e:listMaps) {
		
		System.out.println(e.get("FirstName"));
		
	}
	}


	@Then("user registration should be successful")
	public void user_registration_should_be_successful() {
	}

	
}
