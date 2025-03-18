package utils;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import seleniumBasics.SeleniumHelpers;

public class BusinessUtils {
	
	
	public static void login(WebDriver driver, XSSFSheet sht)
	{
		
		WebElement uName=driver.findElement(By.xpath("//input[@name='username']"));
		WebElement pwd=driver.findElement(By.xpath("//input[@name='password']"));
		WebElement loginBtn=driver.findElement(By.xpath("//button"));
		
		String uname=sht.getRow(0).getCell(0).toString();
		String pswd=sht.getRow(0).getCell(1).toString();
		SeleniumHelpers.sendDataTextBox(uName, uname);//PropertyFileData.retriveProperty("/src/data/config.properties", "uname"));
		SeleniumHelpers.sendDataTextBox(pwd, pswd);//PropertyFileData.retriveProperty("/src/data/config.properties", "password"));
		SeleniumHelpers.clickElement(driver, loginBtn);
		
		
	}
	

}
