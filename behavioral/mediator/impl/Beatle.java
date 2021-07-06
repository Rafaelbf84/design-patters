package behavioral.mediator.impl;

public class Beatle extends Participant {

	public Beatle(String name) {
		super(name);
	}
	
	@Override
	public void receive(String from, String message) {
		System.out.print("To a Beatle: ");
		super.receive(from, message);
	}

}
