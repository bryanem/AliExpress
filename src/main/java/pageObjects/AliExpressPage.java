package pageObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

//Definition of the basic objects and methods on the AliExpress page
public class AliExpressPage extends AbstractPage{
	private final String closePopupLocator="a.next-dialog-close";
	@FindBy(css=closePopupLocator) private WebElement closePopup;
	@FindBy(id="search-key") private WebElement searchField;
	@FindBy(css="input.search-button") private WebElement searchButton;

	public AliExpressPage(WebDriver driver) {
		super(driver);
	}
	
	public WebElement getClosePopup() {
		return closePopup;
	}
	
	public WebElement getSearchField() {
		return searchField;
	}
	
	public WebElement getSearchButton() {
		return searchButton;
	}
	
	/**
	* Closes a popup if appears
	* 
	* @return				AEResultsPage element, to be able to concatenate actions
	*/
	public AliExpressPage closePopUp(){
		if(!driver.findElements(By.cssSelector(closePopupLocator)).isEmpty()) {
			closePopup.click();
		}
		return this;
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