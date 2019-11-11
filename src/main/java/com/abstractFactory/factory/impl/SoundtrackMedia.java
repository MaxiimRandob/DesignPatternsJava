package com.abstractFactory.factory.impl;

import com.abstractFactory.model.Language;
import com.abstractFactory.model.Movie;
import com.abstractFactory.factory.AbstractMedia;

public class SoundtrackMedia extends AbstractMedia
{
	public SoundtrackMedia(Movie movie, Language language)
	{
		super(movie.getMovieName()+"."+language+".mp3");
	}
}
