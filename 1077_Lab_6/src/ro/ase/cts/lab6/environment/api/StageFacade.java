package ro.ase.cts.lab6.environment.api;

public class StageFacade {
	public static void setUp(){
		//loading the environment
		Stage stage = new Stage();
		stage.render("City.env");
		
		StageObject car = new StageObject();
		car.load("PoliceCar.obj");
		car.add2Stage(stage);
		
		stage.loadObjects();
		stage.display();
	}
}
