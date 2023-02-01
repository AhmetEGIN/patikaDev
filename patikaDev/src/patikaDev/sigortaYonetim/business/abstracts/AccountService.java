package patikaDev.sigortaYonetim.business.abstracts;

import java.util.List;

import patikaDev.sigortaYonetim.entities.Account;

public interface AccountService {
	void add(Account account);
	Account getById(int id);
	List<Account> getAll();
}
