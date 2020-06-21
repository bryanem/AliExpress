package pageObjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

//Definition of the basic objects and methods on the AliExpress page
public class AliExpressPage extends AbstractPage{
	
	@FindBy(id="search-key") private WebElement searchField;
	@FindBy(css="input.search-button") private WebElement searchButton;

	public AliExpressPage(WebDriver driver) {
		super(driver);
	}
	
	public WebElement getSearchField() {
		return searchField;
	}
	
	public WebElement getSearchButton() {
		return searchButton;
	}
	
	//To search for something on AliExpress
	public void search(String searchText){
		searchField.sendKeys(searchText);
		searchButton.click();
	}
}