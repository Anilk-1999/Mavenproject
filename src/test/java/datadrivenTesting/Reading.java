package datadrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Reading {

	public static void main(String[] args) throws IOException {
		
		FileInputStream file=new FileInputStream(System.getProperty("user.dir")+"/Testdata/myfile.xlsx");
	    XSSFWorkbook workbook=new XSSFWorkbook(file);
	    XSSFSheet sheet=workbook.getSheet("Sheet0");
	    int countrow=sheet.getLastRowNum();
	    int countcell=sheet.getRow(0).getLastCellNum();
	    System.out.println("count total number of rows : "+countrow);
	    System.out.println("count total number of column : "+countcell);
	    
	    
	    
	    for (int r = 0; r <= countrow; r++) {
			
	    	XSSFRow row=sheet.getRow(r);
	    	
	    	for (int c = 0; c < countcell; c++) {
			  
	    	String value = row.getCell(c).toString();
	    	System.out.print(value+"   ");
			}
	    	 System.out.println("");
		}
	    
	   
	}
	
}
