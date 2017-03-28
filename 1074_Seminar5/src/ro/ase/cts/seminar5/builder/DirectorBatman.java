package ro.ase.cts.seminar5.builder;

public class DirectorBatman {
	AbstractBuilderSuperErou builder;
	
	public DirectorBatman(AbstractBuilderSuperErou builder){
		this.builder = builder;
	}
	
	public SuperErouGeneric construieste(){
		return builder.addArma("Bumerang")
				.addGreutate(75)
				.addVarsta(32)
				.addSuperPutere("Super forta")
				.addVehicul(new IDeplasare() {
				})
				.addCostum(new ICostum() {
				})
				.build();
	}
}
