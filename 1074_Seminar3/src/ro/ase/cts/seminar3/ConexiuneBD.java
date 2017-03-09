package ro.ase.cts.seminar3;

public class ConexiuneBD {
	public ConexiuneBD(){
		System.out.println("Conexiune creata");
	}
	
	public void inchide(){
		System.out.println("Conexiune inchisa");
	}
	
	@Override
	public void finalize(){
		System.out.println("Clean-up");
		this.inchide();
	}
}
