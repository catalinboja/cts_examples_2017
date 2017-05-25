package ro.ase.cts.unit.testing;

public class MockConectorBD 
	implements InterfataConectorBDStudenti{

	@Override
	public boolean insertStudent(String nume) {
		return true;
	}

}
