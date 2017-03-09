package ro.ase.sqt.lab3;

public class DBConnection {
	public DBConnection(){
		System.out.println(
				"A new connection created. Timeout 60 sec");
	}
	public void close(){
		System.out.println("Connection closed");
	}
}
