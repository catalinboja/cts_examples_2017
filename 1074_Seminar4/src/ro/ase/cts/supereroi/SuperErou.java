package ro.ase.cts.supereroi;

public abstract class SuperErou {
	String nume;
	String engine3D;
	
	protected SuperErou(String nume){
		this.nume = nume;
	}
	
	public void setEngine(String engine){
		this.engine3D = engine;
	}
	
	public String getEngine(){
		return this.engine3D;
	}
	
	public abstract void seDeplaseaza();
	public abstract void afisareUI();
}
