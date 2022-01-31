package com.uks.core.day8;

public class ThreadDemo2 implements Runnable{
	@Override
	public synchronized void run() {
		for (int i=1;i<=5000;i++){
			System.out.println("Thread<"+Thread.currentThread().getName()+"> : "+i+"\n");

			if (i%75 == 0){
				try {
					Thread.sleep(200);
					this.notifyAll();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
