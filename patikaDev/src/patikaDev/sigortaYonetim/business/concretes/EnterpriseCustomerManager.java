package patikaDev.sigortaYonetim.business.concretes;

import java.util.List;

import patikaDev.sigortaYonetim.business.abstracts.UserService;
import patikaDev.sigortaYonetim.dataAccess.abstracts.IUserRepository;
import patikaDev.sigortaYonetim.entities.EnterpriseCustomer;

public class EnterpriseCustomerManager implements UserService<EnterpriseCustomer> {
	
	private IUserRepository<EnterpriseCustomer> userRepository;
	
	
	public EnterpriseCustomerManager(IUserRepository<EnterpriseCustomer> userRepository) {
		this.userRepository = userRepository;
	}

	public void add(EnterpriseCustomer customer) {
		userRepository.add(customer);
	}
	
	public List<EnterpriseCustomer> getAll() {
		return userRepository.getUsers();
	}

	@Override
	public EnterpriseCustomer get(int id) {
		// TODO Auto-generated method stub
		return null;
	}
}
