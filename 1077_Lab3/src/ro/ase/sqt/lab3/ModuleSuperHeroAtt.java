package ro.ase.sqt.lab3;

import ro.ase.sqt.lab3.singleton.DBConnectionSingleton;

public class ModuleSuperHeroAtt {
	public ModuleSuperHeroAtt(){
		//DBConnection conn = null;
		DBConnectionSingleton conn = null;
		try{
		conn = DBConnectionSingleton.getConnection();
		}
		catch(Exception e){
			
		}
		finally{
			conn.close();
		}
	}
}
