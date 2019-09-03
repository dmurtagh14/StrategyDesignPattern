package com.designpatternexample1;

public class Animal {
	private String name;
	private int weight;
	private String sound;
	
	public Fly flyingType;//composition
	
	public void setName(String newName) {
		name = newName;
	}
	
	public String getName() {
		return name;
	}
	
	public void setWeight(int newWeight) {
		if(newWeight > 0) {
			weight = newWeight;
		}
		else {
			System.out.println("Weight must be bigger than 0");
		}
	}
	
	public int getWeight() {
		return weight;
	}
	
	public void setSound(String newSound) {
		sound = newSound;
	}
	
	public String getSound() {
		return sound;
	}
	
	public String tryToFly() {
		return flyingType.fly();	
	}
	
	public void setFlyingAbility(Fly newFlyType) {
		flyingType = newFlyType; 
	}

}
