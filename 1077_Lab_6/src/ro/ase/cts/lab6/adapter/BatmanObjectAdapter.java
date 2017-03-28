package ro.ase.cts.lab6.adapter;

import ro.ase.cts.lab6.disney.api.DisneyHeroInterface;
import ro.ase.cts.lab6.marvel.api.Batman;

public class BatmanObjectAdapter 
	implements DisneyHeroInterface{
	
	private Batman batman;
	
	public BatmanObjectAdapter(Batman superhero) {
		this.batman = superhero;
	}

	@Override
	public void move() {
		this.batman.superMove();
	}

	@Override
	public void jump() {
		this.batman.superJump();
	}

	@Override
	public void act() {
		this.batman.superAct();
	}

}
