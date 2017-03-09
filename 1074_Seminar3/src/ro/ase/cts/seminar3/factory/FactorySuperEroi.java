package ro.ase.cts.seminar3.factory;

import ro.ase.cts.seminar3.supereroi.Batman;
import ro.ase.cts.seminar3.supereroi.ISuperErou;
import ro.ase.cts.seminar3.supereroi.Spiderman;

public class FactorySuperEroi {
	public static ISuperErou getErou(String tip){
		if(tip.equals("Batman"))
			return new Batman("nimic");
		if(tip.equals("Spiderman"))
			return new Spiderman();
		throw new IllegalArgumentException();
	}
}
