package patikaDev.sigortaYonetim.dataAccess.abstracts;

import java.util.List;

import patikaDev.sigortaYonetim.entities.Account;

public interface IAccountRepository {
	
	void add(Account account);
	Account getById(int id);
	List<Account> getAll();
}
