package ro.ase.cts.seminar6.eroi;

public abstract class SuperErou {
	public String nume;
	public SuperErou(String Nume){
		this.nume = Nume;
	}
	
	public abstract void superMerge();
	public abstract void superSare();
	public abstract void superActiune();
}
