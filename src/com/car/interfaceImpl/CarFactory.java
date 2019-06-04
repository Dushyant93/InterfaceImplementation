package com.car.interfaceImpl;

public class CarFactory {

	public static CarIntf buildEngine(EngineType engineType){
		CarIntf car = null;
		switch(engineType) {
		case PETROL:
			car = new PetrolCar();
			break;
		case DIESEL:
			car = new DieselCar();
			break;
		case CNG:
			car = new CNGCar();
			break;
		default:
			
		}
		return car;
	}
}
