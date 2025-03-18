package alertsLearn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import seleniumBasics.BrowserInvoke;

public class AlertsDealing {
	static WebDriver driver;
	static String data;
	static String url="https://the-internet.herokuapp.com/javascript_alerts";
	
	
	public static void main(String[] args) throws Exception {

		driver=BrowserInvoke.openBrowser(driver, url);
		
		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
		
		Thread.sleep(3000);
		
		driver.switchTo().alert().accept();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
		
		Thread.sleep(3000);
		
		driver.switchTo().alert().dismiss();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		
		Thread.sleep(3000);
		System.out.println(driver.switchTo().alert().getText());
		
		driver.switchTo().alert().sendKeys("hello data");

		driver.switchTo().alert().accept();
		Thread.sleep(3000);
		
		
		
		
		
		driver.quit();

	}

}
