package ro.ase.cts.lab9.test;

import java.rmi.activation.ActivationGroupDesc.CommandEnvironment;
import java.util.ArrayList;

import ro.ase.cts.lab9.chain.Batman;
import ro.ase.cts.lab9.chain.CryogenicRule;
import ro.ase.cts.lab9.chain.GenericRule;
import ro.ase.cts.lab9.chain.Hit;
import ro.ase.cts.lab9.chain.PlasmaRule;
import ro.ase.cts.lab9.command.CatWoman;
import ro.ase.cts.lab9.command.CommandManager;
import ro.ase.cts.lab9.command.HelpMeCommand;
import ro.ase.cts.lab9.command.Robyn;

public class Test {

	public static void main(String[] args) {

		Batman batman = new Batman();
		
		//create the chain
		GenericRule generic = new GenericRule();
		PlasmaRule plasma = new PlasmaRule();
		CryogenicRule cryo = new CryogenicRule();
		
		generic.setNext(cryo);
		cryo.setNext(plasma);
		
		System.out.println("Hit points:"+
		batman.getHitPoints());
		
		generic.processHit(batman, new Hit(15,"Normal"));
		generic.processHit(batman, new Hit(25,"Cryo"));
		
		System.out.println("Hit points:"+
		batman.getHitPoints());
		
		generic.processHit(batman, new Hit(95,"Normal"));
		generic.processHit(batman, new Hit(25,"Plasma"));
		
		System.out.println("Hit points:"+
		batman.getHitPoints());
		
		//testing command
		CatWoman cat = new CatWoman();
		Robyn robyn = new Robyn();
		
		CommandManager manager = 
				new CommandManager();
		manager.commands = new ArrayList<>();
		manager.commands.add(
				new HelpMeCommand("Call Cat", cat));
		manager.commands.add(
				new HelpMeCommand("Call Robyn", robyn));
		manager.executeAll();
	}

}
