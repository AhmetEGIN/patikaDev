package patikaDev.inputStreamReader;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {
//		Java.io paketinin Reader s�n�f�, bir karakter ak���n� (Characters Stream) temsil eden soyut bir �st s�n�ft�r.
//		Java.io paketinin InputStreamReader s�n�f�, bayt cinsinden verileri karakter cinsinden verilere d�n��t�rmek i�in kullan�labilir. 
//		Soyut Reader s�n�f�n� geni�letir.
//		nputStreamReader s�n�f�, di�er giri� ak��lar�yla (Input Streams) �al���r. 
//		Bayt ak��lar� ve karakter ak��lar� aras�nda bir k�pr� olarak da bilinir.
//		Bunun nedeni, InputStreamReader'�n giri� ak���ndaki baytlar� karakter olarak okumas�d�r.
//		�rne�in, baz� karakterlerin depoda depolanmas� i�in 2 bayt gerekiyordu. 
//		Bu t�r verileri okumak i�in, 2 bayt� birlikte okuyan ve kar��l�k gelen karaktere d�n��t�rmek i�in InputStreamReader s�n�f�n� kullanabiliriz.
		
		
		// Byte oldu�u i�in ve farkl� bir charset belirleyemedi�imiz i�in �rne�in �,�,�,� gibi T�rk�e karakterler okunmuyor
		try {
			FileInputStream fileInput = new FileInputStream("src/patika.txt");
			InputStreamReader inputReader = new InputStreamReader(fileInput);
//			System.out.println(inputReader.ge);
			int i = inputReader.read();
			while (i != -1) {
				System.out.print((char) i);
				i = inputReader	.read();
			}
			
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}

}
