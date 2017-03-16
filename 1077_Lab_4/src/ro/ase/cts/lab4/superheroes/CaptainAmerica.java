package ro.ase.cts.lab4.superheroes;

public class CaptainAmerica implements ISuperhero{

	public final String name = 
			"Captain America";
	
	@Override
	public void move() {
		System.out.println(this.name +
				" moves on the scree");
	}

	@Override
	public void display(int X, int Y) {
		System.out.println(this.name +
				" it at "+X+", "+Y);
	}

	@Override
	public void init3DEngine(String engine) {
		System.out.println(this.name +
				" generated using "+engine);
	}
	
	public CaptainAmerica(String engineName){
		this.init3DEngine(engineName);
	}

}
