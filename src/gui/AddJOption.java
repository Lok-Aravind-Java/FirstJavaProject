package gui;
import javax.swing.JOptionPane;
public class AddJOption {

	public static void main(String[] args) {

		String fn = JOptionPane.showInputDialog("Enter the first number");
		String sn = JOptionPane.showInputDialog("Enter the Second number");
		
		int num1 = Integer.parseInt(fn);
		int num2 = Integer.parseInt(sn);
		int sum = num1 + num2;
		
		JOptionPane.showMessageDialog(null, "The answer is " + sum , " The Title Bar", JOptionPane.PLAIN_MESSAGE);
		
		
	}

}
