package ro.ase.cts.seminar9.memento;

import java.util.ArrayList;

public class ManagerSalvari {
	ArrayList<MementoBatman> salvari = 
			new ArrayList<>();
	
	public void addSalvare(MementoBatman salvare){
		salvari.add(salvare);
	}
	
	public MementoBatman getSalvare(){
		if(salvari.size()>0){
			MementoBatman salvare = 
					salvari.get(salvari.size()-1);
			salvari.remove(salvare);
			return salvare;
		}
		else
			throw new IllegalArgumentException();
	}
}
