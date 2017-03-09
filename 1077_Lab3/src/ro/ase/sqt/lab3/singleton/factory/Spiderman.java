package ro.ase.sqt.lab3.singleton.factory;

public class Spiderman 
implements SuperHeroInterface{
	public void jump(){
		System.out.println(
				"Spderman jumps from building to building");
	}

	@Override
	public void move() {
		this.jump();
	}
}
