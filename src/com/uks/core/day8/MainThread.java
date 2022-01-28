package com.uks.core.day8;

public class MainThread
{
	public static void main(String[] args) throws InterruptedException
	{
		ThreadDemo1 d1 = new ThreadDemo1();

		d1.printNumbers(5000);

		Runnable r = new ThreadDemo2();

		Thread d2 = new Thread(r);

		d2.start();
	}
}
