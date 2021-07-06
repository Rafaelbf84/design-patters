package behavioral.chainOfResp.impl;

public class Director extends Approver {

	@Override
	public void processRequest(Purchase purchase) {
		if (purchase.getAmount() < 10000.0) {
			System.out.println(this.getClass().getSimpleName() + " approved request " + purchase.getNumber());
		} else if (successor != null) {
			successor.processRequest(purchase);
		}
	}

}
