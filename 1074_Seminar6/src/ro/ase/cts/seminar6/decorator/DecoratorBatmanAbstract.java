package ro.ase.cts.seminar6.decorator;

import ro.ase.cts.seminar6.eroi.Batman;
import ro.ase.cts.seminar6.eroi.SuperErou;

public abstract class DecoratorBatmanAbstract 
extends SuperErou{

	Batman batman;
	
	public DecoratorBatmanAbstract(Batman obj) {
		super("Batman");
		this.batman = obj;
	}

}
