package ro.ase.cts.supereroi;

public class Batman extends SuperErou{

	public Batman(String engine) {
		super("Batman");
		this.setEngine(engine);
	}

	@Override
	public void seDeplaseaza() {
		System.out.println(this.nume + 
				"se deplaseaza.");
	}

	@Override
	public void afisareUI() {
		System.out.println(this.nume + 
				" creat cu "+this.engine3D);
	}

}
