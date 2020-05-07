package practice.ecoomerceAutomation.Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AuthenticationPage {

	WebDriver driver;
    JavascriptExecutor js;

	@FindBy(xpath="//*[@name='email_create']")
	WebElement emailAddressbx;
	
	@FindBy(id="SubmitCreate")
	WebElement accounCreateBtn;
	
	public void setEmailAdress(String emailAdress)
	{
	
		emailAddressbx.sendKeys(emailAdress);
		
	}
	
	public void accounCreateBtnClick(String emailAddress)
	{
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		setEmailAdress(emailAddress);
		accounCreateBtn.click();
	}
	
	public AuthenticationPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	    js = (JavascriptExecutor) this.driver;

	}
}
