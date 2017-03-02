package ro.ase.sqt;

import ro.ase.sqt.interfaces.IAccounting;

public class Accounting2016 
implements IAccounting{

	@Override
	public void payTuition() {
		System.out.println("Pay the old way !");
	}

}
