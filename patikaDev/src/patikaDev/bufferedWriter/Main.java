package patikaDev.bufferedWriter;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class Main {

	public static void main(String[] args) {
		String data = "JAVAÖÐRENÝYORUM";
		try {
			FileWriter fileWriter = new FileWriter("src/print.txt");
			BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
			bufferedWriter.write(data);
			
			
			bufferedWriter.close();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
