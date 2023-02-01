package patikaDev.runnableInterface;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Counter c1 = new Counter("c1");
		Counter c2 = new Counter("c2");
		Counter c3 = new Counter("c3");
		
		Thread t1 = new Thread(c1);
		Thread t2 = new Thread(c2);
		Thread t3 = new Thread(c3);
//		t1.start();
//		t2.start();
//		t3.start();
		
		
		Thread t10 = new Thread(new Counter2("c10",1));
		Thread t11 = new Thread(new Counter2("c11",2));
		Thread t12 = new Thread(new Counter2("c12",3));
		
		t10.start();
		t11.start();
		t12.start();
		
	}

}
