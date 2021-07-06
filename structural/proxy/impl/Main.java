package structural.proxy.impl;

public class Main {

	public static void main(String[] args) {
		MathProxy proxy = new MathProxy();

		// Do the math
		System.out.println("4 + 2 = " + proxy.add(4, 2));
		System.out.println("4 - 2 = " + proxy.sub(4, 2));
		System.out.println("4 * 2 = " + proxy.mul(4, 2));
		System.out.println("4 / 2 = " + proxy.div(4, 2));
	}

}
