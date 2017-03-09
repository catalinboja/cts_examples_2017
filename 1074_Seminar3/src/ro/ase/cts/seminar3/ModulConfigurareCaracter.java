package ro.ase.cts.seminar3;

import ro.ase.cts.seminar3.singleton.Conexiune;

public class ModulConfigurareCaracter {
	public ModulConfigurareCaracter(){
		
		//ConexiuneBD conexiune = null;
		Conexiune conexiune = null;
		try{
/*			conexiune = 
				new ConexiuneBD();*/
			conexiune = Conexiune.getConexiune();
		}
		finally{
			//conexiune.inchide();
		}
		
	}
}
