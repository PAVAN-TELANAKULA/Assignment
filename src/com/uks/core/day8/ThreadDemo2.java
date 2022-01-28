package com.uks.core.day8;

public class ThreadDemo2 implements Runnable
{
	@Override
	public void run()
	{
		System.out.println("thread start running.....");
		for (int i = 0; i <= 5000; i++)
		{
			System.out.println("Thread<" + Thread.currentThread().getName()+ ">" + i +" ");
			if (i % 75 == 0)
			{
				try {
					Thread.sleep(200);
				} catch (InterruptedException e)
				{
					e.printStackTrace();
				}
			}
		}
	}
}
