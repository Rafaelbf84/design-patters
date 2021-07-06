package behavioral.command.impl;

public class CalculatorCommand implements Command {

	private char operator;
	private int operand;
	private Calculator calculator;

	public CalculatorCommand(char operator, int operand, Calculator calculator) {
		this.operator = operator;
		this.operand = operand;
		this.calculator = calculator;
	}

	public char getOperator() {
		return operator;
	}

	public int getOperand() {
		return operand;
	}

	@Override
	public void execute() {
		calculator.operation(operator, operand);
	}

	@Override
	public void unExecute() {
		calculator.operation(undo(operator), operand);
	}

	private char undo(char operator) {
		switch (operator) {
		case '+':
			return '-';
		case '-':
			return '+';
		case '*':
			return '/';
		case '/':
			return '*';
		default:
			throw new IllegalArgumentException();
		}
	}
	
}
