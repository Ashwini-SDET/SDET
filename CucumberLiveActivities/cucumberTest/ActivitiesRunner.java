package cucumberTest;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "Features",
    glue = {"stepDefinitions"},
    tags = "@activity1_4_JobBoard",
    plugin = {"html: reports/Activity1_4_test-report-html"},
    monochrome = true
)

public class ActivitiesRunner {
	//empty
}
