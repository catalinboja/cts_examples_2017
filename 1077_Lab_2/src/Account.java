

public abstract class Account {
	public abstract void Withdraw(double amount) throws InssuficientFundsException;
	public abstract void Deposit(double amount);
	public abstract void Transfer(
			Account destination,double amount) throws IllegalTransferException, InssuficientFundsException;
	public abstract double getBalance();
}
