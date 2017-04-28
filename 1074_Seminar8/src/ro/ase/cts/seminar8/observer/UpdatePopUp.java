package ro.ase.cts.seminar8.observer;

public class UpdatePopUp 
	implements ClientUpdate{

	@Override
	public void notificareUpdate(String versiune) {
		System.out.println(
				"Popup: versiune noua "+versiune);
	}

}
