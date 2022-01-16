package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(		
		features = {"src\\test\\resources\\features\\Uber.feature"},
		glue = {"stepDefinitions"},
		plugin = {"pretty","json:target/MyReport/report.json"},
		//		tags= "@Regression or @Smoke", tags="@Regression and @Smoke", tags="not @Prod"
		tags= "@All",
		monochrome = true,
		dryRun = false // this will not run any of the steps if the step is not defined for a step 
//		publish=true // publish ur report to cucumber cloud
//		strict = true-- this is deprecated
		)


public class UberRunner {

}
