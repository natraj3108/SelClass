package excel;

import java.io.File;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadExcel {
	
	@Test
	public void readExcel() throws InvalidFormatException, IOException{
		
		File src = new File("./data/login.xlsx");
		XSSFWorkbook wbook = new XSSFWorkbook(src);
		XSSFSheet sheet = wbook.getSheetAt(0);
		int rowCount = sheet.getLastRowNum();
		int columnCount = sheet.getRow(0).getLastCellNum();
		System.out.println(rowCount);
		System.out.println(columnCount);
		
		for (int i = 1; i <=rowCount; i++) {
			XSSFRow row = sheet.getRow(i);
			for (int j = 0; j < columnCount; j++) {
				XSSFCell cell = row.getCell(j);
				String cellData = cell.getStringCellValue();
				System.out.println(cellData);
			}
		}
		
		
		
		
		
		
		/*XSSFCell cell1 = row.getCell(1);
		String PWD1 = cell1.getStringCellValue();
		System.out.println(PWD1);
		*/
		
	}

}












