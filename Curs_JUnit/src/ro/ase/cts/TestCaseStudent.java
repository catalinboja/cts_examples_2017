package ro.ase.cts;

import junit.framework.TestCase;

public class TestCaseStudent extends TestCase {

	//Test fixture
	Student stud;
	
	public TestCaseStudent(String name) {
		super(name);
	}

	protected void setUp() throws Exception {
		super.setUp();
		System.out.println("Hello");
		int[] note = {9,9,10};
		stud = new Student(21,note);
	}

	protected void tearDown() throws Exception {
		super.tearDown();
		stud = null;
		System.out.println("Bye");
	}
	
	//unit test pentru medie
	public void test_medie_valori_normale(){

		float expected = 9.33f;
		float actual = stud.medie();
		assertEquals(
				"Media nu este corecta",expected,actual,0.1);
	}
	
	public void test_set_varsta(){
		int expected = 21;
		stud.setVarsta(expected);
		int actual = stud.getVarsta();
		assertEquals("Set varsta!",expected,actual);
		
		
	}

}
