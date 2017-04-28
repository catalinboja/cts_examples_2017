package ro.ase.cts.seminar9.memento;

import ro.ase.cts.seminar9.state.StareAbstracta;

public class MementoBatman {
	int hitPoints;
	String armaS;
	String armaD;
	StareAbstracta stareCurenta;
	public MementoBatman(int hitPoints, String armaS, String armaD, StareAbstracta stareCurenta) {
		super();
		this.hitPoints = hitPoints;
		this.armaS = armaS;
		this.armaD = armaD;
		this.stareCurenta = stareCurenta;
	}
	public int getHitPoints() {
		return hitPoints;
	}
	public String getArmaS() {
		return armaS;
	}
	public String getArmaD() {
		return armaD;
	}
	public StareAbstracta getStareCurenta() {
		return stareCurenta;
	}
	
	
}
