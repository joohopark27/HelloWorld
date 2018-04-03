import javax.swing.JOptionPane;

public class jOptionPaneTest1 {

	public static void main(String[] args){
		
		String fingers = JOptionPane.showInputDialog("how many fingers do you have?");
		JOptionPane.showMessageDialog(null, "you have " + fingers +" fingers");
		
	}
	
}
