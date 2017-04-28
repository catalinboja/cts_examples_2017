package ro.ase.cts.seminar9.state;

public class StareLovit extends StareAbstracta{

	@Override
	public void seLupta(int hitPoints, String armaS, String armaD) {
		System.out.println("Batman este lovit. Sufera");
		System.out.println("Hit points "+hitPoints);
		System.out.println("Foloseste arma "+armaS);
		System.out.println("Foloseste arma "+armaD);
	}

}
