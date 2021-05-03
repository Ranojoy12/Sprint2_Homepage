package runner;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
@CucumberOptions(features="Feature/TopMenu.feature",glue= {"stepDefinition"})
public class TestRunner1 extends AbstractTestNGCucumberTests{

}
