package ro.ase.cts.unit.testing;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class TestSuiteExample extends TestCase {

	protected void setUp() throws Exception {
		super.setUp();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

	public static Test suite(){
		TestSuite newSuite = 
				new TestSuite();
		newSuite.addTestSuite(TestCaseMath.class);
		
		newSuite.addTest(
				new TestCaseApartment("test_setNumber_inverse_relation"));
		newSuite.addTest(
				new TestCaseApartment("test_setNumber_greater_max_boundary"));
		
		return newSuite;
	}
	
	
	
}
