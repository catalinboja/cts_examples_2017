package ro.ase.cts.seminar5.builder;

public class SuperErouGeneric implements Cloneable{
	
	String nume;
	String superPutere;
	String arma;
	int varsta;
	int greutate;
	IDeplasare vehicul;
	ICostum costum;
	
	public String getNume() {
		return nume;
	}

	public String getSuperPutere() {
		return superPutere;
	}

	public String getArma() {
		return arma;
	}

	public int getVarsta() {
		return varsta;
	}

	public int getGreutate() {
		return greutate;
	}

	public IDeplasare getVehicul() {
		return vehicul;
	}

	public ICostum getCostum() {
		return costum;
	}
	
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
	
	@Override
	public Object clone(){
		//shallow copy
		//return this;
		//deep copy
		SuperErouGeneric copie = 
				new SuperErouGeneric();
		copie.nume = this.nume;
		//...
		return copie;
	}
	
	public static class BuilderSuperErou extends AbstractBuilderSuperErou{

		public BuilderSuperErou(String nume) {
			super(nume);
			this.superErou = new SuperErouGeneric();
			this.superErou.nume = nume;
		}

		@Override
		public AbstractBuilderSuperErou addSuperPutere(String putere) {
			this.superErou.superPutere = putere;
			return this;
			
		}

		@Override
		public AbstractBuilderSuperErou addArma(String arma) {
			this.superErou.arma = arma;
			return this;
		}

		@Override
		public AbstractBuilderSuperErou addCostum(ICostum costum) {
			this.superErou.costum = costum;
			return this;
		}

		@Override
		public AbstractBuilderSuperErou addVarsta(int varsta) {
			this.superErou.varsta = varsta;
			return this;
		}

		@Override
		public AbstractBuilderSuperErou addGreutate(int greutate) {
			this.superErou.greutate = greutate;
			return this;
		}

		@Override
		public AbstractBuilderSuperErou addVehicul(IDeplasare vehicul) {
			this.superErou.vehicul = vehicul;
			return this;
		}
		

	}
}
