package com.designpatternexample1;

public class Dog extends Animal{
	public void digHole() {
		System.out.println("I am digging a hole! ");
	}
	
	public Dog() {
		super();
		setSound("Bark");
		
		flyingType = new CantFly(); //using the cantfly class in fly interface
	}

	
	//private methods
	private void bePrivate() {
		System.out.println("In a private method");
	}
	
	//making private method publically accessable
	public void accessPrivate() {
		bePrivate();	
	}
}
