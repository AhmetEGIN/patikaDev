package patikaDev.ordermatik;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Ordermatic ordermatic = new Ordermatic();
//		Thread t1 = new Thread(ordermatic);
//		t1.start();
//		t1.join();
//		// Thread 1 baþladý. Biz join kullanarak iki thread'in baðýmsýz halde çalýþmasýný saðlarýz. 
//		// Bu sayede thread1  bitince thread 2 baþladý
//		
//		Thread t2 = new Thread(ordermatic);
//		t2.start();
//		t2.join();
		
		List<Thread> islemler = new ArrayList<>();
		for (int i = 0; i < 100; i++) {
			Thread t = new Thread(ordermatic);
			islemler.add(t);
			t.start();
		}
		
		for (Thread t : islemler) {
			t.join();
		}
		
		
	}

}
