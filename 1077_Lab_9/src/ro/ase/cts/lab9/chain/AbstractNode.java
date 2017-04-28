package ro.ase.cts.lab9.chain;

public abstract class AbstractNode {
	protected AbstractNode next;
	
	public abstract void processHit(
			Batman batman, Hit hit);

	public void setNext(AbstractNode next) {
		this.next = next;
	}
	
}
