package ro.ase.cts.seminar9.state;

public class StareLovitLaser extends StareAbstracta{

	@Override
	public void seLupta(int hitPoints, String armaS, String armaD) {
		System.out.println("Batman este lovit. A pierdut mana stanga");
		System.out.println("Hit points "+hitPoints);
		System.out.println("Foloseste arma "+armaD);
	}

}
