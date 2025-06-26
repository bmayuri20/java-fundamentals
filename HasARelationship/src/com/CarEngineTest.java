package com;
public class CarEngineTest{
	public static void main(String[] args){
		Engine eng = new Engine();
		eng.engineType = "Diesel";
		eng.horsePower = 25;
		
		Car car = new Car();
		car.carName = "Sonet";
		car.carModel = "SUV";
		car.carPrice = 1500000;
		car.engine = eng;
		
		System.out.println(car.carName);
		System.out.println(car.carModel);
		System.out.println(car.carPrice);
		System.out.println(car.engine.engineType);
		System.out.println(car.engine.horsePower);
		
	}
}