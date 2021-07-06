package behavioral.observer.impl;

public abstract class IInvestor {

	private Stock stock;

	public Stock getStock() {
		return stock;
	}

	public void setStock(Stock stock) {
		this.stock = stock;
	}

	public abstract void update(Stock stock);

}
