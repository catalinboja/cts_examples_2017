package ro.ase.cts.lab8.proxy;

public class LogIn implements ILogIn{

	@Override
	public boolean logIn(String user, String pass) {
		System.out.println(
				"Checking credentials for "+
		user + " with "+pass);
		if(user.equals("Gigel")&&
				pass.equals("admin"))
			return true;
		else
			return false;
	}
	
}
