package com.car.interfaceImpl;

public class DieselCar implements CarIntf{

	public DieselCar() {
		CarIntf.CarE(EngineType.DIESEL);
		stop(EngineType.DIESEL.toString());
	}
	
	@Override
	public void stop(String engine) {
		System.out.println("Hey "+engine+" car stop now you have gone too far!!!");
	}

}
