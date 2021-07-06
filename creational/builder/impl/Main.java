package creational.builder.impl;

public class Main {

	public static void main(String[] args) {
		VehicleBuilder vehicleBuilder;

		vehicleBuilder = new MotorCycleBuilder();
		shop(vehicleBuilder);
		vehicleBuilder.vehicle.show();

		vehicleBuilder = new CarBuilder();
		shop(vehicleBuilder);
		vehicleBuilder.vehicle.show();

		vehicleBuilder = new ScooterBuilder();
		shop(vehicleBuilder);
		vehicleBuilder.vehicle.show();
	}

	public static void shop(VehicleBuilder vehicleBuilder) {
		vehicleBuilder.buildFrame();
		vehicleBuilder.buildEngine();
		vehicleBuilder.buildWheels();
		vehicleBuilder.buildDoors();
	}

}
