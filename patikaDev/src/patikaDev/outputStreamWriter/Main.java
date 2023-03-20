package patikaDev.outputStreamWriter;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) {
//		Java.io paketinin Writer sýnýfý, bir karakter akýþýný temsil eden soyut bir üst sýnýftýr.
//		Java.io paketinin OutputStreamWriter sýnýfý, karakter biçimindeki verileri bayt biçimindeki verilere dönüþtürmek için kullanýlabilir. 
//		Writer soyut sýnýfýný geniþletir.
//		Örneðin Türkçe karakterler girerken normalde sýkýntý çýkýyordu. OutputStreamWriter sayesinde bu sorun ortadan kalkacaktýr
		
		String data = "ÐÜÞýÇÖ";
		try {
			FileOutputStream fileOutput = new FileOutputStream("src/patika.txt");
			OutputStreamWriter streamWriter = new OutputStreamWriter(fileOutput);
			streamWriter.write(data);
			streamWriter.close();
		
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
	}

}
