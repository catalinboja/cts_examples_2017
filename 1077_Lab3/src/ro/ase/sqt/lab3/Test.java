package ro.ase.sqt.lab3;

import java.util.ArrayList;

import ro.ase.sqt.lab3.singleton.factory.Batman;
import ro.ase.sqt.lab3.singleton.factory.Spiderman;
import ro.ase.sqt.lab3.singleton.factory.SuperHeroFactory;
import ro.ase.sqt.lab3.singleton.factory.SuperHeroInterface;
import ro.ase.sqt.lab3.singleton.factory.SuperHeroTypes;

public class Test {

	public static void main(String[] args) {
		ModuleGameStage gameStage = 
				new ModuleGameStage();
		ModuleSuperHeroAtt superHeroAtt1 = 
				new ModuleSuperHeroAtt();
		ModuleSuperHeroAtt superHeroAtt2 = 
				new ModuleSuperHeroAtt();
		ModuleSuperHeroAtt superHeroAtt3 = 
				new ModuleSuperHeroAtt();
		
		Batman batman = 
				new Batman("Phaser");
		Spiderman spiderman = 
				new Spiderman();
		batman.drives();
		spiderman.jump();
		
		ArrayList<SuperHeroInterface> superHeroes =
				new ArrayList<>();
		superHeroes.add(
				SuperHeroFactory.getSuperHero(
						SuperHeroTypes.SPIDERMAN));
		superHeroes.add(SuperHeroFactory.getSuperHero(
				SuperHeroTypes.BATMAN));
		for(SuperHeroInterface hero : superHeroes)
			hero.move();
		
		
		
	}

}
