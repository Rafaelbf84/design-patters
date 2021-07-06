package behavioral.visitor.impl;

import java.text.NumberFormat;

public class IncomeVisitor implements IVisitor {

	@Override
	public void visit(Element element) {
		Employee employee = (Employee) element;

		// Provide 10% pay raise
		employee.setIncome(employee.getIncome() * 1.10);
		System.out.println(employee.getClass().getSimpleName() + " - " + employee.getName()
				+"'s new income: " + NumberFormat.getCurrencyInstance().format(employee.getIncome()));
	}

}
