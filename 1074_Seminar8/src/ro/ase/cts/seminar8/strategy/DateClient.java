package ro.ase.cts.seminar8.strategy;

import java.util.ArrayList;
import java.util.Random;

public class DateClient {
	ArrayList<Integer> date = 
			new ArrayList<>();
	StrategieFormatExport strategie;
	
	public DateClient(){
		Random rand = new Random();
		for(int i=0;i<5;i++)
			date.add(rand.nextInt(1000));
	}
	
	public void setFormat(
			StrategieFormatExport format){
		this.strategie = format;
	}
	
	public void exportDate(){
		if(this.strategie!=null)
			this.strategie.export(date);
		else
			throw new UnsupportedOperationException();
	}
}
