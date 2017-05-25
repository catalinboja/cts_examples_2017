package ro.ase.cts.unit.testing.tests;

import junit.framework.TestCase;
import ro.ase.cts.unit.testing.MathLibrary;
import ro.ase.cts.unit.testing.NullArgumentException;

public class TestMath extends TestCase {

	public TestMath(String name) {
		super(name);
	}

	protected void setUp() throws Exception {
		super.setUp();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

	
	//unit test for sum
	public void test_sum_normal_values() throws NullArgumentException{
		Integer input_a = 2;
		Integer input_b = 10;
		int expected_value = 12;
		int actual_result = 
				MathLibrary.sum(input_a, input_b);
		//DO NOT USE IFs
		assertEquals("I don't know to add 2 numbers !",
				expected_value,actual_result);
		
	}
	
	public void test_sum_boundary_values(){
		Integer integer_a = 1;
		Integer integer_b = Integer.MAX_VALUE;
		try{

			MathLibrary.sum(integer_a, integer_b);
			fail("The sum function doesn't throw an exception");
		}
		catch(Exception e){
			assertTrue(true);
		}
	}
	
	public void test_sum_null_reference(){
		Integer integer_a = null;
		Integer integer_b = 10;
		try{

			MathLibrary.sum(integer_a, integer_b);
			fail("The sum function doesn't throw an exception");
		}
		catch(NullArgumentException e){
			assertTrue(true);
		}
		catch(Exception e){
			fail("We got a different exception");
		}
	}
	
	
}
