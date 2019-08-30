package gmail.realriiscard.minexlsx.MineExcel;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MineExcel {
	
	public static void main(String[] args) throws IOException {
		
        JFrame frame = new JFrame("MineExcel");
        
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
 
        JLabel label = new JLabel("MineExcel");
 
        JButton button = new JButton();
        button.setText("Begin Process");
        
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				WriteToFile file = new WriteToFile();
				file.setWritePath("D:\\function.mcfunction");
				
				ExcelRead sheet = new ExcelRead();
				sheet.setReadPath("D:\\file.xlsx");
				sheet.setColumn(0);
				
				try {
					
					ExcelRead.makeFile();
					
				} catch (IOException e1) {
					
					e1.printStackTrace();
					
				}
				
			}

		});
 
        panel.add(label);
        panel.add(button);
 
        frame.add(panel);
        frame.setSize(1080, 720);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);	
		
	}
	
}