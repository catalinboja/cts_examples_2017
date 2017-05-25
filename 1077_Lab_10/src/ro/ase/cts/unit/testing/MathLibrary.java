package ro.ase.cts.unit.testing;

public class MathLibrary {
	static public int sum(Integer a, Integer b) throws NullArgumentException{
		if(b == Integer.MAX_VALUE)
			throw new IllegalArgumentException();
		if(a == null)
			throw new NullArgumentException();
		return a+b;
	}
	
	static public float average(int[] values){
		int result = values[0];
		for(int i=0;i<values.length;i++)
			result += values[i];
		return result/values.length;
	}
}
