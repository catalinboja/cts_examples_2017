package ro.ase.cts.seminar3.supereroi;

public class Spiderman implements ISuperErou{
	public Spiderman(){
		System.out.println("Spiderman creat");
	}
	public void sare(){
		System.out.println(
				"Sare de pe o cladire pe alta");
	}
	@Override
	public void seDeplaseaza() {
		this.sare();
	}
}
