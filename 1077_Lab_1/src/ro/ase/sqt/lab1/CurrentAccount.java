package ro.ase.sqt.lab1;

import ro.ase.sqt.lab1.exceptions.InssuficientFundsException;

public class CurrentAccount extends BankAccount{

	public static final double MAX_CREDIT = 5000;
	
	public CurrentAccount(String id) {
		super(0,id);
	}

	@Override
	public void Withdraw(double amount) 
			throws InssuficientFundsException {
		if(this.balance+amount <= MAX_CREDIT)
			this.balance+=amount;
		else
			throw new InssuficientFundsException();
	}

	@Override
	public void Deposit(double amount) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Transfer(Account destination, double amount) {
		// TODO Auto-generated method stub
		
	}
}
