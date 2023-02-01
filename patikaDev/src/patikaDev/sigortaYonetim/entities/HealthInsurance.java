package patikaDev.sigortaYonetim.entities;

import java.util.Date;

public class HealthInsurance extends Insurance {
	public static final double price = 100.0;
	
	public HealthInsurance(int id, int accountId, Date startDate, Date endDate) {
		super(id, accountId, "HealthInsuarance", price, startDate, endDate);

	}

}
