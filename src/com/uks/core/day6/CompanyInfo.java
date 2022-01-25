package com.uks.core.day6;

import java.util.Enumeration;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

public class CompanyInfo {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Choices");
		System.out.println("1.English");
		System.out.println("2.Japanese");
		System.out.println("Choice 1 for English And Choice 2 for Japanese");
		int input = sc.nextInt();

		switch (input)
		{
			case 1:
			{
				System.out.println("Data From bundle_en(message_en)");
				Locale locale = new Locale("en","IN");
				ResourceBundle resourceBundle = ResourceBundle.getBundle("com.day6.bundle", Locale.ENGLISH);

				System.out.println(resourceBundle.getString("name"));
				Enumeration bundleKeys = resourceBundle.getKeys();

				while (bundleKeys.hasMoreElements())
				{
					String key = (String)bundleKeys.nextElement();
					String value = resourceBundle.getString(key);
					System.out.println("key = " + key + ", " + "value = " + value);
				}
				break;
			}
			case 2:
			{
				System.out.println("Data From bundle_ja(message_ja)");

				Locale locale1 = new Locale("ja","JP");
				ResourceBundle resourceBundle1 = ResourceBundle.getBundle("com.day6.bundle_ja", Locale.JAPANESE);
				System.out.println(resourceBundle1.getString("name"));

				Enumeration bundleKeys1 = resourceBundle1.getKeys();

				while (bundleKeys1.hasMoreElements())
				{
					String key = (String)bundleKeys1.nextElement();
					String value = resourceBundle1.getString(key);
					System.out.println("key = " + key + ", " + "value = " + value);
				}
			}
		}
	}
}
