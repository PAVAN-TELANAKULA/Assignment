package com.uks.core.day7;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;
import java.util.regex.Pattern;


public class FindInFiles
{
	public static void main(String[] args) throws Exception
	{
		ExecutionInfo ei = new ExecutionInfo();
		ei.beforeCall();
		long start = System.nanoTime();

		Searching sa = new Searching();
		FindInFiles aa=new FindInFiles();

		try {

			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Path : ");

			String dir = sc.nextLine();
			File file1 = new File(dir);
			Path path = file1.toPath();

			System.out.println("Enter String To be Searched : ");
			String search = sc.nextLine();

			Pattern p1 = Pattern.compile(search);

			if (file1.isDirectory())
			{
				sa.searchInDirectory(file1, p1);
			} else
			{
				InputStream isr = Files.newInputStream(path);
				BufferedReader brw = new BufferedReader(new InputStreamReader(isr));
				sa.searchInFile(file1, brw, p1);
			}
			System.gc();
			System.out.println("After calling garbage Collection ");
			ei.afterCall();

			long end = System.nanoTime();

			System.out.println("Execution time is : " + (end - start) / 1000000000 + " seconds");
		}
		catch (NullPointerException OutMemmoryError)
		{
			System.out.println(OutMemmoryError);
		} catch (IOException e)
		{
			e.printStackTrace();
		}
	}

}
