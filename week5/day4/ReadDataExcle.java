package week5.day4;

import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDataExcle {

	
	public static String[][] readData(String filedata) throws IOException {
		
		
		XSSFWorkbook wb= new XSSFWorkbook("./data/"+filedata+".xlsx");
		
		
		XSSFSheet sheet=wb.getSheetAt(0);
	
		
		
		int rowNum = sheet.getLastRowNum();
		
		System.out.println("number of rows :"+rowNum);
		
		
		int physicalNumberOfRows = sheet.getPhysicalNumberOfRows();
		
		System.out.println(physicalNumberOfRows);
		
		
		int cellNum = sheet.getRow(0).getLastCellNum();
		System.out.println("number of cells :"+cellNum);
		
		
		
		String[][] data= new String[rowNum][cellNum];
	for (int i = 1; i <=rowNum; i++) {
		XSSFRow row = sheet.getRow(i);
		 for (int j = 0; j <cellNum; j++) {
			String fulldata = row.getCell(j).getStringCellValue();
			
			data[i-1][j]=fulldata;
			
			
		}
	}
		
		
		
	wb.close();	
		
	return data;
		
		
	}
	
	
	
	
	
	
}
