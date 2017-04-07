package ro.ase.cts.seminar7.flyweight;

import java.util.HashMap;

public class FactorySuperEroi {
	HashMap<String,ModelSuperErou> colectie = 
			new HashMap<>();
	
	public ModelSuperErou get(String tip){
		ModelSuperErou erou = 
				colectie.get(tip);
		if(erou == null){
			if(tip.equals("Batman")){
				erou = new Batman();
				colectie.put("Batman", erou);
			}
		}
		return erou;
	}
}
