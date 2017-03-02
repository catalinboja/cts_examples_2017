package ro.ase.cts.lab1;

public abstract class BankAccount 
	extends Account{

	double balance;
	final String id;
	
	public BankAccount(double Balance,
			String id){
		balance = Balance;
		this.id= id;
	}
	

	@Override
	public double getDeposit(){
		return this.balance;
	}
}
