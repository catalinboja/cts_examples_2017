package ro.ase.sqt.lab3.singleton.factory;

public class Batman implements SuperHeroInterface{
	
	public Batman(String weapon){
		System.out.println("Initial weapon: "
				+ weapon);
	}
	public void drives(){
		System.out.println(
				"Batman drives the BatMobil in Gotham");
	}
	@Override
	public void move() {
		this.drives();
	}
}
