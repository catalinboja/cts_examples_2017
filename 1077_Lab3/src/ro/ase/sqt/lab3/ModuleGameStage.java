package ro.ase.sqt.lab3;

import ro.ase.sqt.lab3.singleton.DBConnectionSingleton;

public class ModuleGameStage {
	public ModuleGameStage(){
/*		DBConnection conn = 
				new DBConnection();*/
		DBConnectionSingleton conn = 
				DBConnectionSingleton.getConnection();
	}
}
