package gmail.realriiscard.minexlsx.MineExcel;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class WriteToFile {
	
	static ArrayList<String> commands = new ArrayList<String>();
	
	public void addCommand(String string) {
		
		String comline = string.replace("/", "");
		
		commands.add(comline);
		
	}
	
	public static void produceFile() {
		
		try {
			
			System.out.println("Beginning file production!");
			
			File file = new File("function.mcfunction");
			FileWriter fileWriter = new FileWriter(file);
			PrintWriter printWriter = new PrintWriter(fileWriter);
			
			for (int i = 0; i < commands.size(); i++) {
				
				printWriter.println(commands.get(i));
				
			}
			
			fileWriter.flush();
			fileWriter.close();
			
			System.out.println("FileWriter closed!");
		
		} catch (IOException e) {
			
			e.printStackTrace();
			
		}
		
	}

}
