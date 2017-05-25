package ro.ase.cts.unit.testing;

public class MathLibrary {
	public static int minValue(int[] array) throws BadArgumentException{
		if(array.length == 0)
			throw new BadArgumentException();
		int min  = array[0];
		for(int value : array)
			if(min>value)
				min = value;
		return min;
	}
}
