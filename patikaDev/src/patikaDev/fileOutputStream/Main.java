package patikaDev.fileOutputStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Main {

	public static void main(String[] args) {
		String metin = "\nOutput stream dersi basladý. \nPatika Dev";
		
		 try {
			FileOutputStream output = new FileOutputStream("src/patika.txt", true);
			// Dosyanýn üzreine yazmak istiyorsak sona true eklememiz gerek. Aksi halde dosya içerisindeki her þeyi siler
			// eðer verdiðimiz dosya yoksa outputStream bu isimde bir dosya oluþturur
			byte[] metinBytes = metin.getBytes();
			output.write(metinBytes);
			
			output.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
		
	}

}
