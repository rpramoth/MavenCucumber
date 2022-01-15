package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(		
		features = {"src\\test\\resources\\features\\Uber.feature"},
		glue = {"stepDefinitions"},
		plugin = {"pretty"},
		//		tags= "@Regression or @Smoke", tags="@Regression and @Smoke", tags="not @Prod"
		tags= "@All",
		monochrome = true
		)


public class UberRunner {

}
