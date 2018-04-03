import java.util.Scanner;

public class Calculation {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args){
		
		double x;
		double y;
		
		System.out.println("Input your x value.");
		x = sc.nextDouble();
		System.out.println("Input your y value.");
		y = sc.nextDouble();
		
		double Addition = x + y;
		double Subtraction = x - y;
		double Multiplication = x * y;
		double Division = x / y;
		
		System.out.println("x + y is " + Addition);
		System.out.println("x subtracted by y is " + Subtraction);
		System.out.println("x times y is" + Multiplication);
		System.out.println("x divided by y is " + Division);
		
	}
	
}