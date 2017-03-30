package ro.ase.cts.seminar6.test;

import ro.ase.cts.seminar6.adaptor.AdaptorDisney;
import ro.ase.cts.seminar6.adaptor.AdaptorObiecteSupereroi;
import ro.ase.cts.seminar6.decorator.DecoratorBatmanAbstract;
import ro.ase.cts.seminar6.decorator.DecoratorBatmanExperienta;
import ro.ase.cts.seminar6.eroi.Batman;
import ro.ase.cts.seminar6.modele.FacadeMediu;
import ro.ase.cts.seminar6.modele.Obiect;
import ro.ase.cts.seminar6.modele.Stage;

public class Test {

	public static void main(String[] args) {

/*		Stage scena = new Stage();
		scena.incarcaModel(ZonaUrbana.model);
		scena.incarcaTextura("Iarna");
		
		Obiect masina = new Obiect();
		masina.incarca("MasinaPolitie.model");
		masina.adaugaPeScena(scena);
		
		scena.incarcaObiecte();
		scena.afisare();*/
		FacadeMediu.genereazaMediu(
				"ZonaUrbana.model",
				"MasinaPolitie.model");
		
		Batman batman1 = 
				new Batman();
		batman1.superMerge();
		batman1.superActiune();
		
		Batman batman2 = 
				new Batman();
		batman1.superMerge();
		batman1.superActiune();
		
		AdaptorObiecteSupereroi adaptor = 
				new AdaptorObiecteSupereroi(batman1);
		adaptor.actioneaza();
		adaptor.sare();
		
		
		//test adaptor clase
		AdaptorDisney batmanDisney = 
				new AdaptorDisney();
		batmanDisney.actioneaza();
		batmanDisney.merge();
		batmanDisney.sare();
		
		//test decorator
		DecoratorBatmanExperienta batmanXp = 
				new DecoratorBatmanExperienta(batman1);
		batmanXp.experienta = 1000;
		batmanXp.superActiune();
		
		DecoratorBatmanAbstract batmanDiferit = 
				new DecoratorBatmanAbstract(batman1) {
					
					@Override
					public void superSare() {
						this.superSare();
					}
					
					@Override
					public void superMerge() {
						System.out.println("foloseste Batmobilul");
					}
					
					@Override
					public void superActiune() {
						this.superActiune();
					}
				};
				
		batmanDiferit.superMerge();
	}

}
