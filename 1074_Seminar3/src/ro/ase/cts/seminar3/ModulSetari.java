package ro.ase.cts.seminar3;

import ro.ase.cts.seminar3.singleton.Conexiune;

public class ModulSetari {
	public ModulSetari(){
		/*ConexiuneBD conexiune = 
				new ConexiuneBD();*/
		Conexiune conexiune = 
				Conexiune.getConexiune();
		//modificare setari
	}
}
