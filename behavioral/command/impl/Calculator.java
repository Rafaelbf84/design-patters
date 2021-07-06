package behavioral.command.impl;

public class Calculator {

	private int current = 0;

	public void operation(char operator, int operand) {
		switch (operator) {
		case '+':
			current += operand;
			break;

		case '-':
			current -= operand;
			break;

		case '*':
			current *= operand;
			break;

		case '/':
			current /= operand;
			break;
		
		default:
			break;
		}

		System.out.println("Current value: " + current + " (following " + operator + operand + ")");
	}

}
