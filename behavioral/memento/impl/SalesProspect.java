package behavioral.memento.impl;

public class SalesProspect {

	private String name;
	private String phone;
	private double budget;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public double getBudget() {
		return budget;
	}

	public void setBudget(double budget) {
		this.budget = budget;
	}

	public Memento saveMemento() {
		System.out.println("\nSaving state --\n");
		return new Memento(name, phone, budget);
	}

	public void restoreMemento(Memento memento) {
		System.out.println("\nRestoring state --\n");
		name = memento.getName();
		phone = memento.getPhone();
		budget = memento.getBudget();
	}

	@Override
	public String toString() {
		return "SalesProspect [name=" + name + ", phone=" + phone + ", budget=" + budget + "]";
	}

}
