package creational.builder.impl;

public class ScooterBuilder extends VehicleBuilder {

	public ScooterBuilder() {
		vehicle = new Vehicle("Scooter");
	}
	
	@Override
	public void buildFrame() {
		vehicle.setFrame("Scooter Frame");
	}

	@Override
	public void buildEngine() {
		vehicle.setEngine("50 cc");
	}

	@Override
	public void buildWheels() {
		vehicle.setWheels(2);
	}

	@Override
	public void buildDoors() {
		vehicle.setDoors(0);
	}

}
