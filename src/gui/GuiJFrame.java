package gui;

import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JFrame;

public class GuiJFrame extends JFrame{

	 private JLabel item1 ;
	
	public GuiJFrame (){
		
		super (" the title bar ");
		setLayout(new FlowLayout());
		
	    item1 = new JLabel("This is a sentence");
	   item1.setToolTipText("This is when you hover over");
	add(item1);
	}
	
	
}
