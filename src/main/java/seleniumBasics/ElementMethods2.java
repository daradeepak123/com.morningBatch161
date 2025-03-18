package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ElementMethods2 {
	
	
	static WebDriver driver;
	static String data;
	static String url="https://the-internet.herokuapp.com/forgot_password";
	public static void main(String[] args) throws Exception {
		
		driver=BrowserInvoke.openBrowser(driver, url);
		
		
		WebElement ele=driver.findElement(By.xpath("//h2"));
		
		Dimension d=ele.getSize();
		System.out.println(d.height+"             "+d.width);
		
		Point p=ele.getLocation();
		System.out.println(p.x+"     "+p.y);
		
		
		driver.quit();
		
		
		
	}

}
