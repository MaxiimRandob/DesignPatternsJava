package com.strategyPattern.model;

import com.strategyPattern.strategy.MoveSkill;

public class Creature
{
	private MoveSkill skill;
	private Species race;

	public Creature(
		final Species race)
	{
		this.race = race;
	}

	public void setSkill(final MoveSkill skill)
	{
		this.skill = skill;
	}

	public void doSomething()
	{
		skill.move();
	}
}
