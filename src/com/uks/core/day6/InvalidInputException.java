package com.uks.core.day6;

import java.io.PrintStream;

public class InvalidInputException extends Exception
{
	@Override
	public void printStackTrace(PrintStream s)
	{
		super.printStackTrace(s);
		System.out.println("Invalid Input Exception");
	}
}
