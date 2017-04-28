package ro.ase.cts.lab8.proxy;

import java.util.HashMap;

public class LogInProxy implements ILogIn{
	
	LogIn log;
	HashMap<String,Integer> attempts = 
			new HashMap<>();
	
	public LogInProxy(LogIn object){
		this.log = object;
	}

	@Override
	public boolean logIn(String user, String pass) {
		Integer previousNo = 
				attempts.get(user);
		if(previousNo == null || previousNo<3){
			System.out.println("No previous attempts");
			boolean result = this.log.logIn(
					user, pass);
			if(result == false)
			{
				if(previousNo==null)
					previousNo = 1;
				else
					previousNo++;
				
				attempts.put(user, previousNo);
			}
		}
		else
			System.out.println(user + " is locked" );
		
		return true;

	}
}
