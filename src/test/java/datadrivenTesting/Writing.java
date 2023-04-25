package datadrivenTesting;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Writing {
  public static void main(String[] args) throws IOException {
	
		FileOutputStream file=new FileOutputStream(System.getProperty("user.dir")+"/Testdata/dude.xlsx");
      XSSFWorkbook workbook=new XSSFWorkbook();
     XSSFSheet sheet=workbook.createSheet();
//     XSSFRow row=sheet.createRow(0);
//     
//     row.createCell(0).setCellValue("Anil kumar");
//     XSSFRow row1=sheet.createRow(1);
//     row1.createCell(0).setCellValue("nagaraj");
//     XSSFRow row2=sheet.createRow(2);
//     row2.createCell(0).setCellValue("Arun kumar");
//     XSSFRow row3=sheet.createRow(3);
//     row3.createCell(0).setCellValue("Dilip sahukar");
//     XSSFRow row4=sheet.createRow(4);
//     row4.createCell(0).setCellValue("Shruthi");
//     XSSFRow row5=sheet.createRow(5);
//     row5.createCell(0).setCellValue("Nisarga");
// //-------------------------------------------------
//     row.createCell(1).setCellValue("Manual tester");
//     
//     row1.createCell(1).setCellValue("Automation tester");
//     
//     row2.createCell(1).setCellValue("sr.software tester");
//   
//     row3.createCell(1).setCellValue("sr.software tester");
//     
//     row4.createCell(1).setCellValue("sr.Api tester");
//    
//     row5.createCell(1).setCellValue("sr.Tester");
     Scanner sc=new Scanner(System.in);
     
     for (int r = 0; r <=2; r++) {
    	 
    	 XSSFRow row = sheet.createRow(r);
    	 
    	 for (int c = 0; c <2; c++) {
    		 String value = sc.next();
    		 System.out.println("Enter some data :");
		row.createCell(c).setCellValue(value);	
		 System.out.println("data created !!!");
		}
		
	}
    
     workbook.write(file);
     workbook.close();
     file.close();
     
  }
}
