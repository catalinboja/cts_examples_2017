package ro.ase.cts.lab7.composite;

public class BadGuy extends AbstractComponent{

	@Override
	public void move() {
		System.out.println(
				"The bad guys moves on the screen");
	}

	@Override
	public void fight() {
		System.out.println("The bad guy is attacking the hero");
	}
	
}
