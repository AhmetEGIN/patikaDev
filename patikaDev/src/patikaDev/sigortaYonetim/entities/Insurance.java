package patikaDev.sigortaYonetim.entities;

import java.util.Date;

public class Insurance {

	private int id;
	private int accountId;
	private String name;
	private double price;
	private Date startDate;
	private Date endDate;

	public Insurance(int id, int accountId, String name, double price, Date startDate, Date endDate) {
		super();
		this.id = id;
		this.accountId = accountId;
		this.name = name;
		this.price = price;
		this.startDate = startDate;
		this.endDate = endDate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAccountId() {
		return accountId;
	}

	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

}
