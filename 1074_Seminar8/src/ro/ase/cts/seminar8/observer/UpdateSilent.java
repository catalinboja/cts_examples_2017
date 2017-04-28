package ro.ase.cts.seminar8.observer;

public class UpdateSilent 
	implements ClientUpdate{

	@Override
	public void notificareUpdate(String versiune) {
		System.out.println(
				"Updated to "+versiune);
	}

}
