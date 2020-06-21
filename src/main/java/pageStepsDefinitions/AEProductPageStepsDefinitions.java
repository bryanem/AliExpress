package pageStepsDefinitions;
import cucumber.api.java.en.Then;
import org.openqa.selenium.WebDriver;

public class AEProductPageStepsDefinitions extends AbstractPageStepsDefinitions {
	WebDriver driver=getDriver();
	
	//To check whether it has at least a number of pieces available to be bought or not
	@Then("^I see (\\d+) or more pieces available$")
	public void i_see_or_more_pieces_available(int arg1) {
		
	}
}