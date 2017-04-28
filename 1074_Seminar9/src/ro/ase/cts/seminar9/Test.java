package ro.ase.cts.seminar9;

import ro.ase.cts.seminar9.command.CatWoman;
import ro.ase.cts.seminar9.command.ComandaHelp;
import ro.ase.cts.seminar9.command.ManagerComenzi;
import ro.ase.cts.seminar9.command.Robyn;
import ro.ase.cts.seminar9.memento.ManagerSalvari;
import ro.ase.cts.seminar9.state.Batman;
import ro.ase.cts.seminar9.state.StareLovit;
import ro.ase.cts.seminar9.state.StareLovitLaser;

public class Test {

	public static void main(String[] args) {

		
		//test memento
		ManagerSalvari salvari = 
				new ManagerSalvari();
		
		Batman batman = new Batman(
				"pistol", "bumerang");
		batman.seLupta();
		
		salvari.addSalvare(batman.getMemento());
		
		//modificare stare
		batman.setHitPoints(80);
		batman.setStareCurenta(new StareLovitLaser());
		batman.seLupta();
		
		salvari.addSalvare(batman.getMemento());
		
		batman.setHitPoints(60);
		batman.setStareCurenta(new StareLovit());
		batman.seLupta();
		
		salvari.addSalvare(batman.getMemento());
		
		//test command
		ManagerComenzi manager = 
				new ManagerComenzi();
		manager.addComanda(
				new ComandaHelp(
						new Robyn(), "genereaza scut"));
		CatWoman catWoman = new CatWoman();
		manager.addComanda(
				new ComandaHelp(catWoman, "orbeste inamicii"));
		System.out.println("Batman asteapta ajutor");
		manager.executaComenzi();
		
		batman.setValoriAnterioare(salvari.getSalvare());
		batman.setValoriAnterioare(salvari.getSalvare());
		batman.setValoriAnterioare(salvari.getSalvare());
		batman.seLupta();
	}

}
