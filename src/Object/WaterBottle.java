package Object;

public class WaterBottle {
	public static void main(String[] args){
		
		ObjectIntro waterbottle = new ObjectIntro(0);
		
		waterbottle.fillWater(10);
		waterbottle.drinkWater(5);
		System.out.println("water in your water bottle is now " + waterbottle.getWater());
		
	}
}
