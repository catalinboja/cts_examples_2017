package ro.ase.cts.lab4.factories;

import ro.ase.cts.lab4.superheroes.CaptainAmerica;
import ro.ase.cts.lab4.superheroes.ISuperhero;
import ro.ase.cts.lab4.superheroes.IronMan;
import ro.ase.cts.lab4.superheroes.SuperHeroesType;

public class WindowsFactory extends AbstractSuperHeroFactory {

	public WindowsFactory() {
		super("Windows");
	}

	@Override
	public ISuperhero getSuperHero(SuperHeroesType type) {
		switch(type){
		case IRON_MAN:
		{
			IronMan superhero = new IronMan();
			superhero.init3DEngine(this.engine);
			return superhero;
		}
		case CAPTAIN_AMERICA:
		{
			return new CaptainAmerica(this.engine);
		}
		default:
			throw new IllegalArgumentException();
		}
	}

	
}
