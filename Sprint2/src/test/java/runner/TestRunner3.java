package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features="Feature/headers_information.feature",glue= {"stepDefinition"})
public class TestRunner3 extends AbstractTestNGCucumberTests {

}
