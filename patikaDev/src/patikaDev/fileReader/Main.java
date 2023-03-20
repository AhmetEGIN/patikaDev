package patikaDev.fileReader;

import java.io.FileReader;
import java.io.FileWriter;

public class Main {

	public static void main(String[] args) {
		// Daha �nceki derslerde yapt���m�z �eyleri bu class ile daha kolayca
		// yapabiliriz

		String data = "Orta seviye JAVA DERS� ��REN�YORUM";
		try {
			FileReader readFile = new FileReader("src/patika.txt");

//			int i = readFile.read();
//
//			while (i != -1) {
//				System.out.print((char) i);
//				i = readFile.read();
//			}
			FileWriter fileWriter = new FileWriter("src/print.txt");
			fileWriter.write(data);
			
			fileWriter.close();
			readFile.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
