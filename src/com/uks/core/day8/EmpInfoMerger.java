package com.uks.core.day8;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class EmpInfoMerger extends Thread
{
	String filePath, mode, fileType;
	static Map<Integer, EmployeeData> employees = new HashMap<>();

	public EmpInfoMerger(String filePath, String mode, String fileType)
	{
		this.filePath = filePath;
		this.mode = mode;
		this.fileType = fileType;
	}
	synchronized void writeToResource() throws IOException, InterruptedException
	{
		String line = " ";
		BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath));
		int i = 1;
		while ((line = bufferedReader.readLine()) != null)
		{
			EmployeeData employee = new EmployeeData();
			if (employees.containsKey(i))
			{
				employee = employees.get(i);
			}
			if (fileType.equals("name"))
			{
				employee.name = line;
			}
			if (fileType.equals("address"))
			{
				employee.address = line;
			}
			employees.put(i, employee);
			i++;
		}
		sleep(1000);
		printMap(employees);
		System.out.println("File suceesfully read");
		bufferedReader.close();
	}

	public void printMap(Map<Integer, EmployeeData> employees)
	{
		employees.entrySet().forEach(entry ->
		{
			System.out.println("Key :" + entry.getKey() + "   Name :" + entry.getValue().name + "  " + entry.getValue().address);
		});
	}

	synchronized void writeToFile() throws IOException, InterruptedException
	{
		File file = new File(filePath);
		boolean result = file.createNewFile();
		if (result)
		{
			System.out.println("File successfully created" + file.getPath());
		} else {
			System.out.println("File Already Exist" + file.getPath());
		}
		FileWriter fileWriter = new FileWriter(file);
		for (int i = 1; i <= employees.size(); i++)
		{
			fileWriter.write(i + ")" + employees.get(i).name + "\n" + employees.get(i).address + "\n");
			sleep(1000);
		}
		fileWriter.close();
		System.out.println("File sucessfully write");
	}

	@Override
	public void run()
	{
		if (mode.equals("read"))
		{
			try
			{
				writeToResource();
			} catch (IOException e)
			{
				System.out.println("IO exception occurs");
			} catch (InterruptedException e)
			{
				e.printStackTrace();
			}
		}
		else if (mode.equals("write"))
		{
			try
			{
				writeToFile();
			} catch (IOException e)
			{
				System.out.println("IO Exception");
			} catch (InterruptedException e)
			{
				e.printStackTrace();
			}
		}
	}
}