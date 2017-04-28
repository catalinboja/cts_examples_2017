package ro.ase.cts.seminar8.test;

import ro.ase.cts.seminar8.chain.HandlerCriogenic;
import ro.ase.cts.seminar8.chain.HandlerHitPoint;
import ro.ase.cts.seminar8.chain.HandlerLaser;
import ro.ase.cts.seminar8.chain.HandlerNormal;
import ro.ase.cts.seminar8.chain.Lovitura;
import ro.ase.cts.seminar8.observer.ManagerVersiuni;
import ro.ase.cts.seminar8.observer.UpdatePopUp;
import ro.ase.cts.seminar8.observer.UpdateSilent;
import ro.ase.cts.seminar8.strategy.DateClient;
import ro.ase.cts.seminar8.strategy.FormatCSV;
import ro.ase.cts.seminar8.strategy.FormatExcel;

public class Test {

	public static void main(String[] args) {

		//strategy
		DateClient client = new DateClient();
		client.setFormat(new FormatExcel());
		client.exportDate();
		client.setFormat(new FormatCSV());
		client.exportDate();
		
		//observer
		ManagerVersiuni manager = 
				new ManagerVersiuni();
		UpdatePopUp popUp = 
				new UpdatePopUp();
		UpdateSilent silent = new UpdateSilent();
		
		manager.adaugaClient(popUp);
		manager.adaugaClient(silent);
		
		manager.setVersiune("2.0");
		manager.stergeClient(popUp);
		manager.setVersiune("2.1");
		
		
		//chain
		int hitPoints = 100;
		HandlerHitPoint handler1 = 
				new HandlerNormal();
		HandlerHitPoint handler2 = 
				new HandlerCriogenic();
		HandlerHitPoint handler3 = 
				new HandlerLaser();
		
		handler1.setNext(handler2);
		handler2.setNext(handler3);
		
		hitPoints = handler1.procesareLovitura(
				new Lovitura(5, "Normal"), hitPoints);
		hitPoints = handler1.procesareLovitura(
				new Lovitura(10, "Criogenica"), hitPoints);
		System.out.println("Hitpoints="+hitPoints);
		
	}

}
