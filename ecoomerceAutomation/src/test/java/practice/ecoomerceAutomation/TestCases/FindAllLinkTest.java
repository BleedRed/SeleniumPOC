package practice.ecoomerceAutomation.TestCases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import practice.ecoomerceAutomation.Pages.HomePage;
//import practice.ecoomerceAutomation.Utils.DriverUtils;

public class FindAllLinkTest {

	WebDriver driver;

	HomePage homePage;

	@Test
	public void printallLinks() {
		homePage = new HomePage(driver);

		homePage.findalllinkelements();
	}

	@BeforeTest
	public void setup() throws IOException {
		driver = practice.ecoomerceAutomation.Utils.DriverUtils.setbrowserdriver();

	}

	@AfterTest
	public void teardown() {
		// driver.quit();
	}

}
