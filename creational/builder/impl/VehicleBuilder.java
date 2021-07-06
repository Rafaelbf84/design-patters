package creational.builder.impl;

public abstract class VehicleBuilder {

	protected Vehicle vehicle;
	
	public abstract void buildFrame();
	public abstract void buildEngine();
	public abstract void buildWheels();
	public abstract void buildDoors();
	
}
