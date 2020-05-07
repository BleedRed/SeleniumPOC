package practice.ecoomerceAutomation.TestCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import practice.ecoomerceAutomation.Pages.LoginPage;
//import practice.ecoomerceAutomation.Utils.DriverUtils;



public class FindAllLinkTest {

	String browserType="Chrome";
	   WebDriver driver;
	   
	   LoginPage loginPage;
	   
	   @Test
	   public void printallLinks()
	   {
		   loginPage=new LoginPage(driver);
		  
		   loginPage.findalllinkelements();
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
