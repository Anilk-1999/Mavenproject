package datadrivenTesting;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class writethedataintoexcel {

	public static void main(String[] args) throws IOException {
		
		XSSFWorkbook workbook=new XSSFWorkbook();
		XSSFSheet sheet=workbook.createSheet("emp info");
		
		Object empdata[][]= {
				{"Empid","empname","empjob"},
				{101,"Anil","jr.test eng"},
				{102,"Arun","ast.manager"},
				{103,"ashwini","teacher"},
				{104,"shivu","student"}
				};
			    int row= empdata.length;
				int cell=empdata[0].length;
				
	     		System.out.println(row);
		    	System.out.println(cell);

		    	for (int r = 0; r < row; r++) {
		    		
		    	XSSFRow	row1=sheet.createRow(r);
		    		
		    		
		    		for (int c = 0; c < cell; c++) {
						
					XSSFCell cell1=row1.createCell(c);
		    		
		    	 	Object value = empdata[r][c];
		    	 	
		    	 	
		    	 	if (value instanceof String)
		    	 		cell1.setCellValue((String)value);
		    		if (value instanceof Integer)
		    			cell1.setCellValue((Integer)value);
		    		if (value instanceof Boolean)
		    			cell1.setCellValue((Boolean)value);
		    		}
				}
		    	String path = "./Testdata/writing.xlsx";
		    FileOutputStream file=new FileOutputStream(path);
		    workbook.write(file);
		    file.close();
		    
		    
		    System.out.println("its successfully completed!!!");
 		    
		}
	}

