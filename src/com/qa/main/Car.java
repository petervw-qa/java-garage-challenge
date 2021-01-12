package com.qa.main;

public class Car extends Vehicle{
	
	protected String manufacturer = "Volkswagen";

	@Override
	public void hasWheels() {
		System.out.println("I have four wheels!");
		
	}
	
	public void hasLargeSpeakers() {
		System.out.println("tss tss BOOM tss tss BOOM");
	}

	@Override
	public int wheels() {
		return 4;
	}

	@Override
	public int seats() {
		return 5;
	}

	@Override
	public int mirrors() {
		return 2;
	}

	@Override
	public String type() {
		return "car";
	}

	@Override
	public String toString() {
		return "Car [wheels()=" + wheels() + ", seats()=" + seats() + ", mirrors()=" + mirrors() + ", type()=" + type()
				+ "]";
	}
	
	

}
