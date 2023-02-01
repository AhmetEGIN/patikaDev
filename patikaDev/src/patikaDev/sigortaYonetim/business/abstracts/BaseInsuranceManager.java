package patikaDev.sigortaYonetim.business.abstracts;

import java.util.List;

import patikaDev.sigortaYonetim.dataAccess.abstracts.IInsuranceRepository;
import patikaDev.sigortaYonetim.entities.Insurance;

public abstract class BaseInsuranceManager implements InsuranceService {

	private IInsuranceRepository insuranceRepository;

	public BaseInsuranceManager(IInsuranceRepository insuranceRepository) {
		super();
		this.insuranceRepository = insuranceRepository;
	}

	public abstract double calculate(Insurance insurance);

	public void add(Insurance insurance) {
		insurance.setPrice(calculate(insurance));
		insuranceRepository.add(insurance);
	}

	public Insurance getById(int id) {
		return insuranceRepository.getById(id);
	}

	public List<Insurance> getAllByAccountId(int accountId) {
		return insuranceRepository.getAllByAccountId(accountId);
	}
}
