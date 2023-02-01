package patikaDev.thread;

public class Main {

	public static void main(String[] args) {
		// Thread 'ler iþ parçacýðý olarak düþünülebilir.
		// Program baþlatýldýðý zaman bir thread çalýþýr. Bu parça programý yukarýdan aþaðýya doðru okur.
			
		Counter c1 = new Counter();
		Counter c2 = new Counter();
		
		c1.start();
		c2.start();
		
	}

}




