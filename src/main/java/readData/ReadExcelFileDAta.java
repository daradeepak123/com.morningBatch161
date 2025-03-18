package readData;


import org.apache.poi.xssf.usermodel.XSSFSheet;

import utils.ExcelUtils;

public class ReadExcelFileDAta {

	public static void main(String[] args) throws Exception {
		

		XSSFSheet sht=ExcelUtils.returnSheetData("/dataFiles/employee.xlsx", "Sheet1");
		

		String data=sht.getRow(0).getCell(0).toString();
		
		System.out.println(data);
		
		int row=sht.getLastRowNum();
		int col=sht.getRow(0).getLastCellNum()-1;
		
		String excelData[][]=new String[row+1][col+1];
		
		for(int i=0;i<=row;i++)
		{
			for(int j=0;j<=col;j++)
			{
				data=sht.getRow(i).getCell(j).toString();
				//System.out.print(data+"\t");
				excelData[i][j]=data;
			}
			System.out.println();
		}
		
		
		for(int i=0;i<=row;i++)
		{
			for(int j=0;j<=col;j++)
			{
				
				System.out.print(excelData[i][j]+"\t");
				
			}
			System.out.println();
		}
		
		
	}

}
