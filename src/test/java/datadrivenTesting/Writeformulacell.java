package datadrivenTesting;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Writeformulacell {

	public static void main(String[] args) throws IOException {
	
		XSSFWorkbook workbook=new XSSFWorkbook();
		
		XSSFSheet sheet = workbook.createSheet();
		XSSFRow rows = sheet.createRow(0);
		
		rows.createCell(0).setCellValue(100);
		rows.createCell(1).setCellValue(200);
		rows.createCell(2).setCellValue(300);
		rows.createCell(3).setCellFormula("A1*B1*C1");
		
		FileOutputStream file=new FileOutputStream("./Testdata/cal.xlsx");
		workbook.write(file);
		file.close();
		System.out.println("hello bross i am formulacell");
}
}
