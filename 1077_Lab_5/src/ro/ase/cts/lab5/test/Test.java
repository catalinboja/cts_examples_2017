package ro.ase.cts.lab5.test;

import ro.ase.cts.lab5.models.IArmor;
import ro.ase.cts.lab5.models.Superhero;
import ro.ase.cts.lab5.models.Superhero.SuperheroBuilder;

public class Test {

	public static void main(String[] args) {

		//choice 1
		//Superhero batman = new Superhero();
		//TO DO add some attributes
		//System.out.println(batman.getName());
		
		//choice 2
/*		Superhero batman2 = 
				new Superhero(
						"Batman",185,null,null,null,180,null);*/
		
		//choice - using a builder
/*		SuperheroBuilder builder = 
				new Superhero.SuperheroBuilder("Batman");
		
		Superhero batman = 
				builder.addHeight(185)
				.addXP(180)
				.build();*/
		
		Superhero spiderman = 
				new Superhero.SuperheroBuilder("Spiderman")
				.addHeight(185)
				.addXP(180)
				.addArmor(new IArmor() {
				})
				.build();
		
		
/*		System.out.println(batman.getName());
		//TO DO add some attributes
		builder.addHeight(185);
		batman = builder.build();*/
		

	}

}
