package practice.ecoomerceAutomation.Utils;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverUtils {

	static WebDriver driver;

	public static WebDriver setbrowserdriver() throws IOException {
		if (driver == null) {
			if (ReadPropertiesFile.readPropertiesFile("browserType").equals("Chrome")) {
				WebDriverManager.chromedriver().setup();
				return new ChromeDriver();
			} else if (ReadPropertiesFile.readPropertiesFile("browserType").equals("IE")) {
				WebDriverManager.iedriver().setup();
				return new InternetExplorerDriver();

			} else if (ReadPropertiesFile.readPropertiesFile("browserType").equals("Firefox")) {
				WebDriverManager.firefoxdriver().setup();
				return new FirefoxDriver();
			} else {

				WebDriverManager.operadriver().setup();
				return new OperaDriver();
			}
		} else
			return driver;
	}
}
