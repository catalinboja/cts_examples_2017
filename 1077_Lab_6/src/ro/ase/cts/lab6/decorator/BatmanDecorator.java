package ro.ase.cts.lab6.decorator;

import ro.ase.cts.lab6.marvel.api.SuperHero;

public abstract class BatmanDecorator extends SuperHero{
	SuperHero existingBatman;
	
	public BatmanDecorator(SuperHero object){
		super("Batman");
		existingBatman = object;
	}
}
