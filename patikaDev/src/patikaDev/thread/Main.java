package patikaDev.thread;

public class Main {

	public static void main(String[] args) {
		// Thread 'ler i� par�ac��� olarak d���n�lebilir.
		// Program ba�lat�ld��� zaman bir thread �al���r. Bu par�a program� yukar�dan a�a��ya do�ru okur.
			
		Counter c1 = new Counter();
		Counter c2 = new Counter();
		
		c1.start();
		c2.start();
		
	}

}




