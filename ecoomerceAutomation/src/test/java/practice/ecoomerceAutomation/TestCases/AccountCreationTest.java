package practice.ecoomerceAutomation.TestCases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import org.testng.Assert;

import org.testng.annotations.AfterTest;

import org.testng.annotations.BeforeTest;

import org.testng.annotations.DataProvider;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import practice.ecoomerceAutomation.Pages.AuthenticationPage;

import practice.ecoomerceAutomation.Pages.HomePage;

import practice.ecoomerceAutomation.Pages.MyAccountPage;

import practice.ecoomerceAutomation.Utils.ExcelUtils;

import practice.ecoomerceAutomation.Pages.AccountCreationPage;

public class AccountCreationTest {

	ExcelUtils obj = new ExcelUtils();

	WebDriver driver;

	HomePage Login;

	String filePath = "C:\\Users\\shuva\\Downloads\\ecoomerceAutomation\\src\\test\\java\\TestResources\\Book1.xlsx";

	AuthenticationPage authenticate;

	AccountCreationPage accntCreate;

	String user = "Shuvadip Das";

	MyAccountPage accountPage;

	SoftAssert softAssertion = new SoftAssert();

	@Test(dataProvider = "TestData")

	public void loginTest(String First_Name, String Last_Name, String Email_ID, String Password, String firstName,

			String lastName, String addressLine, String City, String State, String Postal_Code, String Country,

			String Mobile_No, String Address_Alias) {

		Login = new HomePage(driver);

		accntCreate = new AccountCreationPage(driver);

		Login.login();

		authenticate = new AuthenticationPage(driver);

		accountPage = new MyAccountPage(driver);

		authenticate.accounCreateBtnClick(Email_ID);

		accntCreate.setfirstName(First_Name);

		accntCreate.setlastName(lastName);

		softAssertion.assertTrue(accntCreate.checkemailID(Email_ID));

		accntCreate.setPassword(Password);

		accntCreate.setcustFirstName(firstName);

		accntCreate.setcustLastName(lastName);

		accntCreate.setaddressLine(addressLine);

		accntCreate.setCity(City);

		accntCreate.setState(State);

		accntCreate.selectCountry(Country);

		accntCreate.setPostalCode(Postal_Code);

		accntCreate.setMobile(Mobile_No);

		accntCreate.setAlias(Address_Alias);

		accntCreate.submitButton();

		Assert.assertEquals(First_Name + " " + Last_Name, accountPage.getuserVerificationName());

	}

	@DataProvider(name = "TestData")

	public Object[][] getDataFromDataprovider() throws IOException {

		Object[][] data = new Object[100][100];

		data = obj.getdata(filePath);

		return data;

	}

	@BeforeTest

	public void setup() throws IOException {

		driver = practice.ecoomerceAutomation.Utils.DriverUtils.setbrowserdriver();

	}

	@AfterTest

	public void teardown() {

		driver.quit();

	}
}