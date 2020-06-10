import javax.swing.JOptionPane;

public class smallestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = Integer.parseInt(JOptionPane.showInputDialog("Enter a number", "0"));
		int num2 = Integer.parseInt(JOptionPane.showInputDialog("Enter another number", "0"));
		int num3 = Integer.parseInt(JOptionPane.showInputDialog("Enter another number", "0"));
		
		int small = Math.min(num1, num2);
		small = Math.min(small, num3);
		
		System.out.println("The smallest: " + small);
	}

}
