package patikaDev.byteArrayInputStream;

import java.io.ByteArrayInputStream;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		
		byte[] dizi = {1,2,3,74,37,25,13,62,74,84,12};
		ByteArrayInputStream input = new ByteArrayInputStream(dizi, 2, 3);
		System.out.println("Kullanabilen byte sayýsý: " + input.available());
		int i = input.read();
		while (i != -1) {
			System.out.println(i);
			i = input.read();
		}
		
		try {
			input.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
