package com.uks.core.day6;

import com.uks.core.day5.EmployeeSearch;
import com.uks.core.day5.EmployeeSortedList;
import com.uks.core.day5.RowPrinter;
import com.uks.core.day5.RowReader;
import com.uks.core.day1.MultiCommandLine;
import com.uks.core.day2.StringOperation;
import com.uks.core.day3.*;
import com.uks.core.day4.FrequencyChecker;

import java.io.IOException;
import java.text.ParseException;
import java.util.Scanner;

public class UserInteraction{
	public static void main(String[] args) throws NoSuchMethodException, IOException, ParseException, InvalidInputException{

		System.out.println("a. MultiCommandLine(Assignment 4 of Day 1) ");
		System.out.println("b. StringManipulation(Assignment 3 of Day 2) ");
		System.out.println("c. StringOperation(Assignment 4 of Day 2) ");
		System.out.println("d. PrintDataAndTime(Assignment 3 of Day 3) ");
		System.out.println("e. DateDifference(Assignment 4 of Day 3) ");
		System.out.println("f. DateAdd(Assignment 5 of Day 3) ");
		System.out.println("g. ReflectionInJava(Assignment 8 of Day 3) ");
		System.out.println("h. FrequencyChecker(Assignment 5 of Day 4) ");
		System.out.println("i. EmployeeSearch(Assignment 3 of day 5) ");
		System.out.println("j. SortingRecord(Assignment 4 of Day 5)\n ");



		System.out.println("enter your choice ");
		Scanner sc = new Scanner(System.in);
		String choice = sc.next();
		try{
			switch (choice) {

				case "a":

					System.out.print("enter choice :\n1. To add numbers\n2. Change to lowercase\n");

					int j = sc.nextInt();
					if ( j == 1 ) {

						MultiCommandLine.doOperation(j);
					}
					else if ( j == 2 ) {
						MultiCommandLine.doOperation(j);
					}
					else
						throw new InvalidInputException();
					break;

				case "b":
					System.out.println("1. To reverse string");
					System.out.println("2. To count number, upper and lower\n");

					System.out.println("Enter choice : ");

					int k = sc.nextInt();
					switch (k) {
						case 1: {
							System.out.println("Enter Word to reverse : ");
							String s = sc.next();
							StringOperation.reverseInput(s);
							break;
						}
						case 2: {
							System.out.println("Enter String");
							String s = sc.next();
							StringOperation.doOperation(s);
							break;
						}
						default:
							throw new InvalidInputException();
					}
					break;


				case "c":
					StringOperation.doOperationWithRegEx();
					break;

				case "d":
					DateAndTime.printDateAndTime();
					break;

				case "e":
					DateDifference.dateDifference();
					break;

				case "f":
					DateAdd.addDate();
					break;

				case "g":
					try {
						ReflectionImpl.getAll();
					}catch(NumberFormatException e){}
					break;

				case "h":
					FrequencyChecker.checker();
					break;

				case "i":
					EmployeeSearch rs = new EmployeeSearch();
					RowReader.printRecord();
					rs.searchCriteria();
					break;

				case "j":
					RowPrinter.tableFormat();
					EmployeeSortedList.SortedList();
					break;

				default:
					throw new InvalidInputException();
			}

		} catch (InvalidInputException e) {
			System.out.println("enter valid choice\n" +e);
		}

	}
}
