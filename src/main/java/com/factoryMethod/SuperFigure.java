package com.factoryMethod;

public class SuperFigure implements Figure
{
	private Randomizer randomizer;

	@Override
	public int getHeight()
	{
		Randomizer randomizer = new Randomizer();
		return randomizer.getRandomNumberUsingNextInt(5, 10);
	}

	@Override
	public int getWight()
	{
		Randomizer randomizer = new Randomizer();
		return randomizer.getRandomNumberUsingNextInt(5, 10);
	}

	@Override
	public FigureType getType()
	{
		return FigureType.SUPER;
	}
}
