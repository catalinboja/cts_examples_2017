package ro.ase.cts.seminar8.chain;

public class HandlerLaser extends HandlerHitPoint{

	@Override
	public int procesareLovitura(Lovitura lovitura, int hitPoints) {
		System.out.println("Game over");
		return 0;
	}

}
