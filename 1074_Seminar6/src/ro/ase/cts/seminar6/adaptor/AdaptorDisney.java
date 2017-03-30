package ro.ase.cts.seminar6.adaptor;

import ro.ase.cts.seminar6.disney.IErouDisney;
import ro.ase.cts.seminar6.eroi.Batman;
import ro.ase.cts.seminar6.eroi.SuperErou;

public class AdaptorDisney extends Batman 
	implements IErouDisney{

	@Override
	public void merge() {
		this.superMerge();
	}

	@Override
	public void sare() {
		this.superSare();
	}

	@Override
	public void actioneaza() {
		this.superActiune();
	}
	
}
