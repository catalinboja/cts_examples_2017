package ro.ase.cts.lab7.composite;

import java.util.ArrayList;

public class Group extends AbstractComponent{

	//collection of subcomponents
	ArrayList<AbstractComponent> components = 
			new ArrayList<>();
	
	@Override
	public void move() {
		for(AbstractComponent comp : components)
			comp.move();
	}

	@Override
	public void fight() {
		for(AbstractComponent comp : components)
			comp.fight();
	}
	
	@Override
	public void addSubcomponents(
			AbstractComponent component){
		this.components.add(component);
	}
	
	@Override
	public void deleteSubcomponents(
			AbstractComponent component){
		if(components.contains(component))
			components.remove(component);
	}
	
	@Override
	public AbstractComponent getSubcomponents(int index){
		if(index >=0 && index < this.components.size())
			return this.components.get(index);
		throw new IllegalArgumentException();
	}
	
	@Override
	public int getNoComponents(){
		return this.components.size();
	}

}
