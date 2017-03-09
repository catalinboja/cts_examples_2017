package ro.ase.sqt.lab3.singleton;

public class DBConnectionSingleton {
	
	private static DBConnectionSingleton connection = null;
	
	private DBConnectionSingleton(){
		System.out.println(
				"Unique connection created");
	}
	
	public static DBConnectionSingleton getConnection(){
		if(connection == null){
			connection = new DBConnectionSingleton();
			return connection;
		}
		else
			return connection;
	}
	
	public void close(){
		System.out.println(
				"Unique connection closing");
	}
	
	@Override
	public void finalize(){
		System.out.println("Closing the unused connection");
	}
}
