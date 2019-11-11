package com.composite;

public class CompositeExpression
	implements Expression
{

	private Operator operator;

	private Expression left;

	private Expression right;

	public CompositeExpression(
		Expression left,
		Operator operator,
		Expression right)
	{
		this.left = left;
		this.right = right;
		this.operator = operator;
	}

	public int evaluate()
	{
		switch (operator)
		{
			case ADDITION:
				return left.evaluate() + right.evaluate();
			case MULTIPLICATION:
				return left.evaluate() * right.evaluate();
			case SUBTRACTION:
				return left.evaluate() - right.evaluate();
			case DIVISION:
				return left.evaluate() / right.evaluate();

			default:
				throw new IllegalArgumentException();
		}
	}
}
