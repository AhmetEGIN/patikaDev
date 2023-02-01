package patikaDev.sigortaYonetim.business.concretes;

import java.util.List;

import patikaDev.sigortaYonetim.business.abstracts.AddressService;
import patikaDev.sigortaYonetim.dataAccess.abstracts.IAddressRepository;
import patikaDev.sigortaYonetim.entities.Address;

public class AddressManager implements AddressService {
	
	private IAddressRepository addressRepository;
	
	
	public AddressManager(IAddressRepository addressRepository) {
		this.addressRepository = addressRepository;
	}


	@Override
	public void add(Address address) {
		addressRepository.add(address);
		
	}


	@Override
	public Address getById(int id) {
		
		return addressRepository.getById(id);
	}


	@Override
	public List<Address> getAllByUserId(int userId) {
		
		return addressRepository.getAllByUserId(userId);
	}


	
	
	
}
