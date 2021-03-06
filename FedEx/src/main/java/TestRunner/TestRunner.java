package TestRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\Admin\\git\\FedEx\\FedEx\\LoginFeature.feature", 
				 glue = {"stepDefination" }, 
				 format = { "pretty", "html:test-output" }, 
				 monochrome = true, 
				 strict = true, 
				 dryRun = false,
				 tags = {"@RegressionTest"})
public class TestRunner {

}
