package com.strategyPattern.strategy.impl;

import com.strategyPattern.strategy.MoveSkill;

public class MoveByFlyingAndWalking implements MoveSkill
{
	@Override
	public void move()
	{
		System.out.println("Oh my God! It flies and runs!!!");
	}
}
