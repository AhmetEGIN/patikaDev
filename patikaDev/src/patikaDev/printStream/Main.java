package patikaDev.printStream;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class Main {

	public static void main(String[] args) {
		
//		Java.io paketinin PrintStream s�n�f�, ��kt� verilerini bayt yerine yayg�n olarak okunabilir bi�imde (metin) yazmak i�in kullan�labilir.
		// T�m verileri String veri tipinde aktarmam�z� sa�lar
//		Di�er ��kt� ak��lar�ndan farkl� olarak, PrintStream ilkel verileri (tamsay�, karakter) bayt yerine metin bi�imine d�n��t�r�r.
//		Daha sonra bu bi�imlendirilmi� verileri ��kt� ak���na yazar.
		
		try {
			PrintStream output = new PrintStream("src/print.txt");
			output.print(123);
			
			
			output.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
