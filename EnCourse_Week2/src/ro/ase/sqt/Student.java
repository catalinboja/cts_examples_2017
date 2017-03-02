package ro.ase.sqt;

import ro.ase.sqt.interfaces.IAccounting;

public class Student {
	String name;
	int age;
	
	//references to external interfaces
	IAccounting accountingDep;
	
	public void setAccountingRules(
			IAccounting acc){
		accountingDep = acc;
	}
	
	void payTuition() throws Exception{
		if(accountingDep!=null)
			accountingDep.payTuition();
		else
			throw new Exception();
	}
	void takeOOPExam(){ }
	void saveToDB(){ }

}
