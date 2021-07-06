package behavioral.mediator.impl;

import java.util.HashMap;
import java.util.Map;

public class Chatroom implements AbstractChatroom {

	private Map<String, Participant> participants = new HashMap<String, Participant>();
	
	@Override
	public void register(Participant participant) {
		if (!participants.containsValue(participant)) {
			participant.setChatroom(this);
			participants.put(participant.getName(), participant);
		}
	}

	@Override
	public void send(String from, String to, String message) {
		Participant toParticipant = participants.get(to);
		
		if (toParticipant != null) {
			toParticipant.receive(from, message);
		}
	}
	
}
