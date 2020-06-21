package pageStepsDefinitions;
import cucumber.api.java.en.Given;
import org.openqa.selenium.WebDriver;

public class AliExpressPageStepsDefinitions extends AbstractPageStepsDefinitions {
	WebDriver driver=getDriver();
	
	//Definition of the first test step that loads the AliExpress page
	@Given("^I am on AliExpress$")
	public void i_am_on_AliExpress() throws Throwable {
		driver.navigate().to(properties.home);
		wait(3);
	}
}