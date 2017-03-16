package ro.ase.cts.lab4.factories;

import ro.ase.cts.lab4.superheroes.ISuperhero;
import ro.ase.cts.lab4.superheroes.SuperHeroesType;

public abstract class AbstractSuperHeroFactory {
	protected String engine;
	public AbstractSuperHeroFactory(String engineName){
		this.engine = engineName;
	}
	
	public abstract ISuperhero getSuperHero(SuperHeroesType type);
}
