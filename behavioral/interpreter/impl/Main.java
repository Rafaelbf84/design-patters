package behavioral.interpreter.impl;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		String roman = "MCMXXVIII";
		Context context = new Context(roman);

		// Build the 'parse tree'
		List<Expression> tree = new ArrayList<Expression>();
		tree.add(new ThousandExpression());
		tree.add(new HundredExpression());
		tree.add(new TenExpression());
		tree.add(new OneExpression());

		// Interpret
		for (Expression exp : tree) {
			exp.interpret(context);
		}

		System.out.println(roman + " = " + context.getOutput());
	}

}
