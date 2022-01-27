package com.uks.core.day7;

public class ExecutionInfo extends FindInFiles
{

	public static void main(String[] args)
	{
		long start = System.nanoTime();
		beforeCall();
		afterCall();
		long end = System.nanoTime();
		System.out.println("Execution time is : " + (end - start) / 1000000000 + " seconds");
	}
	public static void beforeCall()
	{
		long beforeUsedMem = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
		System.out.println("Memory Usage Before Garbage Collection Occures");
		System.out.println(beforeUsedMem + "KB");
		Runtime.getRuntime(). gc();
	}
	public static void afterCall()
	{
		long afterUsedMem = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
		System.out.println("Memory Usage After Garbage Collection Occures");
		System.out.println(afterUsedMem + "KB");
	}

}


