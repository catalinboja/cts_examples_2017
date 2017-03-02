
public class Banker {
	
	private static Banker self = null;
	
	private static int NEXT_ID = 0;
	private static final String BANK = "BCR";
	
	private Banker(){
		
	}
	
	public BankAccount openAccount(String type){
		if(type.equals("SAVINGS")){
			NEXT_ID++;
			return new SavingsAccount(BANK+NEXT_ID);
		}
		if(type.equals("CURRENT")){
			NEXT_ID++;
			return new CurrentAccount(BANK+NEXT_ID);
		}
		throw new IllegalArgumentException("Wrong type");
	}
	
	public static Banker getUniqueObject(){
		if(self == null)
			self = new Banker();
		return self;
	}
	
	{
		System.out.println("Static constructor");
	}
	
	static{
		System.out.println("Class loaded");
	}
}
