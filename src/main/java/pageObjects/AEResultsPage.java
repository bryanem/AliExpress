package pageObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

//Definition of the basic objects and methods on the AliExpress page
public class AEResultsPage extends AbstractPage{
	
	@FindBy(css="span.next-input.next-large > input") private WebElement goToPageField;
	@FindBy(css="span.jump-btn") private WebElement goToPageButton;

	public AEResultsPage(WebDriver driver) {
		super(driver);
	}
	
	public WebElement getGoToPageField() {
		return goToPageField;
	}
	
	public WebElement getGoToPageButton() {
		return goToPageButton;
	}
	
	//To go to an specific results page
	public void goToPage(int pageNumber){
		goToPageField.sendKeys(Integer.toString(pageNumber));
		goToPageButton.click();
	}
	
	//To click on a search result by its position on the page
	public void clickResult(int position){
		driver.findElement(By.cssSelector("ul.list-items > li:nth-child("+position+")  a.item-title")).click();
	}
}