package pageStepsDefinitions;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import pageObjects.AEProductPage;

public class AEProductPageStepsDefinitions extends AbstractPageStepsDefinitions {
	WebDriver driver=getDriver();
	AEProductPage aEProductPage=new AEProductPage(driver);
	
	//To check whether it has at least a number of pieces available to be bought or not
	@Then("^I see (\\d+) or more pieces available$")
	public void i_see_or_more_pieces_available(int toBeAvailable) {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(false);", aEProductPage.getQuantityAvailableSpan());
		String quantityAvailableText = aEProductPage.getQuantityAvailableText();
		int quantityAvailable = Integer.valueOf(quantityAvailableText.split(" ")[0]);
		Assert.assertTrue("The quantity available is less than "+toBeAvailable+" because it is just "+quantityAvailable, quantityAvailable>=toBeAvailable);
	}
}