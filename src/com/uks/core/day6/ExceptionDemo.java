package com.uks.core.day6;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionDemo {
	public void printException()
	{
		try
		{
			FileInputStream fis = new FileInputStream("/home/brilworks-20/Demo.txt");
		}
		catch (FileNotFoundException fileNotFoundException)
		{
			fileNotFoundException.printStackTrace();
			System.out.println("file is not found");
		}
		catch (IOException io)
		{
			io.printStackTrace();
			System.out.println(io);
		}
		System.out.println("All Exception Execute Successfully");
	}
}
