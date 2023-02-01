package patikaDev.sigortaYonetim;

import java.util.Date;

import patikaDev.sigortaYonetim.business.concretes.IndividualCustomerManager;
import patikaDev.sigortaYonetim.dataAccess.concretes.IndividualCustomerRepository;
import patikaDev.sigortaYonetim.entities.IndividualCustomer;

public class Main {
	public static void main(String[] args) {

		IndividualCustomer user = new IndividualCustomer(1, "ailnksda", "agksjdbas", new Date(), "Ahmet", "EGÝN", 21, "asd");
		IndividualCustomerManager individualCustomerManager = new IndividualCustomerManager(new IndividualCustomerRepository());
		individualCustomerManager.add(user);
		individualCustomerManager.getAll().stream().forEach(item -> System.out.println(item.getEmail()));
		
	}
}
