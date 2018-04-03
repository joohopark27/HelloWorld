
public class switchTest {
		
	public static void main(String[] args) {
		
		int number = 0;
		String num = "";
		
		switch(number){
		case 0: num = "zero";
				break;
		case 1: num = "one";
				break;
		case 2: num = "two";
				break;
		case 3: num = "three";
				break;
		default: num = "the number isn't between 0~3";

		}
		
		System.out.println(num);
		
	}
	
}
