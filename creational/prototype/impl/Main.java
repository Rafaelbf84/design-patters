package creational.prototype.impl;

public class Main {

	public static void main(String[] args) {
		Color angry = new Color(255, 54, 0);
		Color peace = new Color(128, 211, 128);
		Color flame = new Color(211, 34, 20);

		Color color1 = (Color) angry.clone();
		System.out.println(color1);
		
		Color color2 = (Color) peace.clone();
		System.out.println(color2);
		
		Color color3 = (Color) flame.clone();
		System.out.println(color3);
	}

}
