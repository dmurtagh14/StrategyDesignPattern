package com.designpatternexample1;

abstract public class Creature {

	protected String name;
	protected int weight;
	protected String sound;
	
	
	public abstract void setName(String newName);
	public abstract String getName();
	
	public abstract void setWeight(int newWeight);
	public abstract int getWeight();
	
	public abstract void setSound(String newSound);
	public abstract String getSound();
	
	
	
}
