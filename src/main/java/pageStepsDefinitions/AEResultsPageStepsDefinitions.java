package pageStepsDefinitions;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import pageObjects.AEResultsPage;
import pageObjects.AliExpressPage;

public class AEResultsPageStepsDefinitions extends AbstractPageStepsDefinitions {
	WebDriver driver=getDriver();
	AEResultsPage aEResultsPage=new AEResultsPage(driver);
	
	//To select a results page from the input option
	@When("^I go to the page (\\d+) of the results$")
	public void i_go_to_the_page_of_the_results(int pageNumber) {
		aEResultsPage.goToPage(pageNumber);
	}
	
	//To click on a result by its position
	@When("^I click on the (\\d+)º ad$")
	public void i_click_on_the_º_ad(int position) {
		aEResultsPage.clickResult(position);
		wait(1);
		aEResultsPage.switchToTab(1);
		aEResultsPage.waitForFullyLoadedPage(8);
	    AliExpressPage.closePopUp();
	}
}