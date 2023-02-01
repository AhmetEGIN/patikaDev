package patikaDev.sigortaYonetim.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import patikaDev.sigortaYonetim.dataAccess.abstracts.IInsuranceRepository;
import patikaDev.sigortaYonetim.entities.Insurance;

public class InsuranceRepository implements IInsuranceRepository {
	List<Insurance> insurances;
	
	
	public InsuranceRepository() {
		super();
		this.insurances = new ArrayList<>();
	}

	@Override
	public void add(Insurance insurance) {
		insurances.add(insurance);
		
	}

	@Override
	public Insurance getById(int id) {

		return insurances.get(id);
	}

	@Override
	public List<Insurance> getAllByAccountId(int accountId) {

		return insurances.stream().filter(item -> item.getAccountId() == accountId).toList();
	}

}
