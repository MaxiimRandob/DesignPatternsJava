package com.abstractFactory.model;

public class Order
{
	private String videoFileName;
	private String soundtrackFileName;
	private String subtitleFileName;

	public Order(
		final String videoFileName,
		final String soundtrackFileName,
		final String subtitleFileName)
	{
		this.videoFileName = videoFileName;
		this.soundtrackFileName = soundtrackFileName;
		this.subtitleFileName = subtitleFileName;
	}

	public String getVideoFileName()
	{
		return videoFileName;
	}

	public String getSoundtrackFileName()
	{
		return soundtrackFileName;
	}

	public String getSubtitleFileName()
	{
		return subtitleFileName;
	}

	@Override
	public String toString()
	{
		return "Order " +
			"videoFileName = '" + videoFileName + '\'' + '\n' +
			"soundtrackFileName = '" + soundtrackFileName + '\'' + '\n' +
			"subtitleFileName = '" + subtitleFileName + '\'' + '\n';
	}
}
