package ro.ase.cts.lab7.test;

import java.util.ArrayList;

import ro.ase.cts.lab7.composite.BadGuy;
import ro.ase.cts.lab7.composite.Group;
import ro.ase.cts.lab7.flyweight.CustomizedAtts;
import ro.ase.cts.lab7.flyweight.FlyweightFactory;
import ro.ase.cts.lab7.flyweight.SuperheroFlyweight;

public class Test {

	public static void main(String[] args) {

		//build the bad guys army
		BadGuy bad1 = new BadGuy();
		BadGuy bad2 = new BadGuy();
		Group smallBoss = new Group();
		smallBoss.addSubcomponents(bad1);
		smallBoss.addSubcomponents(bad2);
		Group mediumBoss = new Group();
		mediumBoss.addSubcomponents(smallBoss);
		mediumBoss.addSubcomponents(new BadGuy());
		
		Group superBoss = new Group();
		superBoss.addSubcomponents(mediumBoss);
		superBoss.addSubcomponents(new BadGuy());
		superBoss.addSubcomponents(new BadGuy());
		
		superBoss.move();
		superBoss.fight();
		
		FlyweightFactory factory = 
				new FlyweightFactory();
		
		ArrayList<SuperheroFlyweight> playersHeroes = 
				new ArrayList<>();
		ArrayList<CustomizedAtts> playerSettings = 
				new ArrayList<>();
		
		//add 1 player
		playersHeroes.add(factory.getSuperhero("Batman"));
		CustomizedAtts player1Settings = 
				new CustomizedAtts();
		player1Settings.color = "Red";
		player1Settings.armor = "Normal armor";
		playerSettings.add(player1Settings);
		
		//add 2nd player
		playersHeroes.add(factory.getSuperhero("Batman"));
		CustomizedAtts player2Settings = 
				new CustomizedAtts();
		player2Settings.color = "Blue";
		player2Settings.armor = "Super armor";
		playerSettings.add(player2Settings);
		
		playersHeroes.get(0).display(playerSettings.get(0));
		playersHeroes.get(1).display(playerSettings.get(1));
		
	}

}
