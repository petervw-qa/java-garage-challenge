package com.qa.main;

public class Runner {
	
	public static void main(String[] args) {
		
		Vehicle golf = new Car();
		Vehicle yamaha = new Motorbike();
		Vehicle bigboylorry = new Lorry();
		
		Garage theGarage = new Garage();
		theGarage.addToList(golf);
		theGarage.addToList(yamaha);
		theGarage.addToList(bigboylorry);
		theGarage.removeByType("motorbike");
		theGarage.billCalculation(golf);
		theGarage.fixByType("lorry");
		theGarage.clearOutGarage();
	}

}
