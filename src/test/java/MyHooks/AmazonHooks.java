package MyHooks;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;

public class AmazonHooks {

	@Before("@Smoke")
	public void setup_browser(Scenario sc) {
		System.out.println("Before method for Launch Browser for Smoke");
		System.out.println(sc.getName());
	}
	
//	@Before(order = 1)
//	public void setup_browser(Scenario sc) {
//		System.out.println("Launch Browser");
//		System.out.println(sc.getName());
//	}
//	
//	@Before(order = 2)
//	public void setup_url() {
//		System.out.println("Launch the url");
//	}
	
//	@After(order = 1)
//	public void tearDown_close() {
//		System.out.println("Close Browser");
//	}	
//	
//	@After(order = 2)
//	public void tearDown_logout() {
//		System.out.println("Logout from the application");
//	}
	
//	@After(order = 1)
//	public void tearDown_close() {
//		System.out.println("Close Browser");
//	}
//	
//	@After("@Smoke")
//	public void tearDown_close() {
//		System.out.println("After method for smoke Close Browser");
//	}
//	
//	@BeforeStep
//	public void takeScreenshot() {
//		System.out.println("Take Screenshot");
//	}
//	
//	
//	@AfterStep
//	public void getScreenshot() {
//		System.out.println("Get Screenshot");
//	}
}
