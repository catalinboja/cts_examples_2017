package ro.ase.cts.factory;

public class GeneratorPlatforma {
	public static AbstractFactory getFactory(String platforma){
		switch (platforma) {
		case "Windows":
			return new WindowsFactory();
		case "Android":
			return new AndroidFactory();
		default:
			throw new IllegalArgumentException();
		}
	}
}
