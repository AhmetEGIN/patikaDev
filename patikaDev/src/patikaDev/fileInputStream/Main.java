package patikaDev.fileInputStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
	public static void main(String[] args) {
		try {
//			File dosya = new File("patika.txt");
			FileInputStream input = new FileInputStream("src/patika.txt");
			//inputStream'de read metodu bulunur. Bu metot byte byte okur.
			System.out.println("Kullan�labilir byte say�s�: " + input.available());
			input.skip(10);
			// belirli bir say�da karakter atlamak i�in skip
			int i = input.read();
			while (i != -1) {
				System.out.print((char)i);
				i = input.read();
			}
			
			System.out.println("\nKullan�labilir byte say�s�: " + input.available());
			input.close();
		} catch (FileNotFoundException e) {
			
			System.out.println(e.getMessage());
		}catch (IOException e) {
			System.out.println(e.getMessage());
		}
		
		
	}
}
