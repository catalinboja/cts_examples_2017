package ro.ase.cts.seminar9.state;

import ro.ase.cts.seminar9.memento.MementoBatman;

public class Batman {
	StareAbstracta stareCurenta;
	
	int hitPoints;
	String armaS;
	String armaD;
	public Batman(String armaS, String armaD) {
		super();
		this.hitPoints = 100;
		this.stareCurenta = new StareNormala();
		this.armaS = armaS;
		this.armaD = armaD;
	}
	public void setStareCurenta(StareAbstracta stareCurenta) {
		if(stareCurenta==null)
			throw new IllegalArgumentException();
		this.stareCurenta = stareCurenta;
	}
	
	public void seLupta(){
		if(this.stareCurenta!=null)
			this.stareCurenta.seLupta(
					hitPoints, armaS, armaD);
		else
			throw new IllegalArgumentException();
	}
	public void setHitPoints(int hitPoints) {
		this.hitPoints = hitPoints;
	}
	
	//metode specifice Memento
	public MementoBatman getMemento(){
		return new MementoBatman(
				hitPoints, armaS, armaD, stareCurenta);
	}
	
	public void setValoriAnterioare(MementoBatman salvare){
		this.hitPoints = salvare.getHitPoints();
		this.armaD = salvare.getArmaD();
		this.armaS = salvare.getArmaS();
		this.stareCurenta = salvare.getStareCurenta();
	}
	
}
