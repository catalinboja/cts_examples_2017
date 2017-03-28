package ro.ase.cts.lab6.decorator;

import ro.ase.cts.lab6.marvel.api.SuperHero;

public class MiddleExperiencedBatman 
	extends BatmanDecorator{

	public MiddleExperiencedBatman(SuperHero object) {
		super(object);
	}

	@Override
	public void superMove() {
		System.out.println(
				this.existingBatman.name +
		" is super moving");
	}

	@Override
	public void superJump() {
		this.existingBatman.superJump();
	}

	@Override
	public void superAct() {
		this.existingBatman.superAct();
	}
	
}
