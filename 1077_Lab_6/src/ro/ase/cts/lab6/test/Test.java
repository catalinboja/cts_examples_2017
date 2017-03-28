package ro.ase.cts.lab6.test;

import ro.ase.cts.lab6.adapter.BatmanAdapter4Disney;
import ro.ase.cts.lab6.adapter.BatmanObjectAdapter;
import ro.ase.cts.lab6.decorator.BatmanDecorator;
import ro.ase.cts.lab6.decorator.MiddleExperiencedBatman;
import ro.ase.cts.lab6.environment.api.Stage;
import ro.ase.cts.lab6.environment.api.StageFacade;
import ro.ase.cts.lab6.environment.api.StageObject;
import ro.ase.cts.lab6.marvel.api.Batman;

public class Test {

	public static void main(String[] args) {

/*		//loading the environment
		Stage stage = new Stage();
		stage.render("City.env");
		
		StageObject car = new StageObject();
		car.load("PoliceCar.obj");
		car.add2Stage(stage);
		
		stage.loadObjects();
		stage.display();*/
		
		StageFacade.setUp();
		
		Batman user1 = new Batman();
		user1.superMove();
		user1.superJump();
		
		Batman user2 = new Batman();
		user2.superMove();
		user2.superJump();
		
		//adapt user1 batman to the Disney
		BatmanObjectAdapter disneyUser = 
				new BatmanObjectAdapter(user1);
		disneyUser.move();
		disneyUser.jump();
		disneyUser.act();
		
		//new game
		BatmanAdapter4Disney disneyBatman = 
				new BatmanAdapter4Disney();
		disneyBatman.move();
		disneyBatman.jump();
		disneyBatman.act();
		
		//decorate the first Batman
		MiddleExperiencedBatman superBatman = 
				new MiddleExperiencedBatman(user1);
		superBatman.superMove();
		
		BatmanDecorator tempDecorator = 
				new BatmanDecorator(user1) {
					
					@Override
					public void superMove() {
						this.superMove();
					}
					
					@Override
					public void superJump() {
						System.out.println("SUUUUUUPER jumping");
					}
					
					@Override
					public void superAct() {
						this.superAct();
					}
				};
		tempDecorator.superJump();
	}

}
