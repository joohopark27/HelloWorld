import javax.swing.JOptionPane;

public class jOptionPaneTest2 {

	public static void main(String[] args){
		
		Double number = Double.parseDouble(JOptionPane.showInputDialog(null, "What is 1 + 1?"));
		if ((number - 2) < .0000001 &&  (number - 2) > -.0000001){
			
			JOptionPane.showMessageDialog(null, "You are correct.");
			
		}else{
			
			JOptionPane.showMessageDialog(null, "You are WRONG!!!");
			
		}
		
	}
	
}
