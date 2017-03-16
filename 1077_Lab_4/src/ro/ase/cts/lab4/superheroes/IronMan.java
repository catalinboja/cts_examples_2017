package ro.ase.cts.lab4.superheroes;

public class IronMan implements ISuperhero{

	@Override
	public void move() {
		System.out.println("IronMan moves");
	}

	@Override
	public void display(int X, int Y) {
		System.out.println("IronMan at "+X+","+Y);
	}

	@Override
	public void init3DEngine(String engine) {
		System.out.println("IronMan generated by "+
				engine);
	}
	
	public IronMan(){
		//To Do: don't forget to call init3D after creating it
		System.out.println("Ironman created");
	}
	
}