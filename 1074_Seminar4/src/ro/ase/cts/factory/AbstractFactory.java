package ro.ase.cts.factory;

import ro.ase.cts.supereroi.SuperErou;

public abstract class AbstractFactory {
	public abstract SuperErou getSupererou(
			TipSuperou tip);
}
