package creational.abstractFactory.impl;

public class AnimalWorld {

	private Carnivore carnivore;
	private Herbivore herbivore;
	
	public AnimalWorld(ContinentFactory factory) {
		carnivore = factory.createCarnivore();
		herbivore = factory.createHerbivore();
	}
	
	public void runFoodChain() {
		carnivore.eat(herbivore);
	}
	
}
