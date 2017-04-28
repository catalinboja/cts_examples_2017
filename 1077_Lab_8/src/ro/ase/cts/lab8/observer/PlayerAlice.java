package ro.ase.cts.lab8.observer;

public class PlayerAlice extends Player{

	@Override
	public void notifyUser() {
		System.out.println("Alice has been notified");
	}
	
}
