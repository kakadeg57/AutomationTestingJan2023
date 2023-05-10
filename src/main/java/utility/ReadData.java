package utility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadData 
{

	static XSSFWorkbook  workbook;
	
	public static String [][] testData()
	{
		// we need to read excel
			try
			{
				FileInputStream file = new FileInputStream("C:\\Users\\Lenovo\\eclipse-workspace\\AutomationTestingJanuary23\\TestData\\ContactData.xlsx");
				// MS Excel file
				workbook = new XSSFWorkbook(file);
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			// need to move into sheet
			
			XSSFSheet sheet = workbook.getSheet("ContactData");
				int rows = sheet.getLastRowNum();
				
				System.out.println(rows);
				
				int column = sheet.getRow(0).getLastCellNum();
				System.out.println(column);
				
				String data[][] = new String[rows][column];
				
				
				for(int i=0;i<rows;i++) // outer for loop will handle rows
				{
					
					for(int j=0;j<column;j++) // inter for loop will handle column/cell data
					{
						data[i][j] = sheet.getRow(i+1).getCell(j).toString();
					}
					
				}
				
			return data;	
	}
	
	

}
