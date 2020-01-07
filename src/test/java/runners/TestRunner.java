package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		tags = {"@current"},
		dryRun = false,
		monochrome = true,
		//strict = true,
		glue = "stepDefs",
		features = "src/test/resources/features",
		plugin = {
				"pretty",
				"html:target/html",
				"json:target/json/cucumber.json",
				"junit:target/junit/cucumber.xml"
		}
		)
public class TestRunner {

}
