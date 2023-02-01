package patikaDev.sigortaYonetim.business.abstracts;

import java.util.List;

import patikaDev.sigortaYonetim.entities.User;

public interface UserService<T extends User> {
	
	void add(T user);
	T get(int id);
	List<T> getAll();
	
	
}
