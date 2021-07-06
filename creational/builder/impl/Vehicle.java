package creational.builder.impl;

public class Vehicle {

	private String type;
	private String frame;
	private String engine;
	private int wheels;
	private int doors;

	public Vehicle(String type) {
		this.type = type;
	}

	public void show() {
		System.out.println("Type: " + type);
		System.out.println("Frame: " + frame);
		System.out.println("Engine: " + engine);
		System.out.println("Wheels: " + wheels);
		System.out.println("Doors: " + doors);
		System.out.println();
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getFrame() {
		return frame;
	}

	public void setFrame(String frame) {
		this.frame = frame;
	}

	public String getEngine() {
		return engine;
	}

	public void setEngine(String engine) {
		this.engine = engine;
	}

	public int getWheels() {
		return wheels;
	}

	public void setWheels(int wheels) {
		this.wheels = wheels;
	}

	public int getDoors() {
		return doors;
	}

	public void setDoors(int doors) {
		this.doors = doors;
	}

}
