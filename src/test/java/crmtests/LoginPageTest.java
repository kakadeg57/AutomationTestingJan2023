package crmtests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.TestBase;
import crmpages.LoginPage;

public class LoginPageTest extends TestBase
{
	LoginPage loginPage;
	
	@BeforeMethod
	public void initialization()
	{
		init();
		loginPage = new LoginPage();
	}
	
	@Test
	public void validateLoginTest()
	{
		loginPage.login();
	}
	@Test
	public void validateLogoTest()
	{
	 boolean actualStatus  = loginPage.logoStatus();
	 Assert.assertEquals(actualStatus, true);
	   
	}
	@Test
	public void validateLinksTest()
	{
		boolean actualStatus =	loginPage.linkStatus();
		Assert.assertTrue(actualStatus);
	}
	@AfterMethod
	public void tearDown()
	{
		driver.close();
	}
	
	
	

}
