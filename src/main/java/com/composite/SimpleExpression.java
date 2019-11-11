package com.composite;

public class SimpleExpression
	implements Expression
{
	private int value;

	public SimpleExpression(int value)
	{
		this.value = value;
	}

	public int evaluate()
	{
		return value;
	}
}
