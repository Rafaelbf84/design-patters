package behavioral.visitor.impl;

public class VacationVisitor implements IVisitor {

	@Override
	public void visit(Element element) {
		Employee employee = (Employee) element;

		// Provide 3 extra vacation days
		System.out.println(employee.getClass().getSimpleName() + " - " + employee.getName()
				+"'s new vacation days: " + employee.getVacationDays());
	}

}
