package com.uks.core.day8;

public class MainThread {
	public static void main(String[] args) throws InterruptedException {

		ThreadDemo1 threadDemo1 = new ThreadDemo1();

		Runnable runnable = new ThreadDemo2();
		Thread thread = new Thread(runnable);

			threadDemo1.start();
			thread.start();
		}
	}

