package ro.ase.cts.lab.strategy;

import java.util.List;

public class ExportExcel implements IExport{

	@Override
	public void export(List<Integer> data) {
		System.out.println("Exporting to Excel...");
		for(Integer value : data){
			System.out.print(value+ " ");
		}
	}

}
