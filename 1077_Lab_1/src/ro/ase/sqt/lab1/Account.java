package ro.ase.sqt.lab1;

import ro.ase.sqt.lab1.exceptions.InssuficientFundsException;

public abstract class Account {
	public abstract void Withdraw(double amount) throws InssuficientFundsException;
	public abstract void Deposit(double amount);
	public abstract void Transfer(
			Account destination,double amount);
	public abstract double getBalance();
}
