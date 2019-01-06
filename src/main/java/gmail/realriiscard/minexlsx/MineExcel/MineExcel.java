package gmail.realriiscard.minexlsx.MineExcel;

import java.io.IOException;

public class MineExcel {
	
	public static void main(String[] args) throws IOException {
		
		ExcelRead sheet = new ExcelRead();
		sheet.setFilePath("D:\\file.xlsx");
		sheet.setColumn(0);
		
		ExcelRead.makeFile();
		
	}
	
}