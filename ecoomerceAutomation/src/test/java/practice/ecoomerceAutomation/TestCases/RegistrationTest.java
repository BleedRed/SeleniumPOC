package practice.ecoomerceAutomation.TestCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import practice.ecoomerceAutomation.Pages.AuthenticationPage;
import practice.ecoomerceAutomation.Pages.LoginPage;

public class RegistrationTest {

	String browserType="Chrome";
	WebDriver driver;
	LoginPage Login;
	String emailAddress="shuvadipdas20@gmail.com";
	AuthenticationPage authenticate;
	
	
	@Test
	public void loginTest()
	{
		Login=new LoginPage(driver);
		Login.login();
        authenticate=new AuthenticationPage(driver);
        authenticate.accounCreateBtnClick(emailAddress);
		
	}
	
	@BeforeTest
	public void setup()
	{
	 driver=practice.ecoomerceAutomation.Utils.DriverUtils.setbrowserdriver(browserType);
	
	}
	
	@AfterTest
	public void teardown()
	{
		//driver.quit();
	}
	
}
