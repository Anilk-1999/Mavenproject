package datadrivenTesting;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Create_and_writeformatecell {
	
public static void main(String[] args) throws IOException {
	
	String path="./Testdata/books.xlsx";

	FileInputStream file= new FileInputStream(path);
	
	XSSFWorkbook workbook=new XSSFWorkbook(file);
	
	XSSFSheet sheet=workbook.getSheet("Sheet1");
	
	sheet.getRow(9).getCell(2).setCellFormula("SUM(C2:C8)");
	
	file.close();
	
	FileOutputStream files=new FileOutputStream(path);
	
	workbook.write(files);
	
	workbook.close();

	System.out.println("formulate!!!....");
}
}
