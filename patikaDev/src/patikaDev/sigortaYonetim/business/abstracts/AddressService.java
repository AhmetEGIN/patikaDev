package patikaDev.sigortaYonetim.business.abstracts;

import java.util.List;

import patikaDev.sigortaYonetim.entities.Address;

public interface AddressService {
	void add(Address address);

	Address getById(int id);

	List<Address> getAllByUserId(int userId);
}
