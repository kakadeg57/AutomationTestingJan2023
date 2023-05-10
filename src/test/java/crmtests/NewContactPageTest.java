package crmtests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.TestBase;
import crmpages.HomePage;
import crmpages.LoginPage;
import crmpages.NewContactPage;
import utility.ReadData;

public class NewContactPageTest extends TestBase
{

	HomePage homePage;
	NewContactPage newContactPage;
	
	@BeforeMethod
	public void initialization()
	{
		TestBase.init();
		LoginPage loginPage = new LoginPage();
		 homePage = loginPage.login();
		 newContactPage = homePage.newContact();
		
	}
	
	@DataProvider(name ="contactData")
	public String[][] passData()
	{
		return ReadData.testData();
	}
	
	@Test(dataProvider = "contactData")
	public void validateCreateContact(String FirstName,String LastName, String MobileNumber, String Address)
	{
		newContactPage.createNewContact(FirstName,LastName,MobileNumber,Address);
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.close();
	}
}
