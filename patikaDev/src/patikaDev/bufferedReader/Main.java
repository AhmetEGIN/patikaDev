package patikaDev.bufferedReader;

import java.io.BufferedReader;
import java.io.FileReader;

public class Main {

	public static void main(String[] args) {
		String data = "Orta SEVÝYE JAVA ÖÐRENÝYORUM";

		try {
			FileReader fileReader = new FileReader("src/print.txt");
			BufferedReader bufferedReader = new BufferedReader(fileReader);
//			String line = bufferedReader.readLine();
//			while (line != null) {
//				System.out.println(line);
//				line = bufferedReader.readLine();	
//			}
			String line;
			while ((line = bufferedReader.readLine()) != null) {
				System.out.println(line + "**");
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
