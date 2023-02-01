package patikaDev.sigortaYonetim.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import patikaDev.sigortaYonetim.dataAccess.abstracts.IAddressRepository;
import patikaDev.sigortaYonetim.entities.Address;

public class AddressRepository implements IAddressRepository{
	
	List<Address> addresses;
	
	public AddressRepository() {
		this.addresses = new ArrayList<>();
	}

	@Override
	public void add(Address address) {
		addresses.add(address);
		
	}

	@Override
	public Address getById(int id) {
		Address address = addresses.get(id);
		return address;
	}

	@Override
	public List<Address> getAllByUserId(int userId) {
		List<Address> getAddress = addresses.stream().filter(item -> item.getUserId()==userId).toList();
		return getAddress;
	}

}
