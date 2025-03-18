package testNGLearn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import seleniumBasics.BrowserInvoke;

public class TestNGWithSelenium {
	
	static WebDriver driver;
	static String data;
	static String url="https://the-internet.herokuapp.com";
	
	@BeforeClass
	public void openBrowser() throws Exception
	{
		driver=BrowserInvoke.openBrowser(driver, url);
	}
	
	@BeforeMethod
	public void loadHomePage()
	{
		driver.get(url);
	}
	
	@AfterMethod
	public void comeToHome()
	{
		driver.get(url);
	}
	
	@AfterClass 
	public void closeBrowser() throws Exception
	{
		
		driver.quit();	
	}
	
	@Test
	public void alerts()  throws Exception
	{
		
			driver.findElement(By.xpath("//a[text()='Checkboxes']")).click();
			WebElement chkbox1=driver.findElement(By.xpath("(//input)[1]"));
			WebElement chkbox2=driver.findElement(By.xpath("(//input)[2]"));
			
			if(!chkbox1.isSelected())
			{
				chkbox1.click();
			}
			
			if(!chkbox2.isSelected())
			{
				chkbox2.click();
			}
			
			Thread.sleep(3000);
			
	}
	
	@Test
	public void tableDataRead()
	{
		driver.findElement(By.xpath("//a[text()='Sortable Data Tables']")).click();
		int row=driver.findElements(By.xpath("//table[@id='table1']/tbody//tr")).size();
		
		int col=driver.findElements(By.xpath("//table[@id='table1']/tbody//tr[1]/td")).size();
		
		
		for(int i=1;i<=row;i++)
		{
			for(int j=1;j<=col;j++)
			{
				WebElement tData=driver.findElement(By.xpath("//table[@id='table1']/tbody//tr["+i+"]/td["+j+"]"));
				System.out.print(tData.getText()+"\t");
			}
			System.out.println();
		}
		
		
		
		
	}

}
