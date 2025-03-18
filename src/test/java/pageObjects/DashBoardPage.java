package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class DashBoardPage {
	
	WebDriver ldriver;
	
	
	public DashBoardPage(WebDriver driver)
	{
		ldriver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	
	@FindBy(xpath="//span[text()='Dashboard']")
	WebElement dashboardTab;
	
	
	@FindBy(xpath="//p[text()='Assign Leave']/../../button")
	WebElement AssignLeaveBtn;
	
	
	
	public void dashBoardClick()
	{
		dashboardTab.click();
	}
	
	public void assignLeaveButton()
	{
		AssignLeaveBtn.click();
		
	}
	
	
	

}
