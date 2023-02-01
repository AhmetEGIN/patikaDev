package patikaDev.sigortaYonetim.business.exceptions;

public class InvalidAuthenticationException extends Exception {
	
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "Email ya da password hatalý";
	}
}
