package com.factoryMethod;

import java.util.Random;

public class Randomizer
{
	public int getRandomNumberUsingNextInt(int min, int max) {
		Random random = new Random();
		return random.nextInt(max - min) + min;
	}
}
