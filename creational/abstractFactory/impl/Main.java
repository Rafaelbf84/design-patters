package creational.abstractFactory.impl;

public class Main {

	public static void main(String[] args) {
		ContinentFactory africa = new AfricaFactory();
		AnimalWorld world = new AnimalWorld(africa);
		world.runFoodChain();

		ContinentFactory america = new AmericaFactory();
		world = new AnimalWorld(america);
		world.runFoodChain();
	}

}
