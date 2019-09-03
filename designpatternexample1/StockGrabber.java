package com.designpatternexample1;

import java.util.ArrayList;

public class StockGrabber implements Subject{
	
	private ArrayList<Observer> observers;
	private double ibmPrice;
	private double googPrice;
	private double aaplPrice;
	
	//constructor for StockGrabber, initilize array list
	public StockGrabber() {
		observers = new ArrayList<Observer>();
	}



	@Override
	public void register(Observer newObserver) {
		observers.add(newObserver);
	}

	@Override
	public void unregister(Observer deleteObserver) {
		int observerIndex = observers.indexOf(deleteObserver);
		System.out.println("Observer"+ (observerIndex+1)+ " deleted");
		observers.remove(observerIndex);
		
	}

	@Override
	public void notifyObserver() {
		//cycles through all observers and notifies any price differences
		
		for(Observer observer : observers) {
			observer.update(ibmPrice, aaplPrice, googPrice);
		}
		
		
	}
	
	public void setIBMPrice(double newIBMPrice) {
			this.ibmPrice = newIBMPrice;
			notifyObserver();
	}
	
	public void setgoogPrice(double newgoogPrice) {
		this.googPrice = newgoogPrice;
		notifyObserver();
	}
	public void setapplPrice(double newaaplPrice) {
		this.aaplPrice = newaaplPrice;
		notifyObserver();
	}
}
