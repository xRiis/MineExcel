package gmail.realriiscard.minexlsx.MineExcel;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.filechooser.FileNameExtensionFilter;

public class MineExcel {
	
	protected static String readpath = null;
	protected static String writepath = null;

	public static void main(String[] args) throws IOException {
		
        JFrame frame = new JFrame("MineExcel");
        
        GridBagLayout layout = new GridBagLayout();
        JPanel panel = new JPanel();
        panel.setLayout(layout);
        
        String[] columnlist = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
        final JComboBox selectcolumn = new JComboBox(columnlist);

        JLabel label = new JLabel("MineExcel",JLabel.CENTER);
        
        GridBagConstraints constraints = new GridBagConstraints();
 
        JButton selectfile = new JButton("Select Spreadsheet");
        JLabel columnlabel = new JLabel("Select Read Column A-Z:");
        JButton selectpath = new JButton("Select Output");
        JButton begin = new JButton("Begin Process");
        
        selectcolumn.setSelectedIndex(0);
        
		selectfile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			  
		        JFileChooser chooser = new JFileChooser();
		        FileNameExtensionFilter filter = new FileNameExtensionFilter("Microsoft Excel Spreadsheet (.xlsx, .xlsm)", "xlsx", "xlsm");
		        chooser.setFileFilter(filter);
		        int returnVal = chooser.showOpenDialog(null);
		        System.out.println("JFileChooser opened");
		        
		        if(returnVal == JFileChooser.APPROVE_OPTION) {
		        	
		        	readpath = chooser.getSelectedFile().getAbsolutePath();
		            System.out.println("Selected file: " + readpath);
		            
		        }
				
			}
			
			
		});
		
		selectpath.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				JFileChooser chooser = new JFileChooser();
				FileNameExtensionFilter filter = new FileNameExtensionFilter("Minecraft Function File (.mcfunction)", "mcfunction");
				chooser.setFileFilter(filter);
				int returnVal = chooser.showOpenDialog(null);
				System.out.println("JFileChooser opened");
				
				if(returnVal == JFileChooser.APPROVE_OPTION) {
					
					writepath = chooser.getSelectedFile().getAbsolutePath();
					System.out.println("Determined write path: " + writepath);
					
				}
				
			}
			
		});
        
		begin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				WriteToFile file = new WriteToFile();
				file.setWritePath(writepath);
				
				ExcelRead sheet = new ExcelRead();
				sheet.setReadPath(readpath);
				sheet.setColumn(selectcolumn.getSelectedIndex());
				System.out.println("Reading from column " + selectcolumn.getSelectedIndex());
				
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
        panel.add(selectfile, constraints);
        
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.gridx = 0;
        constraints.gridy = 2;
        panel.add(columnlabel, constraints);
        
        constraints.fill = GridBagConstraints.LINE_END;
        constraints.gridx = 1;
        constraints.gridy = 2;
        panel.add(selectcolumn, constraints);        
        
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.gridx = 0;
        constraints.gridy = 3;
        panel.add(selectpath, constraints);
        
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.gridx = 0;
        constraints.gridy = 4;
        panel.add(begin, constraints);
 
        frame.add(panel);
        frame.setSize(720, 360);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);	
		
	}
	
}