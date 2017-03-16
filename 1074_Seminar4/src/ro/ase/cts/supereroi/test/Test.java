package ro.ase.cts.supereroi.test;

import ro.ase.cts.builder.SuperErouGeneric;
import ro.ase.cts.factory.AbstractFactory;
import ro.ase.cts.factory.AndroidFactory;
import ro.ase.cts.factory.GeneratorPlatforma;
import ro.ase.cts.factory.TipSuperou;
import ro.ase.cts.factory.WindowsFactory;
import ro.ase.cts.supereroi.Batman;
import ro.ase.cts.supereroi.SuperErou;
import ro.ase.cts.supereroi.Superman;

public class Test {

	public static void main(String[] args) {

		//creare batman
		SuperErou batman = new Batman("DirectX");
		
		//creare superman
		SuperErou superman = 
				new Superman();
		superman.setEngine("DirectX");
		
/*		AbstractFactory factory = 
				new WindowsFactory();*/
/*		AbstractFactory factory = 
				new AndroidFactory();*/
		
		AbstractFactory factory = 
				GeneratorPlatforma.getFactory("Windows");
		
		SuperErou s1 = 
				factory.getSupererou(TipSuperou.BATMAN);
		SuperErou s2 = 
				factory.getSupererou(TipSuperou.SUPERMAN);	
		s1.afisareUI();
		s2.afisareUI();
		
		SuperErouGeneric superE = 
				new SuperErouGeneric(
						"Gigel", "Invata", 
						"Calculator", 22, 65, 
						null, null);
		
	}

}
