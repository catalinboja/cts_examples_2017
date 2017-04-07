package ro.ase.cts.seminar7.composite;

public abstract class ComponentaAbstracta {
	
	//functii specifice unui om rau
	public abstract void alearga();
	public abstract void ataca();
	
	//functii specifice nodurilor intermediare
	public void adaugaSoldat(ComponentaAbstracta soldat){
		throw new UnsupportedOperationException();
	}
	public void stergeSoldat(ComponentaAbstracta soldat){
		throw new UnsupportedOperationException();
	}
	public int getNrComponente(){
		throw new UnsupportedOperationException();
	}
	public ComponentaAbstracta get(int index){
		throw new UnsupportedOperationException();
	}
}
