package ro.ase.cts.seminar3.supereroi;

public class Batman implements ISuperErou{
	public Batman(String arma){
		System.out.println("Batman creat cu arma "+
	arma);
	}
	public void conduce(){
		System.out.println(
				"Se deplaseaza cu Batmobilul");
	}
	@Override
	public void seDeplaseaza() {
		this.conduce();
	}
}
