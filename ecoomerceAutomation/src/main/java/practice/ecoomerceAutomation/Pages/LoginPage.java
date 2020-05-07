package practice.ecoomerceAutomation.Pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver driver;
	@FindBy(xpath="//*[@class='login']")
	WebElement signInLink;
	
	
	public void login()
	{
		driver.navigate().to("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		signInLink.click();
		
	}
	 
		public void findalllinkelements()
		{
			driver.navigate().to("http://automationpractice.com/index.php");
			driver.manage().window().maximize();
			//first get all the <a> elements
			List<WebElement> linkList=driver.findElements(By.tagName("a"));
			List<String> hrefs = new ArrayList<String>();

		    for(WebElement linkLists:linkList)
		    {
		        hrefs.add(linkLists.getAttribute("href"));

		    }
		   
		    for ( String href : hrefs ) {
		        System.out.println(href);
		    }
		}
	
	public LoginPage(WebDriver driver)
	
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
}
