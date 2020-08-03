package practice.ecoomerceAutomation.TestCases;

import java.io.IOException;

import org.testng.Assert;

import org.testng.annotations.DataProvider;

import org.testng.annotations.Test;

import org.testng.asserts.SoftAssert;

import practice.ecoomerceAutomation.Pages.AuthenticationPage;

import practice.ecoomerceAutomation.Pages.HomePage;

import practice.ecoomerceAutomation.Pages.MyAccountPage;

import practice.ecoomerceAutomation.Utils.BaseTest;

import practice.ecoomerceAutomation.Utils.ExcelUtils;

import practice.ecoomerceAutomation.Pages.AccountCreationPage;

public class AccountCreationTest extends BaseTest {

	ExcelUtils obj = new ExcelUtils();

	// WebDriver driver;

	HomePage Login;

	AuthenticationPage authenticate;

	AccountCreationPage accntCreate;

	MyAccountPage accountPage;

	SoftAssert softAssertion = new SoftAssert();

	@Test(dataProvider = "TestData")

	public void loginTest(String First_Name, String Last_Name, String Email_ID, String Password, String firstName,

			String lastName, String addressLine, String City, String State, String Postal_Code, String Country,

			String Mobile_No, String Address_Alias) throws IOException {

		super.setup();

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

		super.teardown();

	}

	@DataProvider(name = "TestData")

	public Object[][] getDataFromDataprovider() throws IOException {

		Object[][] data = new Object[100][100];

		data = obj.getdata();

		return data;

	}

}