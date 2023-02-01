package patikaDev.ordermatik;

public class Ordermatic implements Runnable {
	
	private int orderNo;
	private final Object LOCK = new Object();
	
	public Ordermatic() {
		super();
		this.orderNo = 1;
	}


	public int getOrderNo() {
		return orderNo;
	}


	public void setOrderNo(int orderNo) {
		this.orderNo = orderNo;
	}


	@Override
	public void run() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		

		increaseOrderNo();
		
	}
	
	public synchronized void increaseOrderNo() {
		this.orderNo ++;
		System.out.println(Thread.currentThread().getName() + " çalýþtý. Order No: " + this.orderNo);
	}
}
