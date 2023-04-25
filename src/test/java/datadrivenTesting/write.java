package datadrivenTesting;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class write {

	
	public static void main(String[] args) throws IOException {
		
		XSSFWorkbook workbook=new XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet();
		
		Object studentdata[][]= {
				{"student id","name","class","grade","fee's"},
				{1,"anil","10th","A",10000},
				{2,"nagaraj","10th","A+",20000},
				{3,"arun","10th","A++",30000},
				{4,"dilip","10th","A+++",40000}
		        
		};
		
		int rowlen = studentdata.length;
		int celllen = studentdata[0].length;
		
		
		for (int r = 0; r <rowlen; r++) {
			XSSFRow row=sheet.createRow(r);
			
			for (int c = 0; c <celllen ; c++) {
			XSSFCell cell=row.createCell(c);
			
			Object value = studentdata[r][c];
			
			if (value instanceof String)
				cell.setCellValue((String)value);
			
			if (value instanceof Integer)
				cell.setCellValue((Integer)value);	
			
			if (value instanceof Boolean)
				cell.setCellValue((Boolean)value);
			
			
			} }
		String path = "./Testdata/write.xlsx";
		FileOutputStream file=new FileOutputStream(path);
		workbook.write(file);
		file.close();
		System.out.println("hello boss its finished !!!...........");
	}
	
}
