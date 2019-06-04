package com.car.interfaceImpl;

public class PetrolCar implements CarIntf{

	public PetrolCar() {
		CarIntf.CarE(EngineType.PETROL);
		stop(EngineType.PETROL.toString());
	}
	
	@Override
	public void stop(String engine) {
		System.out.println("Hey "+engine+" car stop now you have gone too far!!!");
	}

}
