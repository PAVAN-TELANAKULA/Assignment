package com.uks.core.day8;

import java.util.*;

public class GenericsTest
{
	public static void main(String args[])
	{
		Map<Long, String> map1 = new HashMap<Long, String>();

		printall(map1);
		addToDictionary(map1);
		printall(map1);
		searchvalue(map1);
	}
	static <K,U> void addToDictionary(Map<Long, String> map)
	{
		System.out.println("Enter Data for another 3 Employees ");
		Scanner scanner = new Scanner(System.in);
		int n = 3;
		for (int i = 1; i <= n; i++)
		{
			System.out.printf("Enter Mobile Number Of Emp  %d : ", i);
			Long MobNum = scanner.nextLong();

			System.out.println("Enter First Name  : ");
			String Fname = scanner.next();
			map.put((Long) MobNum, (String) Fname);
		}
	}
	static <K,U> void printall(Map<Long, String>map)
	{
		Set<Map.Entry<Long, String>> set = map.entrySet();

		map.put(9987123456L,"jacob");
		map.put(9819123456L,"jenny");

		for (Map.Entry e : set)
		{
			System.out.println("Mobile Number :  " + e.getKey());
			System.out.println("First Name : " + e.getValue());
		}
	}
	private static void searchvalue(Map<Long, String> hashMap)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("search value :");
		Long x = scan.nextLong();

		String value = hashMap.get(x);
		System.out.println(value);
	}
}
