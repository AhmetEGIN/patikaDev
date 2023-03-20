package patikaDev.sigortaYonetim.entities;

import java.util.Date;

//import patikaDev.sigortaYonetim.entities.enums.LoginStatus;

public class User {

	private int id;
	private String email;
	private String password;
	private Date lastLoginDate;
//	private LoginStatus loginStatus = LoginStatus.FAÝL;

	public User() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getLastLoginDate() {
		return lastLoginDate;
	}

	public void setLastLoginDate(Date lastLoginDate) {
		this.lastLoginDate = lastLoginDate;
	}
	
//	public LoginStatus getLoginStatus() {
//		return loginStatus;
//	}
//
//	public void setLoginStatus(LoginStatus loginStatus) {
//		this.loginStatus = loginStatus;
//	}


	public User(int id, String email, String password, Date lastLoginDate) {
		super();
		this.id = id;
		this.email = email;
		this.password = password;
		this.lastLoginDate = lastLoginDate;
	}
}
