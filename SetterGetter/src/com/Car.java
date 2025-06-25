package com;
public class Car{
	private String make;
	private String model;
	private int year;
	private double mileage;
	
	public void setMake(String make){
		this.make = make;
	}
	public void setModel(String model){
		this.model = model;
	}
	public void setYear(int year){
		this.year = year;
	}
	public void setMileage(double mileage){
		this.mileage = mileage;
	}
	
	public String getMake() {return make;}
	public String getModel() {return model;}
	public int getYear() {return year;}
	public double getMileage() {return mileage;}
}