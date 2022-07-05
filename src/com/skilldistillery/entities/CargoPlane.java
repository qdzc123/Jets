package com.skilldistillery.entities;

public class CargoPlane extends Jet implements CargoCarrier {

	public CargoPlane(String type, String model, double speed, int range, long price) {
		super(type, model, speed, range, price);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		super.fly();
	}
	
	@Override
	public String toString() {
		return "CargoPlane [getType()=" + getType() + ", getModel()=" + getModel() + ", getSpeed()=" + getSpeed()
				+ ", getRange()=" + getRange() + ", getPrice()=" + getPrice() + ", getSpeedInMach()=" + getSpeedInMach()
				+ ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ "]";
	}

	@Override
	public void loadCargo() {
		// TODO Auto-generated method stub
		System.out.println(getModel() + " ");
	}


}
