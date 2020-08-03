package practice.ecoomerceAutomation.Utils;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {

	protected WebDriver driver;

	@BeforeTest

	public void setup() throws IOException {

		driver = practice.ecoomerceAutomation.Utils.DriverUtils.setbrowserdriver();

	}

	@AfterTest

	public void teardown() {

		driver.quit();

	}

}
