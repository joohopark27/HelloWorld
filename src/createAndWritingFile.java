import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class createAndWritingFile {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		File newFile = new File("C:/Users/JoohoPark/Java/ReadingTextWithJavaTest.txt");
		
		if(newFile.exists()){
			System.out.println("The file exists.");
		}else{
			try{
				newFile.createNewFile();
			}catch (Exception e){
				e.printStackTrace();
			}
		}
		
		try{
			FileWriter fileW = new FileWriter(newFile);
			BufferedWriter buffW = new BufferedWriter(fileW);
			System.out.println("Type what you want to write on the text.");
			String input = sc.nextLine();
			buffW.write(input);
			buffW.close();
		}catch(Exception e){
			e.printStackTrace();
		}
		
	sc.close();
	}
	
}
