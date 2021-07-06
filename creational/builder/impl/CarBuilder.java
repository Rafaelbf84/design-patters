package creational.builder.impl;

public class CarBuilder extends VehicleBuilder {

	public CarBuilder() {
		vehicle = new Vehicle("Car");
	}
	
	@Override
	public void buildFrame() {
		vehicle.setFrame("Car Frame");
	}

	@Override
	public void buildEngine() {
		vehicle.setEngine("2500 cc");
	}

	@Override
	public void buildWheels() {
		vehicle.setWheels(4);
	}

	@Override
	public void buildDoors() {
		vehicle.setDoors(4);
	}

}
