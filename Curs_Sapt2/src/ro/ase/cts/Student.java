package ro.ase.cts;

public class Student {
	
	Contabilitate conta;
	
	public void setContabilitate(Contabilitate c){
		this.conta = c;
	}
	
	void platesteTaxa() throws Exception{
		if(conta!=null)
			conta.platesteTaxa();
		else
			throw new Exception();
	}
	void sustineExamenPOO(){ }
	void salvareBazaDate(){ }

}
