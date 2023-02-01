package patikaDev.sigortaYonetim.dataAccess.abstracts;

import java.util.List;

import patikaDev.sigortaYonetim.entities.User;

public interface IUserRepository<T extends User> {
	
	void add(T user);
	T get(int id);
	List<T> getUsers();
}
