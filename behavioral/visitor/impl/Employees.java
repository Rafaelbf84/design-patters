package behavioral.visitor.impl;

import java.util.ArrayList;
import java.util.List;


public class Employees {

	private List<Employee> employees = new ArrayList<Employee>();

	public void attach(Employee employee) {
		employees.add(employee);
	}

	public void detach(Employee employee) {
		employees.remove(employee);
	}

	public void accept(IVisitor visitor) {
		for (Employee e : employees) {
			e.accept(visitor);
		}
		System.out.println();
	}

}
