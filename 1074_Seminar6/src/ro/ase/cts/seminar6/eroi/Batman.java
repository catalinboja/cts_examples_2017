package ro.ase.cts.seminar6.eroi;

public class Batman extends SuperErou{

	public Batman() {
		super("Batman");
	}

	@Override
	public void superMerge() {
		System.out.println("Batman merge");
	}

	@Override
	public void superSare() {
		System.out.println("Batman sare");
	}

	@Override
	public void superActiune() {
		System.out.println("Batman se lupta cu oamenii rai");
	}

}
