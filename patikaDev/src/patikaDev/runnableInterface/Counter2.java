package patikaDev.runnableInterface;

public class Counter2 implements Runnable {

	private String name;
	private int id;
	private boolean isRun = true;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Counter2(String name, int id) {
		super();
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public void run() {
		System.out.println(this.name + " çalýþtý ");
		int i = 0;
		while (isRun) {

			try {
				Thread.sleep(1000L * this.getId());
				System.out.println(this.getName() + " : " + i);
				i++;
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}

	public void stop() {
		this.isRun = false;
	}

}
