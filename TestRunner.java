package Testrunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions
			(
			features=".//Features/Login",
			glue="stepDefinations",tags = {"@Sanity,@Smoke"},
			dryRun=false,
			monochrome=true,
			plugin={"pretty","html:test-output"}
			
					)
public class TestRunner {

}

