package ro.ase.cts.seminar7.flyweight;

public class FlyweightErou implements Flyweight{

	ModelSuperErou erou;
	
	public FlyweightErou(ModelSuperErou erou){
		this.erou = erou;
	}
	
	@Override
	public void afisareEcran(StareTemporaraEcran stare) {
		System.out.println("Batman de culoare "+
	stare.culoare+" se gaseste pe ecran la "+
				stare.x+","+stare.y);
	}

}
