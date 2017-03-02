
public class SavingsAccount 
extends BankAccount
implements Profitable{
	
	public final static double MIN_AMOUNT = 100;
	
	public SavingsAccount(String Id) {
		super(MIN_AMOUNT, Id);
		
	}

	@Override
	public void Withdraw(double amount) throws InssuficientFundsException {
		if(this.balance-amount<MIN_AMOUNT)
			throw new InssuficientFundsException();
		else
			this.balance=-amount;
	}

	@Override
	public void Deposit(double amount) {
		this.balance+=amount;
	}

	@Override
	public void Transfer(Account destination, double amount) 
			throws IllegalTransferException, InssuficientFundsException {
		if(this==destination)
			throw new IllegalTransferException("The same account");
		else{
			this.Withdraw(amount);
			destination.Deposit(amount);
		}
	}

	@Override
	public void addInterest(double rate) throws Exception {
		if(rate >0 && rate <=1)
			this.balance*=(1+rate);
		else
			throw new Exception();
	}
	
}
