package ro.ase.cts.seminar3.test;

import java.util.ArrayList;

import ro.ase.cts.seminar3.ModulConfigurareCaracter;
import ro.ase.cts.seminar3.ModulSetari;
import ro.ase.cts.seminar3.factory.FactorySuperEroi;
import ro.ase.cts.seminar3.supereroi.Batman;
import ro.ase.cts.seminar3.supereroi.ISuperErou;
import ro.ase.cts.seminar3.supereroi.Spiderman;

public class Test {

	public static void main(String[] args) {
		ModulSetari modulSetari = 
				new ModulSetari();
		ModulConfigurareCaracter modulCaracter = 
				new ModulConfigurareCaracter();

		try {
			System.out.println("Working...");
			Thread.sleep(1000);
			System.out.println("The end");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
			
		
		ArrayList<ISuperErou> colectie = 
				new ArrayList<>();
		
		colectie.add(
				FactorySuperEroi.getErou("Batman"));
		colectie.add(
				FactorySuperEroi.getErou("Spiderman"));
		
/*		Batman batman = new Batman();
		Spiderman spiderman = new Spiderman();
		
		batman.conduce();
		spiderman.sare();*/
		for(ISuperErou erou : colectie)
			erou.seDeplaseaza();
	}

}
