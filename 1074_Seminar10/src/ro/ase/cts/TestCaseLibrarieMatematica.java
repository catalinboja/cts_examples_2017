package ro.ase.cts;

import junit.framework.TestCase;

public class TestCaseLibrarieMatematica extends TestCase {

	public TestCaseLibrarieMatematica(String name) {
		super(name);
	}

	protected void setUp() throws Exception {
		super.setUp();
		System.out.println("Pregatire unit test");
	}

	protected void tearDown() throws Exception {
		super.tearDown();
		System.out.println("Curatenie dupa unit test");
	}

	public void test_suma_valori_normale() throws ExceptieValoriEronate{
		int[] valori = {1,2,3};
		int valoare_asteptata = 6;
		int valoare_obtinuta = LibrarieMatematica.suma(valori);
		assertEquals(
				"Nu stim sa calculam suma elementelor",
				valoare_asteptata,valoare_obtinuta);
	}
	
	public void test_suma_null(){
		int[] valori = null;
		try{
			LibrarieMatematica.suma(valori);
			fail("Suma nu arunca exceptie pe null");
		}
		catch(ExceptieValoriEronate e){
			assertTrue(true);
		}
		catch(Exception e){
			fail("Suma arunca un alt tip de exceptie");
		}	
	}
	public void test_suma_zero_elemente() throws ExceptieValoriEronate{
		int[] valori = new int[0];
		int valoare_asteptata = 0;
		int valoare = LibrarieMatematica.suma(valori);
		assertEquals(valoare_asteptata,valoare);
	}
	
}
