package ro.ase.cts.lab9.chain;

public class GenericRule extends AbstractNode{

	@Override
	public void processHit(Batman batman, Hit hit) {
		//decreases the superhero hit points
		batman.setHitPoints(
				batman.getHitPoints()-hit.getPoints());
		if(batman.getHitPoints()<=0)
			System.out.println("Game over");
		else
			if(this.next!=null)
				this.next.processHit(batman, hit);
	}

}
