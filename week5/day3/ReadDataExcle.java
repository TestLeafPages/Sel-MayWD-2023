package week5.day3;

import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDataExcle {

	/*
	 * step 1-----XSSFWorkBook
     step2------XSSFWoekSheet 
   Step 3-----XSSFRow 
 step 4-----XSSFCell
	 * 
	 * 
	 */
	
	//step-4
	//static keywords-it remain same 
	public static String[][] readData() throws IOException {
		
		//set path workbok
		XSSFWorkbook wb= new XSSFWorkbook("./data/CreateLead.xlsx");
		
		//go to sheet
		//index start with '0'
		XSSFSheet sheet=wb.getSheetAt(0);
		//XSSFSheet sh=wb.getSheet("sheet1");
		
		//read row count
		int rowNum = sheet.getLastRowNum();
		
		System.out.println("number of rows :"+rowNum);
		
		//to  get all rows
		int physicalNumberOfRows = sheet.getPhysicalNumberOfRows();
		
		System.out.println(physicalNumberOfRows);
		
		//count cell values
		int cellNum = sheet.getRow(0).getLastCellNum();
		System.out.println("number of cells :"+cellNum);
		//header path index getrow(0)- header data
		//String printdata = sheet.getRow(1).getCell(2).getStringCellValue();
		
		//System.out.println(printdata);
		
		// intergation with tc
		//3,4
		//step1
		String[][] data= new String[rowNum][cellNum];
	for (int i = 1; i <=rowNum; i++) {
		XSSFRow row = sheet.getRow(i);
		 for (int j = 0; j <cellNum; j++) {
			String fulldata = row.getCell(j).getStringCellValue();
			//System.out.println(fulldata);
			
			//step2
			data[i-1][j]=fulldata;
			//d[0][0]=testleaf
			//d[0][1]=dilip
			
			//d[1][0]=
			
		}
	}
		
		
		
	wb.close();	
		//step-3
	return data;
		
		
	}
	
	
	
	
	
	
}
