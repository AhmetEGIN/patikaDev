package patikaDev.fileOutputStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Main {

	public static void main(String[] args) {
		String metin = "\nOutput stream dersi baslad�. \nPatika Dev";
		
		 try {
			FileOutputStream output = new FileOutputStream("src/patika.txt", true);
			// Dosyan�n �zreine yazmak istiyorsak sona true eklememiz gerek. Aksi halde dosya i�erisindeki her �eyi siler
			// e�er verdi�imiz dosya yoksa outputStream bu isimde bir dosya olu�turur
			byte[] metinBytes = metin.getBytes();
			output.write(metinBytes);
			
			output.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
		
	}

}
