package creational.prototype.impl;

public class Color implements ColorPrototype {

	private int red;
	private int green;
	private int blue;

	public Color(int red, int green, int blue) {
		super();
		this.red = red;
		this.green = green;
		this.blue = blue;
	}

	@Override
	public ColorPrototype clone() {
		return new Color(red, green, blue);
	}

	@Override
	public String toString() {
		return "Color [red=" + red + ", green=" + green + ", blue=" + blue + "]";
	}
	
}
