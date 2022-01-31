package com.uks.core.day8;

public class ThreadDemo1 extends Thread{

	public synchronized void run(){
		for (int i=1;i<=5000;i++){
			System.out.println("Thread<"+Thread.currentThread().getName()+"> : "+i+"\n");

			if(i%50 == 0){
				try {
					Thread.sleep(100);
					this.notifyAll();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
