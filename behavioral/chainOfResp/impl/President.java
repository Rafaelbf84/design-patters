package behavioral.chainOfResp.impl;

public class President extends Approver {

	@Override
	public void processRequest(Purchase purchase) {
		if (purchase.getAmount() < 25000.0) {
			System.out.println(this.getClass().getSimpleName() + " approved request " + purchase.getNumber());
		} else if (successor != null) {
			successor.processRequest(purchase);
		}
	}

}
