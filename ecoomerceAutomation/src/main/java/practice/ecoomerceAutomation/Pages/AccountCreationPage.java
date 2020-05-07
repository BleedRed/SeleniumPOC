package practice.ecoomerceAutomation.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountCreationPage {
	
	WebDriver driver;
	
	@FindBy(id="id_gender1")
	WebElement genderRdbtn;

	@FindBy(id="customer_firstname")
	WebElement firstNamechkbx;
	
	@FindBy(id="customer_lastname")
	WebElement lastnameChkbx;
	
	@FindBy(id="email")
	WebElement emailChkbx;
	
	@FindBy(id="passwd")
	WebElement passwordChkbx;
	
	@FindBy(id="days")
	WebElement daysDrpdwn;
	
	@FindBy(id="months")
	WebElement monthDrpdwn;
	
	@FindBy(id="years")
	WebElement yearDrpdwn;
	
	@FindBy(id="years")
	WebElement customerfirstNamechkbx;
	
	@FindBy(id="years")
	WebElement customerlastNamechkbx;
	
}
