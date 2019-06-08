package gmail.realriiscard.minexlsx.MineExcel;

import java.io.IOException;

public class MineExcel {
	
	public static void main(String[] args) throws IOException {
		
		WriteToFile file = new WriteToFile();
		file.setWritePath("D:\\function.mcfunction");
		
		ExcelRead sheet = new ExcelRead();
		sheet.setReadPath("D:\\file.xlsx");
		sheet.setColumn(0);
		
		ExcelRead.makeFile();
		
	}
	
}