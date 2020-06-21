package pageStepsDefinitions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;

public class AliExpressPageStepsDefinitions extends AbstractPageStepsDefinitions {
	WebDriver driver=getDriver();
	
	//Definition of the first test step that loads the AliExpress page
	@Given("^I am on AliExpress$")
	public void i_am_on_AliExpress() {
		driver.navigate().to(properties.home);
		wait(3);
	}
	
	//To search for something
	@When("^I do a search for \"([^\"]*)\"$")
	public void i_do_a_search_for(String arg1) {
	    
	}
}