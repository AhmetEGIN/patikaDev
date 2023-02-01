package patikaDev.sigortaYonetim.business.concretes;

import java.util.List;

import patikaDev.sigortaYonetim.business.abstracts.AccountService;
import patikaDev.sigortaYonetim.dataAccess.abstracts.IAccountRepository;
import patikaDev.sigortaYonetim.entities.Account;

public class AccountManager implements AccountService {
	
	private IAccountRepository accountRepository;
	
	public AccountManager(IAccountRepository accountRepository) {
		this.accountRepository = accountRepository;
	}

	@Override
	public void add(Account account) {
		accountRepository.add(account);
		
	}

	@Override
	public Account getById(int id) {
		return accountRepository.getById(id);
	}

	@Override
	public List<Account> getAll() {
		return accountRepository.getAll();
	}

}
