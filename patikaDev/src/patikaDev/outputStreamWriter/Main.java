package patikaDev.outputStreamWriter;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) {
//		Java.io paketinin Writer s�n�f�, bir karakter ak���n� temsil eden soyut bir �st s�n�ft�r.
//		Java.io paketinin OutputStreamWriter s�n�f�, karakter bi�imindeki verileri bayt bi�imindeki verilere d�n��t�rmek i�in kullan�labilir. 
//		Writer soyut s�n�f�n� geni�letir.
//		�rne�in T�rk�e karakterler girerken normalde s�k�nt� ��k�yordu. OutputStreamWriter sayesinde bu sorun ortadan kalkacakt�r
		
		String data = "������";
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
