package ro.ase.cts.unit.testing;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class TestToate extends TestCase {

	public TestToate(String name) {
		super(name);
	}

	protected void setUp() throws Exception {
		super.setUp();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}
	
	public static Test suite(){
		TestSuite colectie = 
				new TestSuite();
		
		colectie.addTestSuite(
				TestCaseLibrarieStudenti.class);
		colectie.addTest(
				new TestCaseLibrarieMatematica("test_min_inverse"));
		
		return colectie;
	}

}
