package hooks;
import cucumber.api.java.After;
import cucumber.api.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class hooks {
	@After
	public void tearDown(Scenario scenario) {
	    if (scenario.isFailed()) {
	    	// Take a screenshot
	    	pageObjects.AbstractPage.takesScreenshot("Error");
	    	//And other for a report
	    	final byte[] screenshot = ((TakesScreenshot) pageObjects.AbstractPage.driver).getScreenshotAs(OutputType.BYTES);
		    scenario.embed(screenshot, "image/png"); // ... and embed it in the report
	    }
	}
}