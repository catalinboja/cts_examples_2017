package ro.ase.cts.lab8.test;

import ro.ase.cts.lab.strategy.ExportExcel;
import ro.ase.cts.lab.strategy.ExportLibre;
import ro.ase.cts.lab.strategy.UserDataApi;
import ro.ase.cts.lab8.observer.GameUpdater;
import ro.ase.cts.lab8.observer.PlayerAlice;
import ro.ase.cts.lab8.observer.PlayerGigel;
import ro.ase.cts.lab8.proxy.LogIn;
import ro.ase.cts.lab8.proxy.LogInProxy;

public class Test {

	public static void main(String[] args) {

		//try to log in
		LogIn log = new LogIn();
		log.logIn("Gigel", "1234");
		log.logIn("Gigel", "123456");
		log.logIn("Gigel", "12345678");
		log.logIn("Gigel", "password");
		
		//use the proxy
		System.out.println("--------");
		LogInProxy proxy = new LogInProxy(log);
		proxy.logIn("Gigel", "1234");
		proxy.logIn("Gigel", "123456");
		proxy.logIn("Gigel", "12345678");
		proxy.logIn("Gigel", "password");
		proxy.logIn("Gigel", "password");
		
		
		//use the strategy
		UserDataApi dataApi = 
				new UserDataApi("Gigel");
		dataApi.setExportFormat(new ExportExcel());
		dataApi.doTheExport();
		dataApi.setExportFormat(new ExportLibre());
		dataApi.doTheExport();
		
		GameUpdater game = new GameUpdater();
		PlayerGigel player1 = 
				new PlayerGigel("Gigel");
		PlayerAlice player2 = 
				new PlayerAlice();
		
		game.changeVersion("1.0");
		game.registerPlayer(player1);
		game.changeVersion("2.0");
		game.registerPlayer(player2);
		game.changeVersion("2.1");
		game.removePlayer(player1);
		game.changeVersion("2.2");
	}

}
