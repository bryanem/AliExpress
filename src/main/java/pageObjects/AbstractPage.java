package pageObjects;
import java.time.Duration;
import java.util.ArrayList;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
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
	* To close tab in position closeTabPosition
	* 
	* @param closeTabPosition	position of tab to be closed
	* @return					ArrayList<String>
	*/
	public ArrayList<String> closeTab(int closeTabPosition){
		ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
	    driver.switchTo().window(tabs.get(closeTabPosition));
	    driver.close();
	    return tabs;
	}
	
	/**
	* To switch to tab in position tabPosition
	* 
	* @param tabPosition	position of tab to switch to
	* @return				void
	*/
	public void switchToTab(int tabPosition){
		ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
	    driver.switchTo().window(tabs.get(tabPosition));
	}
	
	/**
	* To close tab in position closeTabPosition and to switch to tab in position tabPosition
	* 
	* @param closeTabPosition	position of tab to be closed
	* @param tabPosition		position of tab to switch to
	* @return					void
	*/
	public void closeAndSwitchToTab(int closeTabPosition, int tabPosition){
		ArrayList<String> tabs = closeTab(closeTabPosition);
	    driver.switchTo().window(tabs.get(tabPosition));
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
	* To wait for the page to be fully loaded
	* 
	* @param timeout		maximum time in seconds to wait
	* @return				void
	*/
	public void waitForFullyLoadedPage(int timeout) {
		WebDriverWait waits = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		//Condition for fully loaded page
		ExpectedCondition<Boolean> expectation = new ExpectedCondition<Boolean>() {
			public Boolean apply(WebDriver driver) {
				if (js==null) {
					js = (JavascriptExecutor) driver;
				}
				return js.executeScript("return document.readyState").toString().equals("complete");
			}
		};
	    waits.until(expectation);
	}
}