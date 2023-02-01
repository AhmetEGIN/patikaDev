package patikaDev.threadRace;

import java.util.List;

public class Finder implements Runnable {

	private List<Integer> nums;
	private List<Integer> oddNums;
	private List<Integer> evenNums;

	public List<Integer> getNums() {
		return nums;
	}

	public void setNums(List<Integer> nums) {
		this.nums = nums;
	}

	public List<Integer> getOddNums() {
		return oddNums;
	}

	public void setOddNums(List<Integer> oddNums) {
		this.oddNums = oddNums;
	}

	public List<Integer> getEvenNums() {
		return evenNums;
	}

	public void setEvenNums(List<Integer> evenNums) {
		this.evenNums = evenNums;
	}

	public Finder(List<Integer> nums, List<Integer> oddNums, List<Integer> evenNums) {
		super();
		this.nums = nums;
		this.oddNums = oddNums;
		this.evenNums = evenNums;
	}

	@Override
	public void run() {
		for (Integer value : nums) {
			if (value % 2 == 0) {
				evenNums.add(value);

			} else {
				oddNums.add(value);
			}
		}

	}
	
	public void getSize() {
		System.out.println("Nums: " + nums.size() );
		System.out.println("EvenNums: " + evenNums.size() );
		System.out.println("OddNums: " + oddNums.size() );
	}

}
