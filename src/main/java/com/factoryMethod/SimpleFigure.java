package com.factoryMethod;

public class SimpleFigure
	implements Figure
{
	private Randomizer randomizer;
	@Override
	public int getHeight()
	{
		Randomizer randomizer = new Randomizer();
		return randomizer.getRandomNumberUsingNextInt(0, 5);
	}

	@Override
	public int getWight()
	{
		Randomizer randomizer = new Randomizer();
		return randomizer.getRandomNumberUsingNextInt(0, 5);
	}

	@Override
	public FigureType getType()
	{
		return FigureType.SIMPLE;
	}
}
