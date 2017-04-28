package ro.ase.cts.lab9.command;

public class HelpMeCommand {
	String message;
	SuperHeroFriend friend;
	
	public HelpMeCommand(String message, SuperHeroFriend friend) {
		super();
		this.message = message;
		this.friend = friend;
	}

	public String getMessage() {
		return message;
	}
	
	public void helpMe(){
		System.out.println(this.message);
		if(this.friend!=null)
			this.friend.help();
		else
			throw new IllegalArgumentException();
	}
	
	
	
}
