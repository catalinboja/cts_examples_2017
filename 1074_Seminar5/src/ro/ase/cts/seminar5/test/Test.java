package ro.ase.cts.seminar5.test;

import ro.ase.cts.seminar5.builder.DirectorBatman;
import ro.ase.cts.seminar5.builder.SuperErouGeneric;

public class Test {

	public static void main(String[] args) {
		SuperErouGeneric superErou =
				new SuperErouGeneric(
						"Invulnerabil", 
						"Batman", 
						"Pistol", 
						70, 
						70, 
						null, 
						null);
		
		SuperErouGeneric superErou2 = 
				new SuperErouGeneric.BuilderSuperErou("Superman")
				.addArma("Pistol")
				.addGreutate(70)
				.addVarsta(70)
				.addSuperPutere("Nemuritor")
				.build();
		
		DirectorBatman generator = 
				new DirectorBatman(
						new SuperErouGeneric
						.BuilderSuperErou("Batman"));
		SuperErouGeneric batman = 
				generator.construieste();
		
		SuperErouGeneric batmanCopie = 
				(SuperErouGeneric) batman.clone();
	}

}
