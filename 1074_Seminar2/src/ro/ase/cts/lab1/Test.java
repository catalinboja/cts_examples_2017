package ro.ase.cts.lab1;

public class Test {

	public static void main(String[] args) {
		// Banker b1 = new Banker();
		// Banker b2 = new Banker();

		Banker b1 = Banker.getBanker();
		Banker b2 = Banker.getBanker();
		if (b1 == b2) {
			System.out.println("Identice !");
		}
	}
}
