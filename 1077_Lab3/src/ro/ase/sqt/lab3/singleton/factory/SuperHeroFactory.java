package ro.ase.sqt.lab3.singleton.factory;

public class SuperHeroFactory {
	//factory meythod
	public static SuperHeroInterface getSuperHero(
			SuperHeroTypes type){
		switch(type){
		case BATMAN:
			return new Batman("Laser");
		case SPIDERMAN:
			return new Spiderman();
		default:
			throw new IllegalArgumentException();
		}
	}
}
