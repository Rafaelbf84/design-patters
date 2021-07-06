package behavioral.mediator.impl;

public class NonBeatle extends Participant {

	public NonBeatle(String name) {
		super(name);
	}
	
	@Override
	public void receive(String from, String message) {
		System.out.print("To a non-Beatle: ");
		super.receive(from, message);
	}

}
