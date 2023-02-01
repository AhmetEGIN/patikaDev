package patikaDev.sigortaYonetim.business.concretes;

import java.util.concurrent.TimeUnit;

import patikaDev.sigortaYonetim.business.abstracts.BaseInsuranceManager;
import patikaDev.sigortaYonetim.dataAccess.abstracts.IInsuranceRepository;
import patikaDev.sigortaYonetim.entities.HealthInsurance;
import patikaDev.sigortaYonetim.entities.Insurance;

public class HealthInsuranceManager extends BaseInsuranceManager {

	public HealthInsuranceManager(IInsuranceRepository insuranceRepository) {
		super(insuranceRepository);
	
	}

	@Override
	public double calculate(Insurance insurance) {
		long totalDay = insurance.getEndDate().getTime() - insurance.getStartDate().getTime();
		double totalPrice = TimeUnit.DAYS.convert(totalDay, TimeUnit.MILLISECONDS) * HealthInsurance.price;
		return totalPrice;
	}
	
	
}
