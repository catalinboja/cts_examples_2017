package ro.ase.cts;

public class Persoana {
	String nume;
	int varsta;
	public Persoana(String nume, int varsta) {
		super();
		this.nume = nume;
		this.varsta = varsta;
	}
	public String getNume() {
		return nume;
	}
	public void setNume(String nume) {
		this.nume = nume;
	}
	public int getVarsta() {
		return varsta;
	}
	public void setVarsta(int varsta) {
		if(varsta < 0)
			throw new IllegalArgumentException();
		this.varsta = varsta;
	}
	
	
}
