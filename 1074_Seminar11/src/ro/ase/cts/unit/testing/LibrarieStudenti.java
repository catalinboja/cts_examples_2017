package ro.ase.cts.unit.testing;

public class LibrarieStudenti {
	
	public static InterfataConectorBDStudenti conector;
	
	public static int salvareBazaDate(String nume) 
			throws ExceptieLibrarie{
		if(conector == null)
			throw new ExceptieLibrarie();
		if(conector.insertStudent(nume))
			return 1;
		else
			return 0;
	}
}
