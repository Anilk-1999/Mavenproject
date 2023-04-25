package datadrivenTesting;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingExcel {

	public static void main(String[] args) throws IOException {
		
	FileInputStream file=new FileInputStream(System.getProperty("user.dir")+"/Testdata/course.xlsx");
	
	XSSFWorkbook workbook=new XSSFWorkbook(file);	
    
	XSSFSheet sheet = workbook.getSheet("Sheet1");	
              // (or) workbook.getSheet(0);
    
	int totalrow = sheet.getLastRowNum();
    
	int totalcell = sheet.getRow(1).getLastCellNum();
    
	System.out.println("number of rows  : "+ totalrow);
    
	System.out.println("number of cells : "+ totalcell);
    
    for (int r = 0; r <= totalrow; r++) {
    	
    	XSSFRow row = sheet.getRow(r);
		
    	for (int c = 0; c < totalcell; c++) {
          
    		String cell = row.getCell(c).toString();			
		 
           System.out.print(cell+"      ");
		
		}
		System.out.println();
	}
    
	}
	
	
}