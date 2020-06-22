package pageObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

//Definition of the basic objects and methods on the AliExpress page
public class AEResultsPage extends AbstractPage{
	@FindBy(css="span.next-input.next-large > input") private WebElement goToPageField;
	@FindBy(css="span.jump-btn") private WebElement goToPageButton;
	@FindBy(css="div.next-breadcrumb") private WebElement breadcrumb;
	private String paginationLocator="div.list-pagination";
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
	
	public WebElement getBreadcrumb() {
		return breadcrumb;
	}
	
	/**
	* To go to an specific results page
	* 
	* @param pageNumber		number of the result page to go
	* @return				AEResultsPage element, to be able to concatenate actions
	*/
	public AEResultsPage goToPage(int pageNumber){
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
		WebElement result = driver.findElement(By.cssSelector("ul.list-items > li:nth-child("+position+")  a.item-title"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(false);", result);
		result.click();
		return this;
	}
}