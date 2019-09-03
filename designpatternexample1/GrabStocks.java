package com.designpatternexample1;

public class GrabStocks {

	
	public static void main(String[] args) {
		
		StockGrabber stockGrabber = new StockGrabber();
		
		StockObserver observer1 = new StockObserver(stockGrabber);
		//updates one by one
		stockGrabber.setIBMPrice(187.00);
		stockGrabber.setgoogPrice(42.00);	
		stockGrabber.setapplPrice(664.00);


		StockObserver observer2 = new StockObserver(stockGrabber);
		stockGrabber.setIBMPrice(187.00);
		stockGrabber.setgoogPrice(42.00);	
		stockGrabber.setapplPrice(664.00);
		
//		stockGrabber.unregister(observer1);
//		stockGrabber.setIBMPrice(127.00);
//		stockGrabber.setgoogPrice(42.00);	
//		stockGrabber.setapplPrice(664.00);
		
		
		//create threads
		Runnable getIbm = new GetTheStock(stockGrabber, 2, "IBM", 186.99);
		Runnable getGoog = new GetTheStock(stockGrabber, 2, "goog", 42.00);
		Runnable getAapl = new GetTheStock(stockGrabber, 2, "aapl", 664.00);
		
		
		new Thread(getIbm).start();
		new Thread(getGoog).start();
		new Thread(getAapl).start();
	}
}
