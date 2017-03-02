package ro.ase.cts;

public class Test {

	public static void main(String[] args) throws Exception {
		Student s = new Student();
		s.setContabilitate(new ReguliContabilitate2016());
		try {
			s.platesteTaxa();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		s.setContabilitate(new Contabilitate() {
			
			@Override
			public void platesteTaxa() {
				System.out.println("Plateste taxa in 2017");
			}
		});
		s.platesteTaxa();
	}

}
