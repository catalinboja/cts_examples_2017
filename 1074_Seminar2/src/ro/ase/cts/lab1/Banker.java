package ro.ase.cts.lab1;

public class Banker {
	
	static private Banker self = null;
	private int nextId = 0;
	
	{
		System.out.println("Apelat inainte de fiecare constructor");
	}
	
	static{
		System.out.println("Clasa a fost incarcata");
	}
	
	public static Banker getBanker(){
		if(self==null)
			self = new Banker();
		return self;
	}
	
	private Banker(){
		
	}
	
	public BankAccount openAcount(String tip){
		if(tip.equals("CURRENT"))
			return new CurrentAccount(0, (++nextId)+"");
		else
			if(tip.equals("SAVINGS"))
				return new SavingsAccount((++nextId)+"");
			else
				throw new IllegalArgumentException();
		
	}
}
