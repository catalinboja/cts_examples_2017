package ro.ase.cts.seminar8.chain;

public abstract class HandlerHitPoint {
	protected HandlerHitPoint next;
	
	public void setNext(HandlerHitPoint handler){
		this.next = handler;
	}
	public abstract int procesareLovitura(
			Lovitura lovitura, int hitPoints);
	
}
