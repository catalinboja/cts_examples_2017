package ro.ase.sqt;

import ro.ase.sqt.interfaces.IAccounting;

public class Test {

	public static void main(String[] args) {
		Student s1 = 
				new Student();
		s1.setAccountingRules(new Accounting2016() );
		
		
		try {
			s1.payTuition();
			s1.setAccountingRules(new IAccounting() {
				
				@Override
				public void payTuition() {
					System.out.println("Pay the 2017 way !");
					
				}
			});
			s1.payTuition();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
