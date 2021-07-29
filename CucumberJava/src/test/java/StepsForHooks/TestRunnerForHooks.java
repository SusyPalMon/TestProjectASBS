package StepsForHooks;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/HooksDemo/HooksDemo.feature",glue= {"StepsForHooks"},monochrome=true,
/*plugin = {"pretty","html:target/HtmlReports"}*/
/*plugin = {"pretty", "json:target/JSONReports/report.json"}*/
/*plugin = {"pretty", "junit:target/JUnitReports/report.xml"},*/
plugin = {"pretty","junit:target/JUnitReports/report.xml",
		"json:target/JSONReports/report.json",
		"html:target/HtmlReport/HtmlReport.html"}

//tags = "@smoketest"
)

public class TestRunnerForHooks {

}
