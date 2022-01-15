//package stepDefinitions;
//
//import org.testng.Assert;
//
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import testJava.Product;
//import testJava.Search;
//
//public class SearchImplementation {
//
//	Product product;
//	Search search;
//	
//	@Given("the product search feature is available")
//	public void the_product_search_feature_is_available() throws Throwable {
//		System.out.println("Search Feature is available");
//	}
//
//	String a = "Pramoth\"s\"";
//		
//	@When("^the user search for the product with name \"([^\"]+)\" and price (\\d+)$")
//	public void the_user_search_for_the_product_with_name_and_price(String pName, int pPrice) throws Throwable {
//	
//		System.out.println("User enetered "+pName +"for which the price is "+pPrice);
//			product = new Product("Macbook Pro", 100);
//	}
//
//	@Then("product with name {string} should be displayed")
//	public void product_with_name_should_be_displayed(String pName) throws Throwable {
//		search = new Search();
//		String actualSearchResult=search.searchProduct(product);
//		Assert.assertEquals(pName, actualSearchResult);
//	
//	}
//
//
//	
//}
