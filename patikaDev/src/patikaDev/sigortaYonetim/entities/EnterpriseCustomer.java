package patikaDev.sigortaYonetim.entities;

import java.util.Date;

public class EnterpriseCustomer extends User {
	private String companyName;
	private String webSite;

	public EnterpriseCustomer(int id, String email, String password, Date lastLoginDate, String companyName,
			String webSite) {
		super(id, email, password, lastLoginDate);
		this.companyName = companyName;
		this.webSite = webSite;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getWebSite() {
		return webSite;
	}

	public void setWebSite(String webSite) {
		this.webSite = webSite;
	}

}
