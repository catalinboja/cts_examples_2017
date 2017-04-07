package ro.ase.cts.seminar7.proxy;

import java.util.HashMap;

public class ProxyLogin implements IAutentificare{

	HashMap<String,Integer> contor = 
			new HashMap<>();
	LogIn logIn = null;
	
	public ProxyLogin(LogIn logIn) {
		this.logIn = logIn;
	}
	
	@Override
	public void login(String utilizator, String parola) {
		
		//simulare autentificare nereusita
		Integer nr = contor.get(utilizator);
		if(nr==null){
			contor.put(utilizator, 1);
		}
		else
		{
			if(nr < 3){
				contor.put(utilizator, nr+1);
			}
			else
			{
				System.out.println("Utilizator blocat");
			}
		}
		
		System.out.println("Check user....");
		
		//pentru autentificare reusita
		//this.logIn.login(utilizator, parola);
		

	}

}
