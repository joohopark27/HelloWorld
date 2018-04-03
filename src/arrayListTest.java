import java.util.ArrayList;
import java.util.Scanner;

public class arrayListTest {
	
	static Scanner reader = new Scanner(System.in);
	static ArrayList<Integer> array = new ArrayList<Integer>();
	
	public static void main(String[] args) {
		
		System.out.println("Plese enter an array of numbers, type in 0 to finish");
		int in = reader.nextInt();
		
		while(in != 0){
			array.add(in);
			in = reader.nextInt();
		}
		
		printArray();
		
		System.out.println("What number do you want to delete?");
		int deleteNum = reader.nextInt();
		for (int i =0; i < array.size(); i++){
			if (array.get(i) == deleteNum){
				array.remove(i);
				break;
			}
		}
		
		printArray();
		
	}
	
	public static void printArray(){
		
		System.out.println("___________________");
		
		for (int i : array){
			System.out.println(i);
		}
		
		System.out.println("___________________");
		
	}
}
