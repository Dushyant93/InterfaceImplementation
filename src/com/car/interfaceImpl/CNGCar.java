package com.car.interfaceImpl;

public class CNGCar implements CarIntf{

	public CNGCar() {
		CarIntf.CarE(EngineType.CNG);
		stop(EngineType.CNG.toString());
	}
	
	@Override
	public void stop(String engine) {
		System.out.println("Hey "+engine+" car stop now you have gone too far!!!");
	}

}
