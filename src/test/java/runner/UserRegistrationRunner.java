package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(		
		features = {"src\\test\\resources\\features\\registration.feature"},
		glue = {"stepDefinitions"},
		plugin = {"pretty","json:target/MyReport/report.json"},
		monochrome = true
)
public class UserRegistrationRunner {

}
