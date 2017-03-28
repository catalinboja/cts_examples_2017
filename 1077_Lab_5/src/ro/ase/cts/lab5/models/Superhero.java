package ro.ase.cts.lab5.models;

public class Superhero implements Cloneable{
	
	String name;
	int height;
	ISuperpower superPower;
	IWeapon weapon;
	IVehicle vehicle;
	int experience;
	IArmor armor;
	
	private Superhero(){
		System.out.println(
				"Buildind a default Superhero...");
/*		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Done.");*/
	}
	
	
	private Superhero(String name, 
			int heigth, 
			ISuperpower superPower, 
			IWeapon weapon, 
			IVehicle vehicle, 
			int experience,
			IArmor armor) {
		super();
		this.name = name;
		this.height = heigth;
		this.superPower = superPower;
		this.weapon = weapon;
		this.vehicle = vehicle;
		this.experience = experience;
		this.armor = armor;
		
		System.out.println(
				"Buildind a Superhero...");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Done.");
	}


	//override clone for deep-copy
	@Override
	public Object clone(){
		Superhero copy = new Superhero();
		//copy the attributes
		copy.setArmor(this.armor);
		copy.setWeapon(weapon);
		
		return copy;
	}

	public String getName() {
		return name;
	}
	private void setName(String name) {
		this.name = name;
	}
	public int getHeight() {
		return height;
	}
	private void setHeight(int height) {
		this.height = height;
	}
	public ISuperpower getSuperPower() {
		return superPower;
	}
	private void setSuperPower(ISuperpower superPower) {
		this.superPower = superPower;
	}
	public IWeapon getWeapon() {
		return weapon;
	}
	private void setWeapon(IWeapon weapon) {
		this.weapon = weapon;
	}
	public IVehicle getVehicle() {
		return vehicle;
	}
	private void setVehicle(IVehicle vehicle) {
		this.vehicle = vehicle;
	}
	public int getExperience() {
		return experience;
	}
	private void setExperience(int experience) {
		this.experience = experience;
	}
	public IArmor getArmor() {
		return armor;
	}
	private void setArmor(IArmor armor) {
		this.armor = armor;
	}

	public static class SuperheroBuilder{
		private Superhero superhero = null;
		
		public SuperheroBuilder(String name){
			superhero = new Superhero();
			superhero.setName(name);
		}
		
		public Superhero build(){
			return this.superhero;
		}
		
		public SuperheroBuilder addHeight(int height){
			this.superhero.setHeight(height);
			return this;
		}
		public SuperheroBuilder addXP(int experience){
			this.superhero.setExperience(experience);
			return this;
		}
		public SuperheroBuilder addArmor(IArmor armor){
			this.superhero.armor = armor;
			return this;
		}
		public SuperheroBuilder addSuperpower(ISuperpower power){
			this.superhero.superPower = power;
			return this;
		}
		public SuperheroBuilder addVehicle(IVehicle vehicle){
			this.superhero.vehicle = vehicle;
			return this;
		}
		public SuperheroBuilder addWeapon(IWeapon weapon){
			this.superhero.weapon = weapon;
			return this;
		}
		

		
	}
	
}
