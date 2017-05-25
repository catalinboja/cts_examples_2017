package ro.ase.cts;

import junit.framework.TestCase;

public class TestCaseBankAccount extends TestCase {

	public TestCaseBankAccount(String name) {
		super(name);
	}

	protected void setUp() throws Exception {
		super.setUp();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}
	
	public void test_setOwner_valori_normale(){
		BankAccount cont = new BankAccount(1000, 10, 10000, "Ion");
		String input = "Gigel";
		String actual = null;
		cont.setOwner(input);
		actual = cont.getOwner();
		assertEquals(input, actual);
		
	}
	public void test_setOwner_valori_range_sub3(){
		BankAccount cont = new BankAccount(1000, 10, 10000, "Ion");
		String input = "AA";
		String actual = null;
		try{
		cont.setOwner(input);
		fail("Nu arunca exceptie");
		}
		catch(Exception e)
		{
			assertTrue(true);
		}
		
	}
}
