package patikaDev.sigortaYonetim.entities;

import java.util.Date;

public class IndividualCustomer extends User {

	private int userId;
	private String firstName;

	private String lastName;
	private int age;
	private String job;

	public IndividualCustomer(int id, String email, String password, Date lastLoginDate, String firstName,
			String lastName, int age, String job) {
		super(id, email, password, lastLoginDate);
		this.userId = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.job = job;

	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

}
