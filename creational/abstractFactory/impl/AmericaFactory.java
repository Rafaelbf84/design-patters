package creational.abstractFactory.impl;

public class AmericaFactory implements ContinentFactory {

	@Override
	public Herbivore createHerbivore() {
		return new Bison();
	}

	@Override
	public Carnivore createCarnivore() {
		return new Wolf();
	}

}
