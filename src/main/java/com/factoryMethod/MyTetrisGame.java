package com.factoryMethod;

public class MyTetrisGame
	extends TetrisGame
{
	private Randomizer randomizer = new Randomizer();

	@Override
	public Figure getFigure()
	{
		if (randomizer.getRandomNumberUsingNextInt(0, 2) == 0)
		{
			return new SimpleFigure();
		}
		return new SuperFigure();
	}
}
