package ro.ase.cts;

public class LibrarieMatematica {

	public static int suma(int[] valori) throws ExceptieValoriEronate{
		if(valori==null)
			throw new ExceptieValoriEronate();
		int rez = 0;
		for(int valoare : valori)
			rez+=valoare;
		return rez;
	}
}
