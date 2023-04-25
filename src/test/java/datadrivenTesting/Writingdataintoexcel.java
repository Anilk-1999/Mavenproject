package datadrivenTesting;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Writingdataintoexcel 
{
public static void main(String[] args) throws IOException {
	
	FileOutputStream file=new FileOutputStream(System.getProperty("user.dir")+"/Testdata/myfile.xlsx");
	
	XSSFWorkbook workbook=new XSSFWorkbook();
	
	XSSFSheet sheet=workbook.createSheet();
	
	
	//this is create data without using loops
	/*
	XSSFRow row = sheet.createRow(0);
	
	row.createCell(0).setCellValue("12345");
	row.createCell(1).setCellValue("ABCDE");
	
	XSSFRow row1 = sheet.createRow(1);
	row1.createCell(0).setCellValue("67890");
	row1.createCell(1).setCellValue("FGHIJ");

	
	*/
	
// this is create the data with using loops
	
	Scanner sc=new Scanner(System.in);
	
	for (int r = 0; r <=5; r++) {
		
		 XSSFRow row = sheet.createRow(r);	
		 
		for (int c = 0; c < 5; c++) {
		//row.createCell(c).setCellValue("Anil");	----> create same data in all rows and column
		
			System.err.println("Enter a value : ");
			String value = sc.next();
			row.createCell(c).setCellValue(value);
		
		}
	}
	System.out.println("Datas are created!!!");
	workbook.write(file);
	workbook.close();
	file.close();
	
}
}
