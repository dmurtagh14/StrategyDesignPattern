package com.designpatternexample1;
import java.util.Scanner;
public class EnemyShipTesting {
	
	public static void main(String[] args) {
		Scanner userIn = new Scanner(System.in);
		
//		//allows us to dynamically create enemy ship
//		EnemyShipClass theEnemy = null;
//		
//		String enemyShipOption = "";
//		System.out.println("What type of ship are you? (U / R)");
//		
//		
//		
//		//If statments are bad and doesnt allow code to be more dynamic
//		//use factory pattern to solve this issue
//		if(userIn.hasNextLine()) {
//		
//			enemyShipOption = userIn.nextLine();
//			
//		}
//		
//		if(enemyShipOption.equals("U")) {
//				theEnemy = new UFOEnemyShip();
//		}
//		else 
//			if(enemyShipOption.equals("R")) {
//				theEnemy = new RocketEnemyShip();
//		}
//		
//		
		
		
		EnemyShipFactory shipFactory= new EnemyShipFactory();
		
		EnemyShipClass theEnemy = null;
		
		System.out.println("What type of ship are you? (U / R / B)");
		
		if(userIn.hasNextLine()) {
			String typeOfShip = userIn.nextLine();
			theEnemy = shipFactory.makeEnemyShip(typeOfShip); //calls makeEnemyShip method from ship factory class 
			
			if(theEnemy != null) {
				doStuff(theEnemy);
			}
			
			else System.out.println("Enter the values U / R / B");
		}
		
		
		
	
	}
	
	//not dynamic
	public static void doStuff(EnemyShipClass anEnemyShip) {
		anEnemyShip.displayEnemyShip();
		anEnemyShip.followShip();
		anEnemyShip.enemyShipShoots();
	}

}
