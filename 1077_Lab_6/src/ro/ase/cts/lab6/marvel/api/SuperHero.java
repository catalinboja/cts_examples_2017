package ro.ase.cts.lab6.marvel.api;

public abstract class SuperHero {
	public String name;
	
	public SuperHero(String Name){
		this.name = Name;
	}
	
	public abstract void superMove();
	public abstract void superJump();
	public abstract void superAct();
}
