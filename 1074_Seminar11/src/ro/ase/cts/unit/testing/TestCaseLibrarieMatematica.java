package ro.ase.cts.unit.testing;

import java.util.ArrayList;
import java.util.Random;

import junit.framework.TestCase;

public class TestCaseLibrarieMatematica extends TestCase {

	public TestCaseLibrarieMatematica(String name) {
		super(name);
	}

	protected void setUp() throws Exception {
		super.setUp();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}
	
	//test RIGHT
	public void test_min_valori_normale() throws ExceptieLibrarie{
		int[] valori = {3,6,1,8};
		int expected = 1;
		int actual = LibrarieMatematica.min(valori);
		assertEquals(expected, actual);
	}
	
	//test Existence
	public void test_min_null(){
		int[] valori = null;
		try{
			LibrarieMatematica.min(valori);
			fail("Nu arunca exceptie");
		}
		catch(ExceptieLibrarie e){
			assertTrue(true);
		}
		catch(Exception e){
			fail("Se arunca o alta exceptie");
		}
	}
	
	//test Ordering
	public void test_min_ordering() throws ExceptieLibrarie{
		int[] valori = {9,8,7,6,5,-1,-2,-5};
		int expected = -5;
		int actual = LibrarieMatematica.min(valori);
		assertEquals(expected, actual);
	}
	
	//test Cardinalitate
	public void test_min_cardinalitate_zero(){
		int[] valori = new int[0];
		try{
			LibrarieMatematica.min(valori);
			fail("Nu arunca exceptie");
		}
		catch(ExceptieLibrarie e){
			assertTrue(true);
		}
		catch(Exception e){
			fail("Alta exceptie");
		}
	}
	
	//test Cardinalitate
	public void test_min_cardinalitate_unu(){
		int[] valori = {1};
		try{
			
			long t0 = System.currentTimeMillis();
			int expected = 1;
			int actual = LibrarieMatematica.min(valori);
			assertEquals(expected, actual);
		}
		catch(Exception e){
			fail("O exceptie");
		}
	}
	
	//test Time/Performance
	public void test_min_performanta() throws ExceptieLibrarie{
		
		final int NR_VALORI = 10000;
		Random rand = new Random();
		int[] valori = new int[NR_VALORI];
		for(int i=0;i<NR_VALORI;i++){
			valori[i] = rand.nextInt(100000);
		}
		long t0 = System.currentTimeMillis();
		LibrarieMatematica.min(valori);
		long t1 = System.currentTimeMillis();
		
		if(t1-t0>1000)
			fail("Dureaza prea mult");
		else
			assertTrue(true);
		
		ArrayList<Integer> test = new ArrayList<>();
		
	}
	
	//test de Inverse-relationship
	public void test_min_inverse() throws ExceptieLibrarie{
		int[] valori = {6,5,4,3,2,1};
		int expected = 6;
		int actual = LibrarieMatematica.min(valori);
		assertNotSame(expected, actual);
	}

}
