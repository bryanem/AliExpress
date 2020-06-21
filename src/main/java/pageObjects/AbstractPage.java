package pageObjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public abstract class AbstractPage {
	protected WebDriver driver;
	
	//To create a page with its defined methods and attributes
	public AbstractPage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
}