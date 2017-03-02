package ro.ase.cts.lab1;

import ro.ase.cts.lab1.exceptions.IllegalTransferException;
import ro.ase.cts.lab1.exceptions.InsufficientFundsException;

public abstract class Account {
	public abstract void Deposit(Object value);
	public abstract void Withdraw(Object value) throws InsufficientFundsException;
	public abstract double getDeposit();
	public abstract void Transfer(
			Account destination,Object value) throws IllegalTransferException, InsufficientFundsException;
}
