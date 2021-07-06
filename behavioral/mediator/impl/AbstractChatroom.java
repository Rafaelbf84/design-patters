package behavioral.mediator.impl;

public interface AbstractChatroom {

	public abstract void register(Participant participant);

	public abstract void send(String from, String to, String message);

}
