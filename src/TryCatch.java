
public class TryCatch {

	public static void main(String[] args) {
		
		int x = 0;
		int y = 5;
		try{
			 int answer = y / x;
			 System.out.println(answer);
		}catch(ArithmeticException mathError){
			
			String errorMessage = mathError.getMessage();
			mathError.printStackTrace();
			if(errorMessage.equals("/ by zero")){
				System.out.println("error : " + errorMessage);
				}else{
				System.out.println();
				}
		}
		
		
	}
	
}
