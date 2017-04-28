package ro.ase.cts.seminar8.strategy;

import java.util.ArrayList;

public class FormatCSV implements StrategieFormatExport{

	@Override
	public void export(ArrayList<Integer> date) {
		System.out.println("CSV:");
		for(int valoare : date)
			System.out.print(valoare+",");
	}

}
