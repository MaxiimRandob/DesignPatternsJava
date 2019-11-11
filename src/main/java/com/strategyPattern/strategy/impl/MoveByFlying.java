package com.strategyPattern.strategy.impl;

import com.strategyPattern.strategy.MoveSkill;

public class MoveByFlying
	implements MoveSkill
{

	@Override
	public void move()
	{
		System.out.println("Oh my God! It flies!!!");
	}

}
