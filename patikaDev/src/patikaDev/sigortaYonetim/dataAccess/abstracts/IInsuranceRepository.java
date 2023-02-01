package patikaDev.sigortaYonetim.dataAccess.abstracts;

import java.util.List;

import patikaDev.sigortaYonetim.entities.Insurance;

public interface IInsuranceRepository {
	void add(Insurance insurance);
	Insurance getById(int id);
	List<Insurance> getAllByAccountId(int accountId);
	
	
}
