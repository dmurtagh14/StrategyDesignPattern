package com.designpatternexample1;

public class Bird extends Animal{
	
	public Bird() {
		super();
		
		setSound("Tweet");
		
		flyingType = new ItFlies();
	}

}
