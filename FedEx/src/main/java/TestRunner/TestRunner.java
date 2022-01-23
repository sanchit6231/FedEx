package TestRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "E:\\New folder\\D Drive\\javaWorkspace\\FedEx\\LoginFeature.feature"
		,glue={"stepDefination"}
		)
public class TestRunner {

}
