package com.composite;

public class Calculator
{
	public static void main(String[] args)
	{
		//	(1+2)*4+5*(3+6)
		final CompositeExpression x = new CompositeExpression(
			new CompositeExpression(new SimpleExpression(1), Operator.ADDITION, new SimpleExpression(2)),
			Operator.MULTIPLICATION,
			new SimpleExpression(4));

		final CompositeExpression y = new CompositeExpression(
			new CompositeExpression(new SimpleExpression(3), Operator.ADDITION, new SimpleExpression(6)),
			Operator.MULTIPLICATION,
			new SimpleExpression(5));

		System.out.println(new CompositeExpression(x, Operator.ADDITION, y).evaluate());
	}
}
