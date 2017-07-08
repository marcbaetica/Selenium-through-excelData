package xssfData;

//dependencies: poi-ooxml-3.15.jar and others (see lib)
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataProvider {

	public static void main (String[] args) {
		
		XSSFWorkbook excelWBook;
		XSSFSheet excelWSheet;
		XSSFCell excelCell;
		String cellData;
		
		String path = "D://Projects//Programming//Selenium-through-excelData//downloads//Book1.xlsx";
		String sheetName = "Sheet1";
		
		try {
			
			FileInputStream excelFile = new FileInputStream(path);
			excelWBook = new XSSFWorkbook(excelFile);
			excelWSheet = excelWBook.getSheet(sheetName);
			
			for (int i=0; i<=1; i++) {
				for (int x=0; x<=1; x++) {
						
					excelCell = excelWSheet.getRow(i).getCell(x);
					cellData = excelCell.getStringCellValue();

					System.out.println("Excell cell " + excelCell + " has cell data: " + cellData);
				}
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
		
	
}
