package Object;

public class ObjectIntro {
	
	int tWater = 0;
	
	public ObjectIntro(){
		
	}
	public ObjectIntro(int waterAmount){
		tWater = waterAmount;
	}
	public void fillWater(int amount){
		tWater = tWater + amount;
	}
	public void drinkWater(int amount){
		tWater = tWater - amount;
	}
	public int getWater(){
		return tWater;
	}
	
}
