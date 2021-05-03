package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features="Feature/checktitle.feature",glue= {"stepDefinition"})
public class TestRunner2 extends AbstractTestNGCucumberTests {

}
