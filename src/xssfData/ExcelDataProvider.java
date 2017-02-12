package xssfData;

//dependencies: poi-ooxml-3.15.jar
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataProvider {

	public static void main (String[] args) {
		
		XSSFWorkbook excelWBook;
		XSSFSheet excelWSheet;
		XSSFCell excelCell;
		
		String path = "src/xssfData/Book1.xlsx";
		String sheetName = "Sheet1";
		
		try {
			
			FileInputStream excelFile = new FileInputStream(path);
			excelWBook = new XSSFWorkbook(excelFile);
			excelWSheet = excelWBook.getSheet(sheetName);
			
			excelCell = excelWSheet.getRow(1).getCell(0);
			
			String cellData = excelCell.getStringCellValue();
			
			System.out.println("Excell cell: " + excelCell + " while the cell data is: " + cellData);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
		
	
}
