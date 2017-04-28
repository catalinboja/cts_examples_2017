package ro.ase.cts.lab.strategy;

import java.util.ArrayList;
import java.util.Random;

public class UserDataApi {
	IExport strategy;
	String userName;
	ArrayList<Integer> data = 
			new ArrayList<>();
	
	public UserDataApi(String user){
		this.userName = user;
		Random rand = new Random();
		for(int i = 0;i<5;i++)
			data.add(rand.nextInt(1000));
	}
	
	public void setExportFormat(IExport format){
		this.strategy = format;
	}
	
	public void doTheExport(){
		if(strategy!=null)
			this.strategy.export(this.data);
		else
			throw new UnsupportedOperationException();
	}
	
}
