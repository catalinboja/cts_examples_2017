package ro.ase.cts.lab9.command;

import java.util.ArrayList;

public class CommandManager {
	public ArrayList<HelpMeCommand> commands;
	
	public void executeAll(){
		for(HelpMeCommand com : commands)
			com.helpMe();
	}
}
