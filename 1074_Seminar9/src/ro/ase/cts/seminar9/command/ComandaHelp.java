package ro.ase.cts.seminar9.command;

public class ComandaHelp {

	BatmanFriends prieten;
	String ajutor;
	
	public ComandaHelp(BatmanFriends prieten, String ajutor) {
		super();
		this.prieten = prieten;
		this.ajutor = ajutor;
	}
	
	public void executa(){
		if(prieten != null)
			prieten.help(ajutor);
		else
			throw new IllegalArgumentException();
	}
	
}
