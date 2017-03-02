

public abstract class BankAccount 
extends Account{
	double balance;
	final String id; 
	
	public BankAccount(double Balance, 
			String Id){
		this.balance = Balance;
		this.id = Id;
	}
	
	//override the base class
	@Override
	public double getBalance(){
		return this.balance;
	}
	
	
}
