package patikaDev.sigortaYonetim.business.concretes;

import java.util.List;

import patikaDev.sigortaYonetim.business.abstracts.AuthService;
import patikaDev.sigortaYonetim.business.abstracts.UserService;
import patikaDev.sigortaYonetim.business.exceptions.InvalidAuthenticationException;
import patikaDev.sigortaYonetim.entities.IndividualCustomer;
import patikaDev.sigortaYonetim.entities.User;

public class AuthManager implements AuthService {
	private UserService<User> userService;

	
	public AuthManager(UserService<User> userService) {
		super();
		this.userService = userService;
	}



	@Override
	public User login(String email, String password) {
		try {
			return checkUser(email, password);
			
			
		} catch (InvalidAuthenticationException e) {
			System.out.println(e.getMessage());
			return null;
		}
	}
	
	
	
	private User checkUser(String email, String password) throws InvalidAuthenticationException {
		User user= (User) userService.getAll().stream().filter(item -> item.getEmail().equals(email) && item.getPassword().equals(password));
		if (user != null) {
			
			return user;
		}else {
			throw new InvalidAuthenticationException();
		}
	}
	
	


}
