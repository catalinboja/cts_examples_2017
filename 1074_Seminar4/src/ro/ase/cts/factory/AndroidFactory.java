package ro.ase.cts.factory;

import ro.ase.cts.supereroi.Batman;
import ro.ase.cts.supereroi.SuperErou;
import ro.ase.cts.supereroi.Superman;

public class AndroidFactory extends AbstractFactory{
	public final static String ENGINE = "Unity";
	@Override
	public SuperErou getSupererou(TipSuperou tip) {
		switch (tip) {
		case BATMAN:
			return new Batman(ENGINE);
		case SUPERMAN:
			SuperErou superman = new Superman();
			superman.setEngine(ENGINE);
			return superman;

		default:
			throw new IllegalArgumentException();
		}
	}
}
