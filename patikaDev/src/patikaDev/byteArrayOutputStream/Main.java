package patikaDev.byteArrayOutputStream;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		String metin = "Java 102 dersleri";
		
		ByteArrayOutputStream output = new ByteArrayOutputStream();
		byte[] bytes = metin.getBytes();
		try {
			output.write(bytes);
			String newData = output.toString();
			System.out.println(newData);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
