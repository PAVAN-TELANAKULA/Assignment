package com.uks.core.day7;
import java.util.Scanner;
import java.util.Random;

public class ArrayShuffling {
	public static void main(String... args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter element from array");

		String[] array = new String[20];

		for (int i = 0; i < array.length; i++)
		{
			array[i]=sc.next();
		}
		System.out.print("Random number from the array = " + array[new Random().nextInt(array.length)]);
	}
}
