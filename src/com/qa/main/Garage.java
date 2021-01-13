package com.qa.main;

import java.util.ArrayList;
import java.util.List;

public class Garage {
	
	public List<Vehicle> VehicleList = new ArrayList<>();
	
	// method to add to arraylist
	
	public void addToList(Vehicle vehicle) {
		VehicleList.add(vehicle);
	}
	
	// method to remove a vehicle from arraylist
	
	public void removeFromList(Vehicle vehicle) {
			VehicleList.remove(vehicle);
			
	}

	// method to iterate through each vehicle with diff bills
	
	public void billCalculation(Vehicle vehicle) {
		for (Vehicle v: VehicleList) {
			
			int bill = 0;
			
			switch(v.type()) {
			case "lorry":
				bill = 500 * v.mirrors() * v.wheels();
				break;
			case "motorbike":
				bill = 200 * v.wheels() * v.seats();
				break;
			case "car":
				bill = 250 * v.seats() * v.wheels();
				break;
			}
			
			System.out.println("Your bill has come to: " + bill + " for your vehicle.");
			System.out.println(" The vehicle: " + v);
		}
		
	}
	
	// method to remove from arraylist by type
	
	public void removeByType(String type) {
		
		for (Vehicle v: VehicleList) {
			if (v.type().equals(type)) {
				VehicleList.remove(v);

			}
		}
	}
	
	// method to change bill variable based on the object type
	
	public void fixByType(String type) {
		
		for (Vehicle v: VehicleList) {
			
			int bill = 0;
			
			if(v.type().contentEquals(type) ) {
				bill = v.wheels() + 250 * v.seats();
				System.out.println("The bill is: " + bill);
			}
		}
	}
	
	// method to clear vehiclelist (arraylist)
	
	public void clearOutGarage() {
		
		VehicleList.clear();
		
		System.out.println("Cleared Vehicle Garage.");
	}
}
