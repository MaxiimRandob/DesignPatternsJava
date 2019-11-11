package com.abstractFactory.factory.impl;

import com.abstractFactory.model.Language;
import com.abstractFactory.model.Movie;
import com.abstractFactory.factory.AbstractFactory;
import com.abstractFactory.factory.AbstractMedia;

public class LanguageMediaFactory
	implements AbstractFactory
{
	private Movie movie;

	private Language language;

	public LanguageMediaFactory(
		Movie movie,
		Language language)
	{
		this.movie = movie;
		this.language = language;
	}

	@Override
	public AbstractMedia createSoundtrackMedia()
	{
		return new SoundtrackMedia(movie, language);
	}

	@Override
	public AbstractMedia createSubtitleMedia()
	{
		return new SubtitleMedia(movie, language);
	}
}
