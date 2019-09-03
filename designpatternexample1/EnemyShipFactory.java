package com.designpatternexample1;

public class EnemyShipFactory {

		public EnemyShipClass makeEnemyShip(String newShipType) {
			EnemyShipClass newShip = null;
			
			if(newShipType.equals("U")) {
				return new UFOEnemyShip(); // encapulates the ship creation
			}
			else 
				if(newShipType.equals("R")) {
					return new RocketEnemyShip(); // encapulates the ship creation
				
				}
			
			else 
				if(newShipType.equals("B")) {
						return new BigUFOEnemyShip(); // encapulates the ship creation
					
				}
					
		else return null; //returns nothing if the following inputs arent in
		
		}
	}
