package com.skilldistillery.entities;

public class FighterJet extends Jet implements CombatReady {

	
	
	public FighterJet(String type, String model, double speed, int range, long price) {
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
		return "FighterJet [getType()=" + getType() + ", getModel()=" + getModel() + ", getSpeed()=" + getSpeed()
				+ ", getRange()=" + getRange() + ", getPrice()=" + getPrice() + "]";
	}


	@Override
	public void fight() {
		// TODO Auto-generated method stub
		System.out.println(getModel() + " ");
		
	}
	
	
}
