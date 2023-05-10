package crmpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;
import utility.Util;

public class HomePage extends TestBase
{
// to initialize web elements
public HomePage()
{
	PageFactory.initElements(driver, this);
}
	
//WebElements repository 
	
@FindBy (xpath = "/html/body/table[1]/tbody/tr[1]/td/table/tbody/tr/td[1]")
WebElement user;

@FindBy (xpath = "/html/body/table[1]/tbody/tr[2]/td[1]/div/table/tbody/tr/td[4]/a")
WebElement logoutBtn;

@FindBy (xpath = "//td[text()='CRMPRO']")
WebElement logo;

@FindBy (xpath = "//a[text()='Contacts']")
WebElement contacts;

@FindBy (xpath = "//a[text()='New Contact']")
WebElement newContact;

@FindBy (xpath = "//a[text()='Companies']")
WebElement company;
@FindBy (xpath ="//a[text()='New Company']")
WebElement newCompany;


@FindBy (xpath = "//a[text()='Deals']")
WebElement deal;
@FindBy (xpath = "//a[text()='New Deal']")
WebElement newDeal;


@FindBy (xpath = "//a[text()='Tasks']")
WebElement task;
@FindBy (xpath = "//a[text()='New Task']")
WebElement newTask;

// Action
public String userCheck()
{
	Util.switchToMainPanelFrame();
	String userName = user.getText();
	return userName;
}
public void logout()
{
	Util.switchToMainPanelFrame();
	logoutBtn.click();
}
public boolean logoCheck()
{
	Util.switchToMainPanelFrame();
	boolean status = logo.isDisplayed();
	return status;
	
}
public NewContactPage newContact()
{
	Util.switchToMainPanelFrame();
	Util.mouseHoverAction(contacts);
	newContact.click();
	return new NewContactPage();
}


public void createCompany()
{
	Util.switchToMainPanelFrame();
	Util.mouseHoverAction(company);
	newCompany.click();
}

public void createDeal()
{
	Util.switchToMainPanelFrame();
	Util.mouseHoverAction(deal);
	newDeal.click();
}

public void createTask()
{
	Util.switchToMainPanelFrame();
	Util.mouseHoverAction(task);
	newTask.click();
}

}
