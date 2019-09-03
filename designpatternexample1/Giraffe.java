package com.designpatternexample1;

public class Giraffe extends Creature{
	
	private String name;
	
	private int weight;
	
	private String sound;


	@Override
	public void setName(String newName) {
		name = newName;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public void setWeight(int newWeight) {
		// TODO Auto-generated method stub
		weight = newWeight;
		
	}

	@Override
	public int getWeight() {
		// TODO Auto-generated method stub
		return weight;
	}

	@Override
	public void setSound(String newSound) {
		// TODO Auto-generated method stub
		sound = newSound;
		
	}

	@Override
	public String getSound() {
		// TODO Auto-generated method stub
		return sound;
	}

	
}
