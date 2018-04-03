import java.util.Random;

public class RandomNum {
	
	public static void main(String[] args){
		
		Random rnd = new Random();
		
		int RandomNum = rnd.nextInt(99);
		
		System.out.println(RandomNum);
		System.out.println(rnd.nextInt(50));
		System.out.println(rnd.nextInt(50));
		System.out.println(rnd.nextInt(50));
		System.out.println(rnd.nextInt(50));
		
	}

}
