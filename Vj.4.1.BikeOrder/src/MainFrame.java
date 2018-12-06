import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.Border;

public class MainFrame extends JFrame {
	
	JFrame fr;
	JPanel p1;
	JPanel p2;
	JTextArea txtF;
	




	JButton btt1;
	JComboBox<String> cBox;
	String[] lista = {"Cube 50", "Cube 40", "Cube 30", "Cube 20"};
	JList<String> ls;
	
	
	
	
	public MainFrame() {
		
		fr = new JFrame("Bike Order");
		p1 = new JPanel();
		p2=new JPanel();
		txtF = new JTextArea(10,20);
		btt1 = new JButton("OK");
		cBox= new JComboBox<>();
		Border brd=BorderFactory.createEmptyBorder(10,10,10,10);
		
		
		for(String e:lista) {
			
			cBox.addItem(e);
		}
		BorderLayout bl=new BorderLayout();
		
		GridBagLayout gb= new GridBagLayout();
		
		GridBagConstraints cons=new GridBagConstraints();
		
		p1.setBorder(brd);
		//p2.setBorder(brd);
		fr.setVisible(true);
		fr.setSize(800, 400);
	
		p1.setLayout(bl);
		
		p2.setLayout(gb);
		
		
		
		
		
		
		/*//Pozicija txt area
		
		cons.gridx=0;
		cons.gridy=0;
		
		cons.gridheight=1;
		cons.gridwidth=10;
		cons.weightx=1.0;
		cons.weighty=1.0;
		cons.fill=cons.BOTH;
		//cons.anchor=cons.CENTER;
		
		
		gb.setConstraints(txtF, cons);*/
		
		//Pozicija Combo
		
		cons.gridx=0;
		cons.gridy=1;
		cons.gridheight=1;
		cons.gridwidth=4;
		cons.weightx=1.0;
		cons.weighty=1.0;
		//cons.fill=cons.BOTH;
		cons.anchor=cons.CENTER;
		
		gb.setConstraints(cBox, cons);
		
		//Pozicija botuna
		
		cons.gridx=0;
		cons.gridy=0;
		cons.gridheight=1;
		cons.gridwidth=4;
		cons.weightx=1.0;
		cons.weighty=1.0;
		//cons.fill=cons.BOTH;
		cons.anchor=cons.CENTER;
		
		gb.setConstraints(btt1, cons);
		
		p2.add(cBox);
		p2.add(btt1);
		
		p1.add("East",txtF);
		p1.add("West",p2);
		
		fr.add(p1);
		
		
		
		
		//txtF.add(ls);
		
		OrderEx ord=new OrderEx();
		btt1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try {
				String value= cBox.getItemAt(cBox.getSelectedIndex());
				
				//ls.(value);
				ord.addItem(value,txtF);
				txtF.append(value+"\n");
				}catch (Exception er) {
					
				}
			}
		});
		
		
		//p2.add(lbl);
		
		fr.setDefaultCloseOperation(fr.EXIT_ON_CLOSE);
		
		
		
	}

}
