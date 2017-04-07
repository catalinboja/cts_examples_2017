package ro.ase.cts.lab7.flyweight;

import java.util.HashMap;

public class FlyweightFactory {
	HashMap<String,SuperheroFlyweight> collection
		= new HashMap<>();
	
	public SuperheroFlyweight getSuperhero(String type){
		SuperheroFlyweight superhero = 
				collection.get(type);
		if(superhero == null){
			if(type.equals("Batman"))
			{
				System.out.println("Creating a Batman");
				superhero = new BatmanFlyweight();
				collection.put("Batman", superhero);
			}
		}
		return superhero;
		
	}
}
