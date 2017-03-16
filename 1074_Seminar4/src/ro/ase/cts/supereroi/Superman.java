package ro.ase.cts.supereroi;

public class Superman extends SuperErou{

	//sa nu uiti sa setezi si engine-ul
	public Superman() {
		super("Superman");
	}

	@Override
	public void seDeplaseaza() {
		System.out.println(this.nume + "se deplaseaza");
	}

	@Override
	public void afisareUI() {
		System.out.println(this.nume + " creat cu "
				+ this.engine3D);
	}

}
