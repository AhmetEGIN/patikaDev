package patikaDev.sigortaYonetim.dataAccess.abstracts;

import java.util.List;

import patikaDev.sigortaYonetim.entities.Address;

public interface IAddressRepository {
	
	void add(Address address);
	Address getById(int id);
	List<Address> getAllByUserId(int userId);
	
}
