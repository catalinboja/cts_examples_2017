package ro.ase.cts.seminar8.observer;

import java.util.ArrayList;

public class ManagerVersiuni {
	String versiuneCurenta = "1.0";
	ArrayList<ClientUpdate> clienti = 
			new ArrayList<>();
	
	public void adaugaClient(ClientUpdate client){
		clienti.add(client);
	}
	
	public void stergeClient(ClientUpdate client){
		clienti.remove(client);
	}
	
	public void setVersiune(String versiuneNoua){
		this.versiuneCurenta = versiuneNoua;
		for(ClientUpdate client : clienti)
			client.notificareUpdate(versiuneNoua);
	}
}
