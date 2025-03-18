package seleniumBasics;

import java.lang.annotation.AnnotationTypeMismatchException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WebElementsLearn {

	
	static WebDriver driver;
	static String data;
	static String url="https://the-internet.herokuapp.com/forgot_password";
	public static void main(String[] args) throws Exception {
		
		driver=BrowserInvoke.openBrowser(driver, url);
		
		WebElement fPassword=driver.findElement(By.xpath("//h2[text()='Forgot Password']"));
		WebElement emailEle=driver.findElement(By.xpath("//label[text()='E-mail']"));
		WebElement emailTB=driver.findElement(By.xpath("//input[@id='email']"));
		WebElement button=driver.findElement(By.xpath("//button[contains(@id,'m_')]"));
		
		
		
		SeleniumHelpers.getTextFromElement(fPassword);
		SeleniumHelpers.getTextFromElement(emailEle);
		SeleniumHelpers.sendDataTextBox(emailTB, "hello@hello.com");
		SeleniumHelpers.clickElement(driver,button);
		
		//after clicking on retrive password burron
		WebElement heading=driver.findElement(By.xpath("//h1"));
		SeleniumHelpers.getTextFromElement(heading);
	
		
		
		driver.quit();
		
	}

}
