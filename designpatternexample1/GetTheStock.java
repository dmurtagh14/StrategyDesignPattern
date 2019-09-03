package com.designpatternexample1;
import java.text.DecimalFormat;

//using threads
public class GetTheStock implements Runnable{
	
	private int startTime;
	private String stock;
	private double price;
	
	private Subject stockGrabber;
	
	public GetTheStock(Subject stockGrabber, int newStartTime, String newStock, 
								double newPrice) {
		
		this.stockGrabber = stockGrabber;
		startTime = newStartTime;
		
		stock = newStock;
		
		price = newPrice;	
		
		
	}

	@Override
	public void run() {
		
		for(int i = 1; i<= 20; i++) {
			try {
				Thread.sleep(2000);
			}
			
			catch(InterruptedException e) {
				double randNum = (Math.random() * (0.06)) - 0.3;
				
				DecimalFormat df = new DecimalFormat("#.##");
				
				price = Double.valueOf(df.format((price + randNum)));
				
				if(stock == "IBM") ((StockGrabber)stockGrabber).setIBMPrice(price);
				if(stock == "aapl") ((StockGrabber)stockGrabber).setapplPrice(price);
				if(stock == "goog") ((StockGrabber)stockGrabber).setgoogPrice(price);
				
				System.out.println(stock + ": "+ df.format((price+randNum)
									+ " "+ df.format(randNum)));
				
				System.out.println();

				
				
				
			}
		}
		
	}
	
}
