package com.skilldistillery.entities;

public abstract class Jet {
	
	private String model;
	private double speed;
	private int range;
	private long price;
	private String type;
	

	public Jet(String type, String model, double speed, int range, long price) {
		super();
		this.type = type;
		this.model = model;
		this.speed = speed;
		this.range = range;
		this.price = price;
	}
	
	public void fly() {
		
		double flightTime = this.range / this.speed;
		System.out.println(getModel() + " is flying");
		System.out.println("The flight time is " + flightTime);
		
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public int getRange() {
		return range;
	}

	public void setRange(int range) {
		this.range = range;
	}

	public long getPrice() {
		return price;
	}

	public void setPrice(long price) {
		this.price = price;
	}
	
	public double getSpeedInMach() {
		return 0;
	}
	
	@Override
	public String toString() {
		return "Jet [model=" + model + ", speedMPI=" + speed + ", range=" + range + ", price=" + price + "]";
	}
	
	
}

