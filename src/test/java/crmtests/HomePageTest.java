package crmtests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import base.TestBase;
import crmpages.HomePage;
import crmpages.LoginPage;

public class HomePageTest extends TestBase
{
 
	HomePage homePage;
	
@BeforeMethod
public void initialization()
{
	init();
	LoginPage loginPage = new LoginPage();
	homePage = loginPage.login();
	 
}
	
@Ignore
@Test
public void validateUserTest()
{
	homePage.userCheck();
}
@Ignore		
@Test
public void validateLogoutTest()
{
	homePage.logout();
}
@Ignore	
@Test
public void validateHomePageLogoTest()
{
	homePage.logoCheck();
}

@Test
public void validateRedirectionOfCreateContactTest()
{
	homePage.newContact();
}
	
@Test
public void validateRedirectionOfCreateCompanyTest()
{
	homePage.createCompany();
}

@Test 
public void valdiateRedirectionOfcreateDealTest()
{
	homePage.createDeal();
}

@Test
public void valdiateRedirectionOfcreateTaskTest()
{
	homePage.createTask();
}

@AfterMethod
public void tearDown()
{
	driver.close();
}
	
}
