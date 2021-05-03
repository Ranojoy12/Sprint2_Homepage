package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features="Feature/checklogin.feature",glue= {"stepDefinition"})
public class TestRunner4 extends AbstractTestNGCucumberTests {

}
