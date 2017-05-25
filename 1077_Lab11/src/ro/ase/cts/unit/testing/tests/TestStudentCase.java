package ro.ase.cts.unit.testing.tests;

import junit.framework.TestCase;
import ro.ase.cts.unit.testing.Student;

public class TestStudentCase extends TestCase {

	//test fixture
	Student stud;
	
	public TestStudentCase(String name) {
		super(name);
	}

	protected void setUp() throws Exception {
		super.setUp();
		stud = new Student(22);
	}

	protected void tearDown() throws Exception {
		super.tearDown();
		stud = null;
	}
	
	//unit test the set age function
	public void test_student_setAge_normal_values(){
		int input_value = 21;
		stud.setAge(input_value);
		assertEquals("SetAge doesn't work",
				input_value, stud.getAge());
	}
	
	public void test_student_setAge_boundary(){
		
		int input_value = 100;
		try{
			stud.setAge(input_value);
			fail("Is not generating an exception !");
		}
		catch(Exception e){
			assertTrue(true);
		}
	}
	
	public void test_student_setAge_existence(){
		Integer input_value = null;
		try{
			stud.setAge(input_value);
			fail("Is not generating an exception for null!");
		}
		catch(IllegalArgumentException e){
			assertTrue(true);
		}
		catch(Exception e){
			fail("You didn't check for null");
		}
	}

}