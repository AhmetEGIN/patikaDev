package patikaDev.sigortaYonetim.business.abstracts;

import java.util.List;

import patikaDev.sigortaYonetim.entities.Insurance;

public interface InsuranceService {
	void add(Insurance insurance);
	Insurance getById(int id);
	List<Insurance> getAllByAccountId(int accountId);
	
}
