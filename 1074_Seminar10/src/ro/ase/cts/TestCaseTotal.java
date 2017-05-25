package ro.ase.cts;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class TestCaseTotal extends TestCase {

	public TestCaseTotal(String name) {
		super(name);
	}

	protected void setUp() throws Exception {
		super.setUp();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

	public static Test suite(){
		TestSuite colectie = new TestSuite();
		colectie.addTestSuite(TestCasePersoana.class);
		colectie.addTest(new TestCaseLibrarieMatematica("test_suma_null"));
		
		
		return colectie;
	}
	
}
