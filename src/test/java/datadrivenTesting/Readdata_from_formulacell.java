package datadrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Readdata_from_formulacell {

	public static void main(String[] args) throws IOException {
		FileInputStream file= new FileInputStream("./Testdata/writing.xlsx");
        XSSFWorkbook workbook=new XSSFWorkbook(file);
	    XSSFSheet sheet = workbook.getSheet("emp info");
	    int row = sheet.getLastRowNum();
	   int cell = sheet.getRow(0).getLastCellNum();
	    
	    for (int r = 0; r < row; r++) {
			
	    	XSSFRow countrow = sheet.getRow(r);
	    	
	    	for (int c = 0; c < cell; c++) {
	    		XSSFCell countcell = countrow.getCell(c);
	    		
	    		
	    		switch(countcell.getCellType())
	    		{
	    		case STRING:
	    			System.out.print(countcell.getStringCellValue());
	    			break;
	    		case NUMERIC:
	    			System.out.print(countcell.getNumericCellValue());
	    		    break;
	    		case BOOLEAN:
	    			System.out.print(countcell.getBooleanCellValue());
	                break;
	                }
				System.out.print("|");
			}
	    	System.out.println("");
		}
	
	
	}
}
