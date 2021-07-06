package creational.abstractFactory.impl;

public class Lion implements Carnivore {

	@Override
	public void eat(Herbivore e) {
		System.out.println(this.getClass().getSimpleName() + " eats " + e.getClass().getSimpleName());
	}

}
