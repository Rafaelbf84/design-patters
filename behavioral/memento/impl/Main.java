package behavioral.memento.impl;

public class Main {

	public static void main(String[] args) {
		SalesProspect s = new SalesProspect();
		s.setName("Noel van Halen");
		s.setPhone("(412) 256-0990");
		s.setBudget(25000.0);
		System.out.println(s);
		
		// Store internal state
		ProspectMemory m = new ProspectMemory();
		m.setMemento(s.saveMemento());

		// Continue changing originator
		s.setName("Leo Welch");
		s.setPhone("(310) 209-7111");
		s.setBudget(1000000.0);
		System.out.println(s);

		// Restore saved state
		s.restoreMemento(m.getMemento());
		System.out.println(s);
	}

}
