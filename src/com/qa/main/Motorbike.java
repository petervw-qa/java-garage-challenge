package com.qa.main;

public class Motorbike extends Vehicle{
	
	protected int age = 3;

	@Override
	public void hasWheels() {
		System.out.println("I have two wheels!");
		
	}
	
	public void comesWithHelmet() {
		System.out.println("We like to ride safe!");
	}

	@Override
	public int wheels() {
		return 2;
	}

	@Override
	public int seats() {
		return 1;
	}

	@Override
	public int mirrors() {
		return 2;
	}

	@Override
	public String type() {
		return "motorbike";
	}

	@Override
	public String toString() {
		return "Motorbike [wheels()=" + wheels() + ", seats()=" + seats() + ", mirrors()=" + mirrors() + ", type()="
				+ type() + "]";
	}
	
	

}
