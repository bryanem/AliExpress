package pageObjects;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebDriver;

public abstract class AbstractPage {
	protected WebDriver driver;
	protected JavascriptExecutor js;
	
	//To create a page with its defined methods and attributes
	public AbstractPage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	/**
	* To scroll to the bottom of the page
	* 
	* @return				void
	*/
	public void goToBottom(){
		if (js==null) {
			js = (JavascriptExecutor) driver;
		}
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	}
}