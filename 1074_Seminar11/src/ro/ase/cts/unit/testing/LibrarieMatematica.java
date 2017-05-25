package ro.ase.cts.unit.testing;

public class LibrarieMatematica {
	public static int min(int[] valori) throws ExceptieLibrarie{
		if(valori == null || valori.length==0)
			throw new ExceptieLibrarie();
		int minim = valori[0];
		for(int i=1;i<valori.length;i++)
			if(minim > valori[i])
				minim = valori[i];
		return minim;
		
	}
}
