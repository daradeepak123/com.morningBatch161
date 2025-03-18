package testNGLearn;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DashBoardTest extends BaseClass{
	
	@BeforeClass
	public void login()
	{
		
	}
	@BeforeMethod
	public void beOnDashBoard()
	{
		driver.findElement(By.xpath("//span[text()='Dashboard']")).click();
	}

	
	@Test
	public void dbTest()
	{
		driver.findElement(By.xpath("//span[text()='Dashboard']")).click();
	}
	
	
	@AfterMethod
	public void beOnDashBoardPage()
	{
		driver.findElement(By.xpath("//span[text()='Dashboard']")).click();
	}

	
}
