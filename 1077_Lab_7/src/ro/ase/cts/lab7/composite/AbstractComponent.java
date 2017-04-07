package ro.ase.cts.lab7.composite;

public abstract class AbstractComponent {
	//actions specific to leaf nodes - bad guys
	public abstract void move();
	public abstract void fight();
	
	//actions specific to intermediary nodes
	public void addSubcomponents(
			AbstractComponent component){
		throw new UnsupportedOperationException();
	}
	public void deleteSubcomponents(
			AbstractComponent component){
		throw new UnsupportedOperationException();
	}
	
	public AbstractComponent getSubcomponents(int index){
		throw new UnsupportedOperationException();
	}
	
	public int getNoComponents(){
		throw new UnsupportedOperationException();
	}
}
