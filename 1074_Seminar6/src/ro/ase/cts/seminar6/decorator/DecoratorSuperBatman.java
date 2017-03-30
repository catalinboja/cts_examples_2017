package ro.ase.cts.seminar6.decorator;

import ro.ase.cts.seminar6.eroi.Batman;

public class DecoratorSuperBatman 
	extends DecoratorBatmanAbstract{

	public DecoratorSuperBatman(Batman obj) {
		super(obj);
	}

	@Override
	public void superMerge() {
		System.out.println("Batman super alearga");
	}

	@Override
	public void superSare() {
		System.out.println("Batman super sare");
	}

	@Override
	public void superActiune() {
		System.out.println("Batman super actiune");
	}
	

}
