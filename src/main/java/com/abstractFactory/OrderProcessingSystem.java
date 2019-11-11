package com.abstractFactory;

import com.abstractFactory.model.Language;
import com.abstractFactory.model.Order;
import com.abstractFactory.model.Movie;
import com.abstractFactory.factory.AbstractFactory;
import com.abstractFactory.factory.impl.LanguageMediaFactory;

import java.util.HashMap;
import java.util.Map;

public class OrderProcessingSystem
{
	private Map<String, Movie> movies = new HashMap<>();

	public OrderProcessingSystem()
	{
		createMovie("terminator1", Language.ENGLISH, Language.FRENCH);
		createMovie("terminator2", Language.ENGLISH, Language.GERMAN);

	}

	private void createMovie(
		String movieName,
		Language... languages)
	{
		movies.put(movieName, new Movie(movieName, languages));
	}

	public Order processOrder(
		String movieName,
		Language language)
	{
		//find movie by name
		Movie movie = movies.get(movieName);
		//check supported languages
		language = movie.isAvailable(language) ? language : movie.getDefaultLanguage();
		//create language artifacts factory
		AbstractFactory factory = createMediaFactory(movie, language);
		//compose order with avi, mp3 ,txt
		return new Order(movie.getVideoFileName(), factory.createSoundtrackMedia().getMediaFileName(), factory.createSubtitleMedia().getMediaFileName());
	}

	private AbstractFactory createMediaFactory(Movie movie, Language language)
	{
		//to do create concrete media factory

		return new LanguageMediaFactory(movie, language);
	}

	public static void main(String[] args)
	{
		final OrderProcessingSystem system = new OrderProcessingSystem();
		System.out.println(system.processOrder("terminator1", Language.FRENCH));
		System.out.println(system.processOrder("terminator2", Language.GERMAN));

	}
}
