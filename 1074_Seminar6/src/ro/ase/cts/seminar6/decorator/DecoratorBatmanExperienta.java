package ro.ase.cts.seminar6.decorator;

import ro.ase.cts.seminar6.eroi.Batman;

public class DecoratorBatmanExperienta 
	extends DecoratorBatmanAbstract{

	public int experienta = 100;
	
	public DecoratorBatmanExperienta(Batman obj) {
		super(obj);
	}

	@Override
	public void superMerge() {
		this.batman.superMerge();
	}

	@Override
	public void superSare() {
		this.batman.superSare();
	}

	@Override
	public void superActiune() {
		this.batman.superActiune();
		System.out.println(" si salveaza printesa");
	}

}
