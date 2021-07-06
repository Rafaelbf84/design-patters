package behavioral.command.impl;

import java.util.ArrayList;
import java.util.List;

public class User {

	private Calculator calculator = new Calculator();
	private List<Command> commands = new ArrayList<Command>();
	private int current = 0;

	public void redo(int levels) {
		System.out.println("\n---- Redo " + levels + " levels");

		for (int i = 0; i < levels; i++) {
			if (current < (commands.size() - 1)) {
				Command command = commands.get(current++);
				command.execute();
			}
		}
	}
	
	public void undo(int levels) {
		System.out.println("\n---- Undo " + levels + " levels");

		for (int i = 0; i < levels; i++) {
			if (current > 0) {
				Command command = commands.get(--current);
				command.unExecute();
			}
		}
	}
	
	public void compute(char operator, int operand) {
		Command command = new CalculatorCommand(operator, operand, calculator);
		command.execute();
		
		commands.add(command);
		current++;
	}
	
}
