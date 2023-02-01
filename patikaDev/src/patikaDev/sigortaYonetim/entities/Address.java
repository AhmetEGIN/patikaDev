package patikaDev.sigortaYonetim.entities;

public class Address {
	private int id;
	private int userId;
	private String city;
	private String street;

	public Address(int id, int userId, String city, String street) {
		super();
		this.id = id;
		this.userId = userId;
		this.city = city;
		this.street = street;
	}

	public Address() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

}
