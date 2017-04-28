package ro.ase.cts.seminar9.state;

public class StareNormala extends StareAbstracta{

	@Override
	public void seLupta(int hitPoints,
			String armaS, String armaD) {
		System.out.println("Hit points "+hitPoints);
		System.out.println("Foloseste arma "+armaS);
		System.out.println("Foloseste arma "+armaD);
	}

}
