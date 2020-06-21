package pageStepsDefinitions;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;

public class AEResultsPageStepsDefinitions extends AbstractPageStepsDefinitions {
	WebDriver driver=getDriver();
	
	//To select a results page from the input option
	@When("^I go to the page (\\d+) of the results$")
	public void i_go_to_the_page_of_the_results(int arg1) {
		
	}
	
	//To click on a result by its position
	@When("^I click on the (\\d+)º ad$")
	public void i_click_on_the_º_ad(int arg1) {
		
	}
}