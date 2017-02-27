package ro.ase.cts.lab1;

import ro.ase.cts.lab1.exceptions.InsufficientFundsException;

public class CurrentAccount 
	extends BankAccount{
	
	public final static double MAX_CREDIT = 
			5000;
	
	public CurrentAccount(double balance,
			String id){
		super(balance,id);
	}

	@Override
	public void Deposit(Object value) {
		if(value instanceof Double)
			this.balance-=(double)value;
		else
			throw new ClassCastException();
	}

	@Override
	public void Withdraw(Object value) throws InsufficientFundsException {
		if(value instanceof Double){
			double valoare = (double)value;
			if((valoare+this.balance)<=MAX_CREDIT)
				this.balance+=valoare;
			else
				throw new InsufficientFundsException();
		}
		else
			throw new ClassCastException();
	}

	@Override
	public void Transfer(Account destination, Object value) {
		// TODO Auto-generated method stub
		
	}
}
