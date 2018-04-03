import java.io.BufferedReader;
import java.io.FileReader;

public class readingText {

	public static void main(String[] args) throws Exception {
		
		FileReader file = new FileReader("C:/Users/JoohoPark/Java/ReadingTextWithJavaTest.txt");
		BufferedReader reader = new BufferedReader(file);
		
		String text = "";
		String line = reader.readLine();
		
		while (line != null){
			text += line;
			System.out.println(line);
			line = reader.readLine();
		}
		
		System.out.println(text);
		reader.close();
	}
	
}
