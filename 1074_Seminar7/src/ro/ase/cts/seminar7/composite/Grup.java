package ro.ase.cts.seminar7.composite;

import java.util.ArrayList;

public class Grup extends ComponentaAbstracta{

	ArrayList<ComponentaAbstracta> componente = 
			new ArrayList<>();
	
	@Override
	public void alearga() {
		for(ComponentaAbstracta comp : componente)
			comp.alearga();
	}

	@Override
	public void ataca() {
		for(ComponentaAbstracta comp : componente)
			comp.ataca();
	}

	@Override
	public void adaugaSoldat(ComponentaAbstracta soldat){
		componente.add(soldat);
	}
	public void stergeSoldat(ComponentaAbstracta soldat){
		componente.remove(soldat);
	}
	public int getNrComponente(){
		return componente.size();
	}
	public ComponentaAbstracta get(int index){
		if(index >=0 && index < componente.size())
			return componente.get(index);
		else
			throw new IllegalArgumentException();
	}
}
