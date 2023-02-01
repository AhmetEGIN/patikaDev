package patikaDev.sigortaYonetim.dataAccess.concretes;

import java.util.List;

import patikaDev.sigortaYonetim.dataAccess.abstracts.IAccountRepository;
import patikaDev.sigortaYonetim.entities.Account;

public class AccountRepository implements IAccountRepository {

	List<Account> accounts;

	public AccountRepository(List<Account> accounts) {

		this.accounts = accounts;
	}

	@Override
	public void add(Account account) {
		accounts.add(account);

	}

	@Override
	public Account getById(int id) {

		return accounts.get(id);
	}

	@Override
	public List<Account> getAll() {

		return accounts;
	}

}
