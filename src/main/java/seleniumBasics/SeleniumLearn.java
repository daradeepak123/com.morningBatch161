package seleniumBasics;


import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class SeleniumLearn {
	
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		Scanner sc=new Scanner(System.in);
		System.out.println("enterdesired browser");
		String browser=sc.next();
		
		if(browser.equalsIgnoreCase("chrome"))
		{
			driver=new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("firefox")){
		driver=new FirefoxDriver();
		}
		else if(browser.equalsIgnoreCase("ie")){
			driver=new InternetExplorerDriver();
			}
			
		else if(browser.equalsIgnoreCase("edge")){
			driver=new EdgeDriver();
			}
			
		else {
			driver=new FirefoxDriver();
			}
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/selenium/docs/api/java/org/openqa/selenium/WebDriver.html");
		
		Thread.sleep(3000);
		
		String title=driver.getTitle();
		System.out.println(title);
		
		String cURL=driver.getCurrentUrl();
		System.out.println(cURL);
		
		String pageSo=driver.getPageSource();
		//System.out.println(pageSo);
		
		
		driver.navigate().to("https://www.tpointtech.com/selenium-webdriver-commands");
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().forward();
		Thread.sleep(3000);
		
		
		driver.quit();

		
		
		
		
	}

}
