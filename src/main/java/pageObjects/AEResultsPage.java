package pageObjects;
import java.util.List;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import pageStepsDefinitions.AbstractPageStepsDefinitions;

//Definition of the basic objects and methods on the AliExpress page
public class AEResultsPage extends AbstractPage{
	@FindBy(css="span.next-input.next-large > input") private WebElement goToPageField;
	@FindBy(css="span.jump-btn") private WebElement goToPageButton;
	private String paginationLocator="div.list-pagination";
	private String firstResultLocator="ul.list-items > li:nth-child(1)";
	public static String closePopupLocator="a.next-dialog-close";

	public AEResultsPage(WebDriver driver) {
		super(driver);
	}
	
	public WebElement getGoToPageField() {
		return goToPageField;
	}
	
	public WebElement getGoToPageButton() {
		return goToPageButton;
	}
	
	/**
	* To go to an specific results page
	* 
	* @param pageNumber		number of the result page to go
	* @return				AEResultsPage element, to be able to concatenate actions
	*/
	public AEResultsPage goToPage(int pageNumber){
		if(driver.findElements(By.cssSelector(firstResultLocator)).isEmpty()) {
			Assert.fail("No results found");
		}
		super.goToBottom();
		super.js.executeScript("arguments[0].scrollIntoView(false);", driver.findElement(By.cssSelector(paginationLocator)));
		waitForVisibility(goToPageField, 2);
		goToPageField.sendKeys(Integer.toString(pageNumber));
		goToPageButton.click();
		waitForElementNotVisible(driver.findElement(By.cssSelector("div.next-overlay-wrapper")), 5);
		return this;
	}
	
	/**
	* To click on a search result by its position on the page
	* 
	* @param position		of the result to click
	* @return				AEResultsPage element, to be able to concatenate actions
	*/
	public AEResultsPage clickResult(int position){
		List<WebElement> firsts = driver.findElements(By.cssSelector(firstResultLocator));
		if(firsts.isEmpty()) {
			Assert.fail("No results found");
		}
		int liHeight = firsts.get(0).getRect().height;
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,"+(liHeight*1.05*(position-1))+")");
		AbstractPageStepsDefinitions.wait(1);
		List<WebElement> inPositions = driver.findElements(By.cssSelector("ul.list-items > li:nth-child("+position+")  a.item-title"));
		if(inPositions.isEmpty()) {
			Assert.fail("No result at that position");
		}
		inPositions.get(0).click();
		return this;
	}
}