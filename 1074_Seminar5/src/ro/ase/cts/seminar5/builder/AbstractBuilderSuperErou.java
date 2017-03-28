package ro.ase.cts.seminar5.builder;

public abstract class AbstractBuilderSuperErou {
	protected SuperErouGeneric superErou = null;
	private String numeErou;
	
	public AbstractBuilderSuperErou(String nume){
		this.numeErou = nume;
	}
	
	public abstract AbstractBuilderSuperErou addSuperPutere(String putere);
	public abstract AbstractBuilderSuperErou addArma(String arma);
	public abstract AbstractBuilderSuperErou addCostum(ICostum costum);
	public abstract AbstractBuilderSuperErou addVarsta(int inaltime);
	public abstract AbstractBuilderSuperErou addGreutate(int greutate);
	public abstract AbstractBuilderSuperErou addVehicul(IDeplasare vehicul);
	
	
	public SuperErouGeneric build(){
		if(this.superErou != null)
			return this.superErou;
		else
			throw new IllegalAccessError();
	}
	
	
}
