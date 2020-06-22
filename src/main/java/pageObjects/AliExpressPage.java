package pageObjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

//Definition of the basic objects and methods on the AliExpress page
public class AliExpressPage extends AbstractPage{
	@FindBy(id="search-key") private WebElement searchField;
	@FindBy(css="input.search-button") private WebElement searchButton;
	public static String closePopupLocator="a.close-layer";

	public AliExpressPage(WebDriver driver) {
		super(driver);
	}
	
	public WebElement getSearchField() {
		return searchField;
	}
	
	public WebElement getSearchButton() {
		return searchButton;
	}
	
	/**
	* To search for something on AliExpress
	* 
	* @param searchText		text to search
	* @return				AliExpressPage element, to be able to concatenate actions
	*/
	public AliExpressPage search(String searchText){
		searchField.sendKeys(searchText);
		searchButton.click();
		return this;
	}
}