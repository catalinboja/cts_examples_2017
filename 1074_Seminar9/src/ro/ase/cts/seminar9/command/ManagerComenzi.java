package ro.ase.cts.seminar9.command;

import java.util.ArrayList;

public class ManagerComenzi {
	ArrayList<ComandaHelp> comenzi = 
			new ArrayList<>();
	
	public void addComanda(ComandaHelp comanda){
		comenzi.add(comanda);
	}
	
	public void executaComenzi(){
		for(ComandaHelp comanda : comenzi)
			comanda.executa();
		comenzi.clear();
	}
}
