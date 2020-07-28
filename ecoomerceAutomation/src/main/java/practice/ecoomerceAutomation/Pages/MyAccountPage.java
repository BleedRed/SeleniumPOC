package practice.ecoomerceAutomation.Pages;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.PageFactory;

public class MyAccountPage {

	WebDriver driver;

	@FindBy(xpath = "//*[@title='View my customer account']")

	WebElement userVerification;

	public String getuserVerificationName() {

		String userName = userVerification.getText();

		return userName;

	}

	public MyAccountPage(WebDriver driver) {

		this.driver = driver;

		PageFactory.initElements(driver, this);

	}

}