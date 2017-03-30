package ro.ase.cts.seminar6.modele;

public class FacadeMediu {
	public static void genereazaMediu(
			String fisierMediu, String fisierObiect){
		Stage scena = new Stage();
		scena.incarcaModel(fisierMediu);
		scena.incarcaTextura("Iarna");
		
		Obiect masina = new Obiect();
		masina.incarca(fisierObiect);
		masina.adaugaPeScena(scena);
		
		scena.incarcaObiecte();
		scena.afisare();
	}
}
