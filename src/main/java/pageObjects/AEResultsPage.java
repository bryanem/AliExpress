package pageObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pageStepsDefinitions.AbstractPageStepsDefinitions;

//Definition of the basic objects and methods on the AliExpress page
public class AEResultsPage extends AbstractPage{
	@FindBy(css="span.next-input.next-large > input") private WebElement goToPageField;
	@FindBy(css="span.jump-btn") private WebElement goToPageButton;
	@FindBy(css="div.next-breadcrumb") private WebElement breadcrumb;

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
		super.js.executeScript("window.scrollBy(0,-450)");//("arguments[0].scrollIntoView(false);", goToPageButton);
		AbstractPageStepsDefinitions.wait(1);
		goToPageField.sendKeys(Integer.toString(pageNumber));
		goToPageButton.click();
		AbstractPageStepsDefinitions.wait(2);
		return this;
	}
	
	/**
	* To click on a search result by its position on the page
	* 
	* @param position		of the result to click
	* @return				AEResultsPage element, to be able to concatenate actions
	*/
	public AEResultsPage clickResult(int position){
		driver.findElement(By.cssSelector("ul.list-items > li:nth-child("+position+")  a.item-title")).click();
		return this;
	}
}