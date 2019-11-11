package com.strategyPattern.strategy.impl;

import com.strategyPattern.strategy.MoveSkill;

public class MoveBySwimming
	implements MoveSkill
{

	@Override
	public void move()
	{
		System.out.println("Oh my God! It swims!!!");
	}

}
