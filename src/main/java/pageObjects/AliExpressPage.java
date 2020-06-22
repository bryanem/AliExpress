package pageObjects;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

//Definition of the basic objects and methods on the AliExpress page
public class AliExpressPage extends AbstractPage{
	private static final String closePopupLocator="a.next-dialog-close";
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
	* Closes a popup if it appears
	* 
	* @return				void
	*/
	public static void closePopUp(){
		WebDriverWait waits = new WebDriverWait(driver, Duration.ofSeconds(2));
		try {
			waits.until(ExpectedConditions.elementToBeClickable(By.cssSelector(closePopupLocator))).click();
		} catch (TimeoutException e) {
		}
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
		waitForFullyLoadedPage(8);
		return this;
	}
}