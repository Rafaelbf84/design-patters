package behavioral.observer.impl;

public class Investor extends IInvestor {

	private String name;
	private Stock stock;

	public Investor(String name) {
		super();
		this.name = name;
	}

	public Stock getStock() {
		return stock;
	}

	public void setStock(Stock stock) {
		this.stock = stock;
	}

	@Override
	public void update(Stock stock) {
		System.out.println("Notified " + name + " of " + stock.getSymbol() + "'s change to $" + stock.getPrice());
	}

}
