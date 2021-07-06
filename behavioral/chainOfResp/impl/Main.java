package behavioral.chainOfResp.impl;

public class Main {

	public static void main(String[] args) {
		Approver larry = new Director();
		Approver sam = new VicePresident();
		Approver tammy = new President();

		larry.setSuccessor(sam);
		sam.setSuccessor(tammy);

		Purchase p = new Purchase(2034, 350.00, "Assets");
		larry.processRequest(p);

		p = new Purchase(2035, 32590.10, "Project X");
		larry.processRequest(p);

		p = new Purchase(2036, 122100.00, "Project Y");
		larry.processRequest(p);
	}

}
