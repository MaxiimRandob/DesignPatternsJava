package com.abstractFactory.factory.impl;

import com.abstractFactory.model.Language;
import com.abstractFactory.model.Movie;
import com.abstractFactory.factory.AbstractMedia;

public class SubtitleMedia
	extends AbstractMedia
{
	public SubtitleMedia(
		Movie movie,
		Language language)
	{
		super(movie.getMovieName() + "." + language + ".txt");
	}
}
