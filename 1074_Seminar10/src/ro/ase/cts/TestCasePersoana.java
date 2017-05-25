package ro.ase.cts;

import junit.framework.TestCase;

public class TestCasePersoana extends TestCase {

	//Test fixture
	Persoana persoana;
	
	public TestCasePersoana(String name) {
		super(name);
	}

	protected void setUp() throws Exception {
		super.setUp();
		persoana = new Persoana("Gigel", 22);
	}

	protected void tearDown() throws Exception {
		super.tearDown();	
	}
	
	public void test_Persoana_set_varsta_normale(){
		int valoare_asteptata = 23;
		persoana.setVarsta(valoare_asteptata);
		int valoare_obtinuta = persoana.getVarsta();
		assertEquals("Probleme la set varsta",valoare_asteptata,
				valoare_obtinuta);
	}
	
	public void test_Persoana_set_varsta_negativa(){
		int valoare_input = -23;
		try{
			persoana.setVarsta(valoare_input);
			fail("Nu este generata exceptie in set varsta");
		}
		catch(Exception e){
			assertTrue(true);
		}
	}

}
