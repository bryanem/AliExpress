package pageStepsDefinitions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import util.PropertiesManager;

public abstract class AbstractPageStepsDefinitions {
	public static PropertiesManager properties;
	public static WebDriver driver;
	
	//Method to get the driver according to the parameters, or just retrieving it when it already exists
	protected WebDriver getDriver() {
		if(driver==null) {
			properties=new PropertiesManager();
			properties.generateProperties();
			if("firefox".equals(properties.browser)) {
				System.setProperty("webdriver.gecko.driver","geckodriver.exe");
				driver = new FirefoxDriver();
			} else if("edge".equals(properties.browser)) {
				System.setProperty("webdriver.edge.driver","msedgedriver.exe");
				driver = new EdgeDriver();
			} else {
				System.setProperty("webdriver.chrome.driver","chromedriver.exe");
				driver = new ChromeDriver();
			}
		}
		return driver;
	}
	
	//To wait seconds
	public static void wait(int seconds) {
		try {
			Thread.sleep(seconds*1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}