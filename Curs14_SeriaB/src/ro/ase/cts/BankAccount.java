package ro.ase.cts;

public class BankAccount {
	double balance;
	double limit;
	double lowestBalance;
	String owner;	//min 3 caractere + fara cifre
	


	public BankAccount(double b, double l, double lb, String o){
		balance=b;
		limit=l;
		lowestBalance=lb;
		this.owner = o;
	}
	
	//Retrage bani
	public void withdraw(double amount){
			balance=balance-amount;
	}
	
	//Depozit
	public void deposit(double amount){
		//test functie externa
		LibrarieExterna.faCeva((int)amount);
		balance=balance+amount;
	}
	
	//Get the value of balance
	public double getBalance(){
		return balance;
	}
	
	public double getLimit() {
		return limit;
	}

	public void setLimit(double limit) {
		this.limit = limit;
	}
	
	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}
}
