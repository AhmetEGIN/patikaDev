package patikaDev.printWriter;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Main {

	public static void main(String[] args) {
		String data = "JAVA102";
		
		try {
			PrintWriter printWriter = new PrintWriter("src/print.txt");
			printWriter.write(data);
			
			printWriter.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
