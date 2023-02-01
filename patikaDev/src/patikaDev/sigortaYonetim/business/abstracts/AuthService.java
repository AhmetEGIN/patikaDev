package patikaDev.sigortaYonetim.business.abstracts;

import patikaDev.sigortaYonetim.entities.IndividualCustomer;
import patikaDev.sigortaYonetim.entities.User;

public interface AuthService {
	User login(String email, String password);

}
