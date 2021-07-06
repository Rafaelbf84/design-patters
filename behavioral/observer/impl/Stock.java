package behavioral.observer.impl;

import java.util.ArrayList;
import java.util.List;

public abstract class Stock {

	private String symbol;
	private double price;
	private List<IInvestor> investors = new ArrayList<IInvestor>();
	
	public Stock(String symbol, double price) {
		this.symbol = symbol;
		this.price = price;
	}

	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
		notifi();
	}

	public void attach(IInvestor investor) {
		investor.setStock(this);
		investors.add(investor);
	}
	
	public void dettach(IInvestor investor) {
		investors.remove(investor);
	}
	
	public void notifi() {
		for (IInvestor i : investors) {
			i.update(this);
		}
		System.out.println();
	}
	
}
