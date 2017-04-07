package ro.ase.cts.lab7.flyweight;

public class BatmanFlyweight 
	extends SuperheroFlyweight  {
	
	//permanent state
	int height;
	String vehicle;
	
	public BatmanFlyweight(){
		height  = 185;
		vehicle = "BatMobil";
	}

	@Override
	public void display(CustomizedAtts atts) {
		System.out.println("Batman color is "+atts.color);
		System.out.println("Batman armor is "+atts.armor);
		System.out.println("Batman vehicle is "+this.vehicle);
	}

	@Override
	public void fight(CustomizedAtts atts) {
		System.out.println("Batman armor is "+atts.armor);
	}

}
