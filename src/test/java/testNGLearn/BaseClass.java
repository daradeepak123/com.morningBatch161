package testNGLearn;

import org.testng.annotations.BeforeTest;

import seleniumBasics.BrowserInvoke;
import utils.ExcelUtils;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;

public class BaseClass {
	
	public XSSFSheet sht;
	public WebDriver driver;
 
  @BeforeTest
  public void beforeTest() throws Exception {
	  driver=BrowserInvoke.openBrowser(driver, sht.getRow(3).getCell(1).toString());
  }

  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

  @BeforeSuite
  public void beforeSuite() throws Exception {
	  
	  sht=ExcelUtils.returnSheetData("/dataFiles/employee.xlsx", "Sheet2");
  }

  @AfterSuite
  public void afterSuite() {
  }

}
