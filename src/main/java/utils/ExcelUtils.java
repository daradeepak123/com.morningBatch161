package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {
	
	public static XSSFSheet returnSheetData(String path,String sheet) throws Exception
	{
		File file=new File(System.getProperty("user.dir")+path);  
		
		FileInputStream fis=new FileInputStream(file);
		
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		
		XSSFSheet sht=wb.getSheet(sheet);
		return sht;
		
	}
	
	

}
