package patikaDev.runnableInterface;

public class Counter implements Runnable {

	private String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Counter(String name) {
		super();
		this.name = name;
	}

	@Override
	public void run() {
		System.out.println(this.getName() +  " sayacý baþladý");

		for (int i = 0; i < 100; i++) {
			System.out.println(this.getName() + " : " + i);
			
		}
	}

}
