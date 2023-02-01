package patikaDev.sigortaYonetim.business.concretes;

import java.util.ArrayList;
import java.util.List;

import patikaDev.sigortaYonetim.business.abstracts.UserService;
import patikaDev.sigortaYonetim.dataAccess.abstracts.IUserRepository;
import patikaDev.sigortaYonetim.entities.IndividualCustomer;

public class IndividualCustomerManager implements UserService<IndividualCustomer>{
	
	private IUserRepository<IndividualCustomer> userRepository;

	
	public IndividualCustomerManager(IUserRepository<IndividualCustomer> userRepository) {
		this.userRepository = userRepository;
	}

	public void add(IndividualCustomer customer) {
		userRepository.add(customer);
	}
	
	public List<IndividualCustomer> getAll() {
		return userRepository.getUsers();
	}

	@Override
	public IndividualCustomer get(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	
}
