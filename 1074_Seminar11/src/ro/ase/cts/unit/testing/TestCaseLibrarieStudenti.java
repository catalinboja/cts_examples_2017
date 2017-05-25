package ro.ase.cts.unit.testing;

import junit.framework.TestCase;

public class TestCaseLibrarieStudenti extends TestCase {

	public TestCaseLibrarieStudenti(String name) {
		super(name);
	}

	protected void setUp() throws Exception {
		super.setUp();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

	//test external reference
	public void test_salvareBD_external_reference_null(){
		LibrarieStudenti.conector =null;
		try{
			LibrarieStudenti.salvareBazaDate("gigel");
			fail("Lipsa exceptie - lipsa conector");
		}
		catch(ExceptieLibrarie e){
			assertTrue(true);
		}
		catch(Exception e){
			fail("Alta exceptie");
		}
	}
	
	//test RIGHT
	public void test_salvareBD_valori_normale(){
		int expected = 1;
		String input = "Gigel";
		//utilizare mock
		LibrarieStudenti.conector = 
				new MockConectorBD();
		try{
			int actual = 
					LibrarieStudenti.salvareBazaDate(input);
			assertEquals(expected, actual);
		}
		catch(Exception e){
			fail("Ceva nu este in ordine");
		}
	}
}
