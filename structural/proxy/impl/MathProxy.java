package structural.proxy.impl;

public class MathProxy implements IMath {

	private Math math = new Math();

	public double add(double x, double y) {
		return math.add(x, y);
	}

	public double sub(double x, double y) {
		return math.sub(x, y);
	}

	public double mul(double x, double y) {
		return math.mul(x, y);
	}

	public double div(double x, double y) {
		return math.div(x, y);
	}
}
