package ro.ase.cts.lab8.observer;

public class PlayerGigel extends Player{
	public PlayerGigel(String user){
		this.user = user;
	}

	@Override
	public void notifyUser() {
		System.out.println(user+" gets notification");
	}
}
