package patikaDev.sigortaYonetim.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import patikaDev.sigortaYonetim.dataAccess.abstracts.IUserRepository;
import patikaDev.sigortaYonetim.entities.EnterpriseCustomer;

public class EnterpriseCustomerRepository implements IUserRepository<EnterpriseCustomer> {
	List<EnterpriseCustomer> enterpriseCustomers;
	
	public EnterpriseCustomerRepository() {
		this.enterpriseCustomers = new ArrayList<>();
	}

	
	@Override
	public void add(EnterpriseCustomer user) {
		enterpriseCustomers.add(user);
		
		
	}
	
	@Override
	public List<EnterpriseCustomer> getUsers() {
		// TODO Auto-generated method stub
		return enterpriseCustomers;
	}


	@Override
	public EnterpriseCustomer get(int id) {
		// TODO Auto-generated method stub
		return enterpriseCustomers.get(id);
	}

}
