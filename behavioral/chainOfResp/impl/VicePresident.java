package behavioral.chainOfResp.impl;

public class VicePresident extends Approver {

	@Override
	public void processRequest(Purchase purchase) {
		if (purchase.getAmount() < 100000.0) {
			System.out.println(this.getClass().getSimpleName() + " approved request " + purchase.getNumber());
		} else if (successor != null) {
			successor.processRequest(purchase);
		}
	}

}
