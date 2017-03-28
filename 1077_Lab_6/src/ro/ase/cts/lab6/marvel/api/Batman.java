package ro.ase.cts.lab6.marvel.api;

public class Batman extends SuperHero{

	public Batman() {
		super("Batman");
	}

	@Override
	public void superMove() {
		System.out.println(this.name + " is moving");
	}

	@Override
	public void superJump() {
		System.out.println(this.name + " is jumping");
	}

	@Override
	public void superAct() {
		System.out.println(this.name + " is fighting the bad guys");
	}

}
