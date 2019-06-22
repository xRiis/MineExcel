package gmail.realriiscard.minexlsx.MineExcel;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MineExcel {
	
	public static void main(String[] args) throws IOException {
		
		JFrame frame = new JFrame();
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(Color.WHITE);
		frame.getContentPane().add(panel);
		
		JLabel title = new JLabel("MineExcel");
		title.setVerticalTextPosition(JLabel.BOTTOM);
		title.setHorizontalAlignment(JLabel.CENTER);
		panel.add(title);
		
		JButton commence = new JButton("Begin Process");
		panel.add(commence);
		commence.addActionListener(new ActionListener() {
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
		
		frame.setTitle("MineExcel");
		frame.setSize(new Dimension(1080, 720));
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.setVisible(true);
		
	}
	
}