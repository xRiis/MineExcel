package gmail.realriiscard.minexlsx.MineExcel;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {
	
	private static String readpath = "";
	private static int column = 0;
	
	static WriteToFile item = new WriteToFile();
	
	public void setReadPath(String string) {
		
		ExcelRead.readpath = string;
		
	}
	
	public void setColumn(int num) {
		
		ExcelRead.column = num;
		
	}
	
	public static void makeFile() throws IOException {
		
		System.out.println("Started reading from spreadsheet!");
		
		String excelFilePath = readpath;
		FileInputStream inputStream = new FileInputStream(new File(excelFilePath));
		
		Workbook workbook = new XSSFWorkbook(inputStream);
		Sheet firstSheet = workbook.getSheetAt(0);
		Iterator<Row> iterator = firstSheet.iterator();
		
		while (iterator.hasNext()) {
			
			Row row = iterator.next();
			Iterator<Cell> cellIterator = row.cellIterator();
			
			while (cellIterator.hasNext()) {
				
				Cell cell = cellIterator.next();
				
				if (cell.getColumnIndex() == column) {
					
					//Write to file
					item.addCommand(cell.getStringCellValue());
					
					System.out.print("Cell value: " + cell.getStringCellValue());
					break;
					
				}
				
			}
			
			System.out.println();
			
		}
		
		workbook.close();
		inputStream.close();
		
		System.out.println("Done reading from spreadsheet!");
		
		WriteToFile.produceFile();
		
	}

}
