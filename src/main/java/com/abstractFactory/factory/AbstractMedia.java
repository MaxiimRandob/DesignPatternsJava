package com.abstractFactory.factory;

public abstract class AbstractMedia
{
	protected String fileName;

	protected AbstractMedia(final String fileName)
	{
		this.fileName = fileName;
	}

	public String getMediaFileName()
	{
		return fileName;
	}
}
