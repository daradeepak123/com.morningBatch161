package winHandles;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import seleniumBasics.BrowserInvoke;

public class WindowHandles {
	
	
	static WebDriver driver;
	static String data;
	static String url="https://the-internet.herokuapp.com/";
	
	
	public static void main(String[] args) throws Exception {

		driver=BrowserInvoke.openBrowser(driver, url);
		
		driver.findElement(By.xpath("//a[text()='Elemental Selenium']")).click();
	
	
	String parentTab=driver.getWindowHandle();
	System.out.println(parentTab);
	
	
	Set<String> win=driver.getWindowHandles();
	
	for(String s:win)
	{
		if(!s.equals(parentTab))
		{
			
			driver.switchTo().window(s);
			String title=driver.getTitle();
			if(title.equals("Home | Elemental Selenium")) {
			driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Hello@hello.com");
			}
		}
	}
	Thread.sleep(5000);
	//driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Hello@hello.com");
	
	driver.quit();
	
	}

}
