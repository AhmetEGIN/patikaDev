package patikaDev.sigortaYonetim.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import patikaDev.sigortaYonetim.dataAccess.abstracts.IUserRepository;
import patikaDev.sigortaYonetim.entities.IndividualCustomer;

public class IndividualCustomerRepository implements IUserRepository<IndividualCustomer> {
	List<IndividualCustomer> individualCustomers;

	public IndividualCustomerRepository() {
		this.individualCustomers = new ArrayList<>();
	}

	@Override
	public void add(IndividualCustomer user) {
		individualCustomers.add(user);
	}

	@Override
	public List<IndividualCustomer> getUsers() {

		return individualCustomers;
	}

	@Override
	public IndividualCustomer get(int id) {

		return individualCustomers.get(id);
	}

}
