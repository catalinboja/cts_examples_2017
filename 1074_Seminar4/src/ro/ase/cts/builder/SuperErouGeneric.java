package ro.ase.cts.builder;

public class SuperErouGeneric {
	String nume;
	String superPutere;
	String arma;
	int varsta;
	int greutate;
	IDeplasare vehicul;
	ICostum costum;
	
	private SuperErouGeneric(){
		
	}
	
	public SuperErouGeneric(
			String Nume,
			String SuperPutere,
			String Arma,
			int Varsta,
			int Greutate,
			IDeplasare Auto,
			ICostum Costum){
		this.nume = Nume;
		this.superPutere = SuperPutere;
		this.arma = Arma;
		this.varsta = Varsta;
		this.greutate = Greutate;
		this.vehicul = Auto;
		this.costum = Costum;
	}
}
