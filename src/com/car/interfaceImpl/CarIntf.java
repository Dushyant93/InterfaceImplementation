package com.car.interfaceImpl;

public interface CarIntf {

	public static void CarE(EngineType engineType){
		start(engineType.toString());
	}
	
	public static void start(String engine){
		System.out.println("Hey start my journey with "+engine+" car engine");
	}
	
	public void stop(String engine);
}
