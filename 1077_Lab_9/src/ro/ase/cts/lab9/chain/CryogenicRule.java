package ro.ase.cts.lab9.chain;

public class CryogenicRule extends AbstractNode{

	@Override
	public void processHit(Batman batman, Hit hit) {
		if(hit.getWeapon().equals("Cryo"))
			System.out.println("Batman is frozen for 5 seconds");
		if(this.next!=null)
			this.next.processHit(batman, hit);
	}

}
