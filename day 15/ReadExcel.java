package week4.day3;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {
	//public static void main(String[] args) throws IOException {
		
	//To add the excel data
	public static String[][] readData(String filename) throws IOException{
		
		//Open the Workbook
		XSSFWorkbook wb = new XSSFWorkbook("./Data/CreateLead.xlsx");
		//Open the WorkSheet
		XSSFSheet ws = wb.getSheet("Sheet1");
		
		//To count the number of rows -without header
		int rowCount = ws.getLastRowNum();
		System.out.println("Row Count: "+rowCount);
		
		//To count the number of rows -with header
		int rowCount1= ws.getPhysicalNumberOfRows();
		System.out.println("Row Count with Header: "+rowCount1);
		
		//To count the number of columns
		int columnCount =ws.getRow(1).getLastCellNum();
		System.out.println("Column Count: "+columnCount);
		
		//To retrieve a particular value in a cell
		String data1 = ws.getRow(1).getCell(1).getStringCellValue();
		System.out.println(data1);
		
	/*	//To retrieve the entire data
		for (int i=1; i<=rowCount; i++) {
			XSSFRow row = ws.getRow(i);
			for (int j=0; j<columnCount; j++) {
				String allData = row.getCell(j).getStringCellValue();
				System.out.println(allData);
				
			}
		}*/
		
	      //To retrieve a entire data
		
				//Declare 2D String Array
				String[][] data=new String[rowCount][columnCount];
				
				for (int i = 1; i <= rowCount; i++) {
					XSSFRow row = ws.getRow(i);
					for (int j = 0; j < columnCount; j++) {
						String allData = row.getCell(j).getStringCellValue();
						                   
						data[i-1][j]=allData;
					//  data[0][0]  ="TestLeaf" 
					//  data[0] [1] ="Hari"	
					//   data[0][2] ="R"	
			
				}
					
		}
				wb.close();
			
				return data;

					
				
		
	}

}
