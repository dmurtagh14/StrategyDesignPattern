package com.designpatternexample1;

public interface Fly {
		String fly();
}


class ItFlies implements Fly{

	@Override
	public String fly() {
		return "Flying High";
	}
	
}


//stragtegy design pattern
class CantFly implements Fly{

	@Override
	public String fly() {
		// TODO Auto-generated method stub
		return "Cant fly";
	}
	
}