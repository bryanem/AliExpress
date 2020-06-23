import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
		//To create an html report on target folder
		plugin={"pretty","html:target/cucumber-html-report"},
		//Not skipping when step not defined
		strict = true,
		//For better logs on the console
		monochrome = true,
		//Location of the test cases defined in gherkin
		features="src/main/features"
) 
public class RunTest {
	//After completing the test, it will close the browser
	@AfterClass
	public static void teardown() {
		pageStepsDefinitions.AbstractPageStepsDefinitions.driver.quit();
    }
}