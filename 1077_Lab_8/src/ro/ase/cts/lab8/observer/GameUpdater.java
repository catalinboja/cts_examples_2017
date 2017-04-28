package ro.ase.cts.lab8.observer;

import java.util.ArrayList;

public class GameUpdater {
	String version;
	
	ArrayList<Player> players = 
			new ArrayList<>();
	
	public void registerPlayer(Player player){
		this.players.add(player);
	}
	
	public void removePlayer(Player player){
		this.players.remove(player);
	}
	
	public void notifyPlayers(){
		for(Player player : players)
			player.notifyUser();
	}
	
	public void changeVersion(String newVersion){
		this.version = newVersion;
		System.out.println("New version:"+newVersion);
		this.notifyPlayers();
	}
}
