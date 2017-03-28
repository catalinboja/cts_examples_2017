package ro.ase.cts.lab6.adapter;

import ro.ase.cts.lab6.disney.api.DisneyHeroInterface;
import ro.ase.cts.lab6.marvel.api.Batman;

public class BatmanAdapter4Disney 
	extends Batman implements DisneyHeroInterface{

	@Override
	public void move() {
		this.superMove();
	}

	@Override
	public void jump() {
		this.superJump();
		
	}

	@Override
	public void act() {
		this.superAct();
	}

}
