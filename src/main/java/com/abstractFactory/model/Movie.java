package com.abstractFactory.model;

import java.util.Arrays;

public class Movie
{
	private String movieName;

	private Language defaultLanguage = Language.ENGLISH;

	private Language[] availableLanguages;

	public Movie(
		final String movieName,
		final Language... availableLanguages)
	{
		this(movieName, Language.ENGLISH, availableLanguages);
	}

	private Movie(
		final String movieName,
		final Language defaultLanguage,
		final Language... availableLanguages)
	{
		this.movieName = movieName;
		this.defaultLanguage = defaultLanguage;
		this.availableLanguages = availableLanguages;
	}

	public boolean isAvailable(Language language)
	{
		return Arrays.stream(availableLanguages).anyMatch(l -> l == language);
	}

	public String getMovieName()
	{
		return movieName;
	}

	public String getVideoFileName()
	{
		return movieName + ".avi";
	}

	public Language getDefaultLanguage()
	{
		return defaultLanguage;
	}
}

