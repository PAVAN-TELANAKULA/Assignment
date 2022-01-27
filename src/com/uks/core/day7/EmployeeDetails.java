package com.uks.core.day7;

public class EmployeeDetails implements java.io.Serializable
{
	public String name;
	public int age;
	public double basicSal;

	public EmployeeDetails(String name, int age, double salary)
	{
		this.name= name;
		this.age=age;
		this.basicSal =salary;
	}
	public void printInfo()
	{
		System.out.println("username: " + name);
		System.out.println("age: " + age);
		System.out.println("basic sal: " + basicSal);

	}
}