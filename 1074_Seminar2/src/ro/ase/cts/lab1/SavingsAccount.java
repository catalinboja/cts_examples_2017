package ro.ase.cts.lab1;

import ro.ase.cts.lab1.exceptions.IllegalTransferException;
import ro.ase.cts.lab1.exceptions.InsufficientFundsException;

public class SavingsAccount 
	extends BankAccount
	implements Profitable{

	public static final double MIN_BAlANCE = 100;
	
	public SavingsAccount(String id) {
		super(MIN_BAlANCE, id);
	}

	@Override
	public void Deposit(Object value) {
		if(value instanceof Double)
			this.balance+=(double)value;
		else
			throw new ClassCastException();
	}

	@Override
	public void Withdraw(Object value) throws InsufficientFundsException {
		if(value instanceof Double){
			double valoare = (double)value;
			if((balance-valoare)<MIN_BAlANCE)
				throw new InsufficientFundsException();
			else {
				this.balance-=valoare;
			}
		}
	}

	@Override
	public void Transfer(Account destination, Object value)
			throws IllegalTransferException, InsufficientFundsException {
		if(value instanceof Double){
			if(this == destination)
				throw new IllegalTransferException("Conturi identice");
			else
			{
				this.Withdraw(value);
				destination.Deposit(value);
			}
		}
	}

	@Override
	public void addInterest(double interest) {
		this.balance*=(1+interest);
	}

}
