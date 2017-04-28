package ro.ase.cts.seminar8.chain;

public class HandlerCriogenic extends HandlerHitPoint{

	@Override
	public int procesareLovitura(Lovitura lovitura, int hitPoints) {
		if(lovitura.tip.equals("Criogenica"))
			System.out.println("Batman inghetat pentru 10 secunde");
		if(this.next!=null)
			this.next.procesareLovitura(lovitura, hitPoints);
		return hitPoints;
	}

}
