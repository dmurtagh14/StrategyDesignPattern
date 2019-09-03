package com.designpatternexample1;

public class AnimalPlayTest {
	
	public static void main(String[] args) {
		
		Animal sparky = new Dog();
		
		Animal tweety = new Bird();
		
		System.out.println("Dog: "+sparky.tryToFly());
		
		System.out.println("Bird: "+tweety.tryToFly());
		
		//now we create an instance of it flies for dog variable
		//allowing use to dynamically change the ability to fly for animals
		sparky.setFlyingAbility(new ItFlies());
		
		System.out.println("Dog now: "+ sparky.tryToFly());
	}

}
