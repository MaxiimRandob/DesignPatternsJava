package com.factoryMethod;

public abstract class TetrisGame
{
	private int containerHeight = 30;

	private int getContainerWight = 10;

	public void play()
	{
		int limit = 0;
		int simpleFigureCounter = 0;
		int superFigureCounter = 0;
		int figureCounter = 0;
		while (limit <= containerHeight)
		{
			Figure figure = getFigure();
			limit += figure.getHeight();
			if (figure.getType() == FigureType.SIMPLE)
			{
				++simpleFigureCounter;
				++figureCounter;
			}
			else
			{
				++superFigureCounter;
				++figureCounter;
			}
			if (limit > containerHeight)
			{
				System.out.println("Game over!" + '\n' +
									   "Number of simple figures = [" + simpleFigureCounter + "]" + '\n' +
									   "Number of super figures = [" + superFigureCounter + "]" + '\n' +
									   "Number of figures = [" + figureCounter + "]"
				);
				break;
			}
		}
	}

	public abstract Figure getFigure();
}
