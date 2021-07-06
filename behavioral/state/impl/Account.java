package behavioral.state.impl;

public class Account {

	private State state;
	private String owner;

	public Account(String owner) {
		state = new SilverState(0.0, this);
		this.owner = owner;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}

	public double balance() {
		return state.balance;
	}

	public void Deposit(double amount) {
		state.deposit(amount);
		System.out.println("Deposited " + amount + " --- ");
		System.out.println("Balance = " + this.balance());
		System.out.println("Status = " + state.getClass().getSimpleName() + "\n");
		System.out.println("");
	}

	public void Withdraw(double amount) {
		state.withdraw(amount);
		System.out.println("Withdrew " + amount + " --- ");
		System.out.println("Balance = " + this.balance());
		System.out.println("Status = " + state.getClass().getSimpleName() + "\n");
	}

	public void PayInterest() {
		state.payInterest();
		System.out.println("Interest Paid --- ");
		System.out.println("Balance = " + balance());
		System.out.println("Status = " + state.getClass().getSimpleName() + "\n");
	}

}
