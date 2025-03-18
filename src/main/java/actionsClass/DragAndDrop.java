package actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import seleniumBasics.BrowserInvoke;

public class DragAndDrop {
	
	static WebDriver driver;
	static String data;
	static String url="https://the-internet.herokuapp.com/drag_and_drop";
	public static void main(String[] args) throws Exception {

		driver=BrowserInvoke.openBrowser(driver, url);
		
		WebElement A=driver.findElement(By.xpath("//div[@id='column-a']"));
		WebElement B=driver.findElement(By.xpath("//div[@id='column-b']"));
		
		Actions act=new Actions(driver);
		
		act.dragAndDrop(A, B).build().perform();
		
		
		Thread.sleep(5000);
		
		driver.quit();
	}

}
