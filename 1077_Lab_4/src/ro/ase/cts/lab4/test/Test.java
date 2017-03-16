package ro.ase.cts.lab4.test;

import java.util.Random;

import ro.ase.cts.lab4.factories.AbstractSuperHeroFactory;
import ro.ase.cts.lab4.factories.AndroidFactory;
import ro.ase.cts.lab4.factories.LinuxFactory;
import ro.ase.cts.lab4.factories.WindowsFactory;
import ro.ase.cts.lab4.superheroes.CaptainAmerica;
import ro.ase.cts.lab4.superheroes.IronMan;
import ro.ase.cts.lab4.superheroes.SuperHeroesType;

public class Test {

	public static void main(String[] args) {

		String platform = getPlatform();

		CaptainAmerica super1 = new CaptainAmerica(platform);
		IronMan super2 = new IronMan();
		// remember the To Do - possible to forget
		super2.init3DEngine(platform);
		
		//with the factory method pattern
		AbstractSuperHeroFactory factory= 
				getFactory(platform);
		CaptainAmerica ca = 
				(CaptainAmerica)factory.getSuperHero(
						SuperHeroesType.CAPTAIN_AMERICA);
		IronMan im = 
				(IronMan)factory.getSuperHero(
						SuperHeroesType.IRON_MAN);
		
		ca.move();
		im.move();
		
	}

	public static String getPlatform() {
		String[] platforms = { "Windows", "Android", "Linux" };
		Random rand = new Random();
		return platforms[rand.nextInt(3)];
	}
	
	//simple factory to create the needed superhero factory
	public static AbstractSuperHeroFactory getFactory(String platform){
		if(platform.equals("Windows"))
			return new WindowsFactory();
		if(platform.equals("Linux"))
			return new LinuxFactory();
		if(platform.equals("Android"))
			return new AndroidFactory();
		throw new IllegalArgumentException();
	}
}
