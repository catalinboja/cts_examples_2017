package ro.ase.cts.unit.testing;

import junit.framework.TestCase;

public class TestCaseMath extends TestCase {

	public TestCaseMath(String name) {
		super(name);
	}

	protected void setUp() throws Exception {
		super.setUp();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}
	
	public void test_min_correct() throws BadArgumentException{
		int[] array = {2,6,7,4};
		int expected_value = 2;
		int actual_value = MathLibrary.minValue(array);
		assertEquals(expected_value, actual_value);
	}
	
	public void test_min_zero_cardinality(){
		int[] array = new int[0];
		try{
			MathLibrary.minValue(array);
			fail("You have a problem");
		}
		catch(BadArgumentException e){
			assertTrue(true);
		}
		catch(Exception e){
			fail("You have another problem");
		}
		
	}

}
