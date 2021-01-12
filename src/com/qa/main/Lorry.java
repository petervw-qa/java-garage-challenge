package com.qa.main;

public class Lorry extends Vehicle{
	
	protected boolean largeGearbox = true;

	@Override
	public void hasWheels() {
		System.out.println("I have 18 wheels! wow");
		
	}
	
	public void hasLargeFridge() {
		System.out.println("The fridge is full of lots of fruit and veg!");
	}

	@Override
	public int wheels() {
		return 18;
	}

	@Override
	public int seats() {
		return 3;
	}

	@Override
	public int mirrors() {
		return 6;
	}

	@Override
	public String type() {
		return "lorry";
	}

	@Override
	public String toString() {
		return "Lorry [wheels()=" + wheels() + ", seats()=" + seats() + ", mirrors()=" + mirrors() + ", type()="
				+ type() + "]";
	}
	
	
	

}
