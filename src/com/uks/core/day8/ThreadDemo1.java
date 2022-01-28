package com.uks.core.day8;

public class ThreadDemo1 extends Thread
{
	public void printNumbers(int num) throws InterruptedException
	{
		System.out.println("Thread start running..........");
		for (int i = 0; i <= num; i++)
		{
			System.out.println("Thread<" + Thread.currentThread().getName()+ "> " + i +" ");
			if (i % 50 == 0)
			{
				Thread.sleep(100);
			}
		}
	}
}
