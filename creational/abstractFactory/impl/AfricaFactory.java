package creational.abstractFactory.impl;

public class AfricaFactory implements ContinentFactory {

	@Override
	public Herbivore createHerbivore() {
		return new WildBeast();
	}

	@Override
	public Carnivore createCarnivore() {
		return new Lion();
	}

}
