package pageObjects;
import java.time.Duration;
import java.util.ArrayList;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public abstract class AbstractPage {
	protected static WebDriver driver;
	protected JavascriptExecutor js;
	
	//To create a page with its defined methods and attributes
	public AbstractPage(WebDriver driver){
		AbstractPage.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	/**
	* Closes a popup if it appears
	*  
	* @param closeCSSLocator	CSS Locator for the closing button
	* @param timeToWait			Maximum time to wait for it to appear
	* @return					void
	*/
	public void closePopUp(String closeCSSLocator, long timeToWait){
		WebDriverWait waits = new WebDriverWait(driver, Duration.ofSeconds(timeToWait));
		try {
			waits.until(ExpectedConditions.elementToBeClickable(By.cssSelector(closeCSSLocator))).click();
		} catch (TimeoutException e) {
		}
	}
	
	/**
	* To scroll to the bottom of the page
	* The js JavascriptExecutor on this class is not expected to be defined before running this
	* 
	* @return				void
	*/
	public void goToBottom(){
		if (js==null) {
			js = (JavascriptExecutor) driver;
		}
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	}
	
	/**
	* To wait for the visibility of an element for a time no longer than timeout
	* 
	* @param element		element to wait for
	* @param timeout		maximum time in seconds to wait
	* @return				void
	*/
	public void waitForVisibility(WebElement element, int timeout) {
		WebDriverWait waits = new WebDriverWait(driver, Duration.ofSeconds(timeout));
	    waits.until(ExpectedConditions.visibilityOf(element));
	}
	
	/**
	* To wait for the invisibility or not presence of an element for a time no longer than timeout
	* 
	* @param element		element to wait for
	* @param timeout		maximum time in seconds to wait
	* @return				void
	*/
	public void waitForElementNotVisible(WebElement element, int timeout) {
		WebDriverWait waits = new WebDriverWait(driver, Duration.ofSeconds(timeout));
	    waits.until(ExpectedConditions.invisibilityOf(element));
	}
	
	/**
	* To wait for a time no longer than timeout a number of tabs to be opened (including the ones previously existing)
	* 
	* @param numberOfTabs	number of total tabs to wait for
	* @param timeout		maximum time in seconds to wait
	* @return				void
	*/
	public void waitForTabsOpened(int numberOfTabs, int timeout) {
		WebDriverWait waits = new WebDriverWait(driver, Duration.ofSeconds(timeout));
	    waits.until(ExpectedConditions.numberOfWindowsToBe(numberOfTabs));
	}
	
	/**
	* To switch to tab in position tabPosition
	* 
	* @param tabPosition	position of tab to switch to
	* @return				void
	*/
	public void switchToTab(int tabPosition){
		ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
		if(tabPosition>=tabs.size()){
			return;
		}
	    driver.switchTo().window(tabs.get(tabPosition));
	}
	
	/**
	* To close tab in position closeTabPosition
	* 
	* @param closeTabPosition	position of tab to be closed
	* @return					ArrayList<String>
	*/
	public ArrayList<String> closeTab(int closeTabPosition){
		ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
		if(closeTabPosition>=tabs.size()){
			return tabs;
		}
	    driver.switchTo().window(tabs.get(closeTabPosition));
	    driver.close();
	    return tabs;
	}
	
	/**
	* To close tab in position closeTabPosition and to switch to tab in position tabPosition
	* The positions can't have the same value
	* 
	* @param closeTabPosition	position of tab to be closed
	* @param tabPosition		position of tab to switch to
	* @return					void
	*/
	public void closeAndSwitchToTab(int closeTabPosition, int tabPosition){
		if(closeTabPosition==tabPosition){
			return;
		}
		ArrayList<String> tabs = closeTab(closeTabPosition);
	    driver.switchTo().window(tabs.get(tabPosition));
	}
}