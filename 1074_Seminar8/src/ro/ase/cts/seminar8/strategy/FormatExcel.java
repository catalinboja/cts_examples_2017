package ro.ase.cts.seminar8.strategy;

import java.util.ArrayList;

public class FormatExcel implements StrategieFormatExport{

	@Override
	public void export(ArrayList<Integer> date) {
		System.out.println("Excel:");
		for(int valoare : date)
			System.out.print(valoare+";");
	}
	
}
