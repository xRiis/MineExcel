package gmail.realriiscard.minexlsx.MineExcel;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.filechooser.FileNameExtensionFilter;

public class MineExcel {
	
	protected static String readpath = null;

	public static void main(String[] args) throws IOException {
		
        JFrame frame = new JFrame("MineExcel");
        
        GridBagLayout layout = new GridBagLayout();
        JPanel panel = new JPanel();
        panel.setLayout(layout);
 
        JLabel label = new JLabel("MineExcel",JLabel.CENTER);
        
        GridBagConstraints constraints = new GridBagConstraints();
 
        JButton select = new JButton("Select File");
        JButton begin = new JButton("Begin Process");
        
		select.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			  
		        JFileChooser chooser = new JFileChooser();
		        FileNameExtensionFilter filter = new FileNameExtensionFilter("Microsoft Excel Spreadsheets", "xlsx", "xlsm");
		        chooser.setFileFilter(filter);
		        int returnVal = chooser.showOpenDialog(null);
		        System.out.println("JFileChooser opened");
		        
		        if(returnVal == JFileChooser.APPROVE_OPTION) {
		        	
		        	readpath = chooser.getSelectedFile().getAbsolutePath();
		            System.out.println("Selected file: " + readpath);
		            
		        }
				
			}
			
			
		});
        
		begin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				WriteToFile file = new WriteToFile();
				file.setWritePath("C:\\function.mcfunction");
				
				ExcelRead sheet = new ExcelRead();
				sheet.setReadPath(readpath);
				sheet.setColumn(0);
				
				try {
					
					ExcelRead.makeFile();
					
				} catch (IOException e1) {
					
					e1.printStackTrace();
					
				}
				
			}

		});
		
		constraints.fill = GridBagConstraints.HORIZONTAL;
		constraints.gridx = 0;
		constraints.gridy = 0;
        panel.add(label, constraints);
        
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.gridx = 0;
        constraints.gridy = 1;
        panel.add(select, constraints);
        
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.gridx = 0;
        constraints.gridy = 2;
        panel.add(begin, constraints);
 
        frame.add(panel);
        frame.setSize(720, 360);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);	
		
	}
	
}