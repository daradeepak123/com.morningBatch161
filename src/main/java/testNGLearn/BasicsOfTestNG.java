package testNGLearn;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BasicsOfTestNG {
	
	@BeforeSuite
	public void openFiles()
	{
		System.out.println("This is before Suite logic to open data files");
	}

	@BeforeTest
	public void openBrowser()
	{
		System.out.println("This is before test logic to open browser");
	}
	
	@BeforeClass
	public void loginApp()
	{
		System.out.println("This is before class and used to login into application");
	}
	
	@BeforeMethod
	public void preCondition()
	{
		System.out.println("Before method and be on the page");
	}
	
	@Test
	public void testMethod()
	{
		System.out.println("This is testNG method");
	}
	
	
	
	@Test
	public void testMethod1()
	{
		System.out.println("This is testNG method1");
	}
	
	@Test
	public void testMethod2()
	{
		System.out.println("This is testNG method2");
	}
	
	
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("This is after method or clean up");
	}
	
	@AfterClass
	public void logOutApplication()
	{
		System.out.println("This is after class ised for log out");
	}
	
	@AfterTest
	public void quitBrowser()
	{
		System.out.println("this is to close browser");
	}

	
	@AfterSuite
	public void closeFiles()
	{
		System.out.println("This is before Suite");
	}
	
	
	
	
	
}
