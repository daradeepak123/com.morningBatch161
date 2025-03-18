package functionalFLow;

import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import dataDriven.PropertyFileData;
import seleniumBasics.BrowserInvoke;
import seleniumBasics.SeleniumHelpers;
import utils.ExcelUtils;

public class LoginOrangeHRM {
	
	
	static WebDriver driver;
	static String data;
	static String url="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	static String uname="";
	static String pswd="";
	
	public static void main(String[] args) throws Exception {

		driver=BrowserInvoke.openBrowser(driver, url);
		
		WebElement uName=driver.findElement(By.xpath("//input[@name='username']"));
		WebElement pwd=driver.findElement(By.xpath("//input[@name='password']"));
		WebElement loginBtn=driver.findElement(By.xpath("//button"));
		
		XSSFSheet sheet=ExcelUtils.returnSheetData("/dataFiles/employee.xlsx", "Sheet2");
		uname=sheet.getRow(0).getCell(0).toString();
		pswd=sheet.getRow(0).getCell(1).toString();
		SeleniumHelpers.sendDataTextBox(uName, uname);//PropertyFileData.retriveProperty("/src/data/config.properties", "uname"));
		SeleniumHelpers.sendDataTextBox(pwd, pswd);//PropertyFileData.retriveProperty("/src/data/config.properties", "password"));
		SeleniumHelpers.clickElement(driver, loginBtn);
		
		WebElement title=driver.findElement(By.xpath("//h6"));
		String titleData=title.getText();
		if(titleData.equals("Dashboard"))
		{
			List<WebElement> menuLinks=driver.findElements(By.xpath("//span[text()='Admin']/../../..//a"));
			for(WebElement ele:menuLinks)
			{
				System.out.println(ele.getText());
			}
		}
		driver.quit();
	}

}
