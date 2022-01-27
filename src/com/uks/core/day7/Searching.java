package com.uks.core.day7;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Searching
{
	public  void searchInDirectory(File file, Pattern p1) throws IOException
	{
		File[] files = file.listFiles();
		try
		{
			assert files != null;
			for (File f : files)
			{
				if (f.isFile())
				{
					Path path = f.toPath();
					InputStream is = Files.newInputStream(path);
					BufferedReader br = new BufferedReader(new InputStreamReader(is));
					searchInFile(f, br, p1);
				}
				else
				{
					searchInDirectory(f, p1);
				}
			}
		}catch (NullPointerException OutOfMemoryError )
		{
			System.out.println("out of memmory");
		}
	}
	public void searchInFile(File file, BufferedReader br, Pattern p1) throws IOException
	{
		int flag = 0;

		while (br.ready())
		{
			String str = br.readLine();
			flag++;

			try
			{
				str = str.toLowerCase(Locale.ROOT);
			} catch (NullPointerException e)
			{
				continue;
			}

			Matcher m = p1.matcher(str);

			if (m.find())
			{
				System.out.println("Line Number : \n" + flag);
				System.out.println(file.getPath()+"\n");
				System.out.println(m.start() + " " + m.group() + " -------" + file.getName());
			}
		}
	}
}

