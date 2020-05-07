package practice.ecoomerceAutomation.Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverUtils {

	WebDriver driver;
    public static WebDriver setbrowserdriver(String browserType){
		
		if(browserType.equals("Chrome")){
			WebDriverManager.chromedriver().setup();
			return new ChromeDriver();
		}
		else if(browserType.equals("IE")){
			return new InternetExplorerDriver();
			
		}
		else if(browserType.equals("Firefox")){
			WebDriverManager.firefoxdriver().setup();
			return new FirefoxDriver();
		}
		else
			return new SafariDriver();
	}
	
}
