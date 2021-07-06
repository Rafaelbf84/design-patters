package behavioral.state.impl;

public abstract class State {

	protected Account account;
	protected double balance;
	protected double interest;
	protected double lowerLimit;
	protected double upperLimit;

	public abstract void deposit(double amount);

	public abstract void withdraw(double amount);

	public abstract void payInterest();

}
