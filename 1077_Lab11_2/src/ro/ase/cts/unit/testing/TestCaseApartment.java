package ro.ase.cts.unit.testing;

import junit.framework.TestCase;

public class TestCaseApartment extends TestCase {

	//test fixture
	Apartment ap;
	
	public TestCaseApartment(String name) {
		super(name);
	}

	protected void setUp() throws Exception {
		super.setUp();
		ap = new Apartment(
				12, "Calea Dorobanti");
	}

	protected void tearDown() throws Exception {
		super.tearDown();
		ap = null;
	}

	//unit tests for setApartment
	public void test_setNumber_normal_values() throws BadArgumentException{

		Integer input_value = 22;
		ap.setNumber(input_value);
		assertEquals("Problems in set number !",
				input_value, ap.getNumber());
	}
	
	public void test_setNumber_min_boundary(){

		Integer input_value = 1;
		try{
			ap.setNumber(input_value);
			assertEquals("Problems in set number !",
					input_value, ap.getNumber());
		}
		catch(Exception e){
			fail("Is not working for number = 1");
		}
	}
	
	public void test_setNumber_max_boundary(){

		Integer input_value = 200;
		try{
			ap.setNumber(input_value);
			assertEquals("Problems in set number !",
					input_value, ap.getNumber());
		}
		catch(Exception e){
			fail("Is not working for number = 200");
		}
	}
	
	public void test_setNumber_less_min_boundary(){

		Integer input_value = -2;
		try{
			ap.setNumber(input_value);
			fail("It is not throwing an exception for -2");
		}
		catch(BadArgumentException e){
			assertTrue(true);
		}
		catch(Exception e){
			fail("Wrong exception type");
		}
	}
	
	public void test_setNumber_greater_max_boundary(){

		Integer input_value = 201;
		try{
			ap.setNumber(input_value);
			fail("It is not throwing an exception for 201");
		}
		catch(BadArgumentException e){
			assertTrue(true);
		}
		catch(Exception e){
			fail("Wrong exception type");
		}
	}
	
	public void test_setAddress_null(){

		String new_address = null;
		try{
			ap.setAddress(new_address);
			fail("It is not throwing an exception for null");
		}
		catch(BadArgumentException e){
			assertTrue(true);
		}
		catch(Exception e){
			fail("Wrong exception type");
		}
	}
	
	public void test_setNumber_inverse_relation() throws BadArgumentException{
		int input_value = 45;
		int initial_value = ap.getNumber(); //it is 12
		ap.setNumber(input_value);
		assertNotSame("Set in not OK", initial_value, ap.getNumber());
		
		
	}
	
}
