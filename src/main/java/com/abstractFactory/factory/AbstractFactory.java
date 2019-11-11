package com.abstractFactory.factory;

public interface AbstractFactory
{
	public AbstractMedia createSoundtrackMedia();
	public AbstractMedia createSubtitleMedia();
}
