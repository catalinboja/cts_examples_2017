package ro.ase.cts.seminar7.proxy;

public class LogIn implements IAutentificare{

	@Override
	public void login(String utilizator, String parola) {
		System.out.println("Verificare "+
				utilizator+" cu parola "+
				parola);
	}

}
