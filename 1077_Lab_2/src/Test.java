import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {

		System.out.println("Program started");
		Banker b1 = Banker.getUniqueObject();
		Banker b2 = Banker.getUniqueObject();
		if(b1 == b2)
			System.out.println("They are pointing to the same object !");
		
		ArrayList<BankAccount> list = new ArrayList<>();
		list.add(b1.openAccount("SAVINGS"));
		list.add(b2.openAccount("CURRENT"));
		for(BankAccount account : list){
			account.Deposit(100);
		}
		for(BankAccount account : list){
			System.out.println(account);
		}
	}

}
