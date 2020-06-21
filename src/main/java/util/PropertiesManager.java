package util;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.IOException;
import java.util.Properties;

//Class to get parameters from the parameters.properties file (e.g. browser and home page for the tests)
public class PropertiesManager {
	public String home="";
	public String browser="";
	
	public void generateProperties() {
		Properties prop=new Properties();
		InputStream input=null;
		try {
			input=new FileInputStream("src/main/java/parameters.properties");
			prop.load(input);
			home=prop.getProperty("home").toString();
			browser=prop.getProperty("browser").toString();
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
}