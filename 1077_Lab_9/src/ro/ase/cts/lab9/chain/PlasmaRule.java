package ro.ase.cts.lab9.chain;

public class PlasmaRule extends AbstractNode{

	@Override
	public void processHit(Batman batman, Hit hit) {
		if(hit.getWeapon().equals("Plasma"))
			System.out.println("Game over !!!");
		else
			if(this.next!=null)
				this.next.processHit(batman, hit);
	}

}
