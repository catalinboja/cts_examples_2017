package ro.ase.cts.seminar8.chain;

public class HandlerNormal extends HandlerHitPoint{

	@Override
	public int procesareLovitura(Lovitura lovitura, int hitPoints) {
		int newHitPoints = hitPoints-lovitura.nivel;
		
		if(this.next!=null)
			this.next.procesareLovitura(lovitura, newHitPoints);
		
		return newHitPoints;
	}

}
