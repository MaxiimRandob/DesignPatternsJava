package com.strategyPattern;

import com.strategyPattern.model.Creature;
import com.strategyPattern.model.Species;
import com.strategyPattern.strategy.impl.MoveByFlyingAndWalking;
import com.strategyPattern.strategy.impl.MoveBySwimming;

public class Main
{
	public static void main(String[] args)
	{
		Creature human = new Creature(Species.HUMAN);
		human.setSkill(new MoveByFlyingAndWalking());
		human.doSomething();

		Creature mermaid = new Creature(Species.MERMAID);
		mermaid.setSkill(new MoveBySwimming());
		mermaid.doSomething();
	}
}
