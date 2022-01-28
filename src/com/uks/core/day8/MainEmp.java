package com.uks.core.day8;

import java.io.IOException;

public class MainEmp
{
	public static void main(String args[]) throws IOException, InterruptedException
	{
		EmpInfoMerger nameThread=new EmpInfoMerger("day8.txt","read","name");
		EmpInfoMerger addressThread=new EmpInfoMerger("day8_1.txt","read","address");
		EmpInfoMerger writeThread=new EmpInfoMerger("fileday8.txt","write","null");
		nameThread.start();
		addressThread.start();
		writeThread.start();
	}
}
