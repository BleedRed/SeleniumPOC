package practice.ecoomerceAutomation.Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.PageFactory;

import org.openqa.selenium.support.ui.Select;

public class AccountCreationPage {

	WebDriver driver;

	@FindBy(id = "id_gender1")

	WebElement genderRdbtn;

	@FindBy(id = "customer_firstname")

	WebElement firstNamechkbx;

	@FindBy(id = "customer_lastname")

	WebElement lastnameChkbx;

	@FindBy(id = "email")

	WebElement emailChkbx;

	@FindBy(id = "passwd")

	WebElement passwordChkbx;

	@FindBy(id = "days")

	WebElement daysDrpdwn;

	@FindBy(id = "months")

	WebElement monthDrpdwn;

	@FindBy(id = "years")

	WebElement yearDrpdwn;

	@FindBy(id = "firstname")

	WebElement customerfirstNamechkbx;

	@FindBy(id = "lastname")

	WebElement customerlastNamechkbx;

	@FindBy(id = "company")

	WebElement company;

	@FindBy(id = "address1")

	WebElement addressLine1;

	@FindBy(id = "address2")

	WebElement address2;

	@FindBy(id = "city")

	WebElement City;

	@FindBy(id = "id_state")

	WebElement State;

	@FindBy(id = "postcode")

	WebElement postcode;

	@FindBy(id = "id_country")

	WebElement Country;

	@FindBy(id = "other")

	WebElement other;

	@FindBy(id = "phone")

	WebElement phone;

	@FindBy(id = "phone_mobile")

	WebElement Mobile;

	@FindBy(id = "alias")

	WebElement Alias;

	@FindBy(id = "submitAccount")

	WebElement register;

	public void setfirstName(String firstName) {

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		firstNamechkbx.sendKeys(firstName);

	}

	public void setlastName(String lastName) {

		lastnameChkbx.sendKeys(lastName);

	}

	@SuppressWarnings("unlikely-arg-type")
	public boolean checkemailID(String emailID) {

		boolean bool = emailChkbx.equals(emailID);

		return bool;

	}

	public void setPassword(String password) {

		passwordChkbx.clear();

		passwordChkbx.sendKeys(password);

	}

	public void setcustFirstName(String custFirstName) {

		customerfirstNamechkbx.clear();

		customerfirstNamechkbx.sendKeys(custFirstName);

	}

	public void setcustLastName(String custLastName) {

		customerlastNamechkbx.clear();

		customerlastNamechkbx.sendKeys(custLastName);

	}

	public void setaddressLine(String addressLine) {

		addressLine1.clear();

		addressLine1.sendKeys(addressLine);

	}

	public void setCity(String city) {

		City.clear();

		City.sendKeys(city);

	}

	public void setState(String state) {

		// driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

		Select select = new Select((WebElement) State);

		select.selectByVisibleText(state);

	}

	public void selectCountry(String country) {

		Select select = new Select((WebElement) Country);

		select.selectByVisibleText(country);

	}

	public void setPostalCode(String postalCode) {

		postcode.clear();

		postcode.sendKeys(postalCode);

	}

	public void setMobile(String mobile) {

		Mobile.clear();

		Mobile.sendKeys(mobile);

	}

	public void setAlias(String alias) {

		Alias.clear();

		Alias.sendKeys(alias);

	}

	public void submitButton() {

		register.click();

	}

	public AccountCreationPage(WebDriver driver)

	{

		this.driver = driver;

		PageFactory.initElements(driver, this);

	}

}