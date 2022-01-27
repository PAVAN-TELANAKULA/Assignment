package com.uks.core.day7;

import java.io.*;
import java.util.*;

public class PersistantEmpList {
	public Hashtable<Integer, EmployeeDetails> getData() {

		Hashtable<Integer, EmployeeDetails> hashtable = new Hashtable<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("How Many Employee Do You Want to Add...?");
		int numberofEmp = sc.nextInt();
		int i;
		for (i = 1; i <= numberofEmp; i++) {
			System.out.printf("Enter Name of %d :=", i);
			String name = sc.next();
			System.out.print("Enter Age:=");
			int age = sc.nextInt();
			System.out.print("Enter Basic salary:=");
			double salary = sc.nextDouble();
			EmployeeDetails employeeDetails = new EmployeeDetails(name, age, salary);
			hashtable.put(i, employeeDetails);
		}
		return hashtable;
	}

	void serialize(Hashtable<Integer, EmployeeDetails> hashtable) throws IOException {

		String filePath = "files.ser";

		FileOutputStream fileOut = new FileOutputStream(filePath);
		ObjectOutputStream out = new ObjectOutputStream(fileOut);

		out.writeObject(hashtable);

		out.close();
		fileOut.close();
		System.out.print("Serialization Successful.....\n");
	}

	void deserialize() throws IOException, ClassNotFoundException {

		String filePath = "files.ser";
		FileInputStream fileInputStream = new FileInputStream(filePath);
		ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

		Hashtable<Integer, EmployeeDetails> hashtable = (Hashtable<Integer, EmployeeDetails>) objectInputStream.readObject();
		objectInputStream.close();
		fileInputStream.close();

		System.out.println("\n\t................ Deserialized.................\n");
		System.out.println("-----Key---Value------");
		hashtable.entrySet().forEach(entry -> {
			System.out.println("\n" + entry.getKey() + " -> Employee Name:=" + entry.getValue().name + " Employee Age:=" + entry.getValue().age + " Employee Salary:=" + entry.getValue().basicSal);
		});
	}

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		PersistantEmpList persistentEmpList = new PersistantEmpList();

		Hashtable<Integer, EmployeeDetails> hashtable = persistentEmpList.getData();

		persistentEmpList.serialize(hashtable);

		persistentEmpList.deserialize();
	}
}

