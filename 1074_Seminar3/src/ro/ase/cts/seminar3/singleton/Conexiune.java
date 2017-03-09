package ro.ase.cts.seminar3.singleton;

import java.io.ObjectInputStream;
import java.io.Serializable;

public class Conexiune implements Serializable{
	
	private static Conexiune conexiune = null;
	
	private Conexiune(){
		System.out.println("Creare conexiune unica");
	}
	
	public static synchronized Conexiune getConexiune(){
		if(conexiune == null){
			conexiune = new Conexiune();
			return conexiune;
		}
		else
			return conexiune;
	}
	
	@Override
	public void finalize(){
		System.out.println("Inchide conexiune unica");
	}
	
	public Conexiune readResolve(){
		return Conexiune.getConexiune();
	}
}
