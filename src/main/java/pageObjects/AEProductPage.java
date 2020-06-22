package pageObjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

//Definition of the basic objects and methods on the AliExpress page
public class AEProductPage extends AbstractPage{

	@FindBy(css="div.product-quantity-tip  > span") private WebElement quantityAvailableSpan;
	
	public AEProductPage(WebDriver driver) {
		super(driver);
	}
	
	public WebElement getQuantityAvailableSpan() {
		return quantityAvailableSpan;
	}
	
	/**
	* To get the text of the quantity available
	* 
	* @return				The text of the quantity available
	*/
	public String getQuantityAvailableText() {
		return quantityAvailableSpan.getText();
	}
}