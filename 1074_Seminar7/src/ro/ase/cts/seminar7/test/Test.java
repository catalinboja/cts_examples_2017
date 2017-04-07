package ro.ase.cts.seminar7.test;

import java.util.ArrayList;

import ro.ase.cts.seminar7.composite.Grup;
import ro.ase.cts.seminar7.composite.Soldat;
import ro.ase.cts.seminar7.flyweight.FactorySuperEroi;
import ro.ase.cts.seminar7.flyweight.FlyweightErou;
import ro.ase.cts.seminar7.flyweight.StareTemporaraEcran;
import ro.ase.cts.seminar7.proxy.LogIn;
import ro.ase.cts.seminar7.proxy.ProxyLogin;

public class Test {

	public static void main(String[] args) {
		//construim armata de oameni rai
		Soldat soldat1 = new Soldat();
		Soldat soldat2 = new Soldat();
		Grup grup1 = new Grup();
		grup1.adaugaSoldat(soldat1);
		grup1.adaugaSoldat(soldat2);
		
		Soldat soldat3 = new Soldat();
		Grup grup2 = new Grup();
		grup2.adaugaSoldat(soldat3);
		grup2.adaugaSoldat(grup1);
		
		grup2.alearga();
		grup2.ataca();
		
		//test flyweight
		FactorySuperEroi factory = 
				new FactorySuperEroi();
		
		//colectia pentru stari temporare
		ArrayList<StareTemporaraEcran>stariTemporare = 
				new ArrayList<>();
		//colectia pentru flyweight jucator
		ArrayList<FlyweightErou> eroi = 
				new ArrayList<>();
		
		//adaugare jucatori
		StareTemporaraEcran stareJucator1 = 
				new StareTemporaraEcran(10,10,"rosu");
		FlyweightErou erouJucator1 = 
				new FlyweightErou(factory.get("Batman"));
		
		stariTemporare.add(stareJucator1);
		eroi.add(erouJucator1);
		
		StareTemporaraEcran stareJucator2 = 
				new StareTemporaraEcran(34,25,"verde");
		FlyweightErou erouJucator2 = 
				new FlyweightErou(factory.get("Batman"));
		
		stariTemporare.add(stareJucator2);
		eroi.add(erouJucator2);
		
		erouJucator1.afisareEcran(stareJucator1);
		erouJucator2.afisareEcran(stareJucator2);
		
		//test proxy
		LogIn log1 = new LogIn();
		log1.login("Gigel", "1234");
		log1.login("Gigel", "1234");
		log1.login("Gigel", "1234");
		log1.login("Gigel", "1234");
		
		ProxyLogin proxy1 = 
				new ProxyLogin(log1);
		proxy1.login("Gigel", "1234");
		proxy1.login("Gigel", "1234");
		proxy1.login("Gigel", "1234");
		proxy1.login("Gigel", "1234");
		proxy1.login("Gigel", "1234");
	}

}
