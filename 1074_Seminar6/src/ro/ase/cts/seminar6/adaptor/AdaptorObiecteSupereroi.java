package ro.ase.cts.seminar6.adaptor;

import ro.ase.cts.seminar6.disney.IErouDisney;
import ro.ase.cts.seminar6.eroi.SuperErou;

public class AdaptorObiecteSupereroi 
	implements IErouDisney{
	SuperErou erou;
	
	public AdaptorObiecteSupereroi(SuperErou obj){
		this.erou = obj;
	}

	@Override
	public void merge() {
		this.erou.superMerge();
	}

	@Override
	public void sare() {
		this.erou.superSare();
	}

	@Override
	public void actioneaza() {
		this.erou.superActiune();
	}
}
