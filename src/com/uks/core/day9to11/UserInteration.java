package com.uks.core.day9to11;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.Scanner;

public class UserInteration extends  Thread
{


	String filePath, fileName, getUserRole, choice;
	static Map<Integer, user_login> employeeInfo = new HashMap<>();

	int count = 1;
	String[] employeeData;

	public UserInteration(String fileName, ThreadGroup threadGroup) {
		super(threadGroup, "UserInfo read");
		this.fileName = fileName;
		start();
	}

	public void readfile() throws IOException, InterruptedException {

		Properties properties = new Properties();

		properties.load(new FileReader("/home/brilworks-20/IdeaProjects/UKSSkillup/src/UserInfo.properties"));

		String filepathUserLoginInfo = properties.getProperty("user-login.filepath");
		String filepathUserInfo = properties.getProperty("userinfo.filepath");

		if (fileName.equals("UserLoginInfo")) {
			this.filePath = filepathUserLoginInfo;
		}
		if (fileName.equals("UserInfo")) {
			this.filePath = filepathUserInfo;
		}
		System.out.println("________________File Reading________________");
		String line = "";
		String splitBy = ",";
		BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath));

		int i = 1;
		while ((line = bufferedReader.readLine()) != null) {
			employeeData = line.split(splitBy);
			if (fileName.equals("UserLoginInfo")) {
				user_login employee = new user_login(employeeData[0], employeeData[1], employeeData[3]);
				if (employeeInfo.containsKey(i)) {
					employee = employeeInfo.get(i);
				}
				employee.userId = employeeData[0];
				employee.userName = employeeData[1];
				employee.password = employeeData[2];
				employee.userRole = employeeData[3];
				employeeInfo.put(i, employee);
			}


			if (fileName.equals("UserInfo")) {
				user_login employee = new user_login(employeeData[2], employeeData[3], Double.parseDouble(employeeData[4]), employeeData[5]);

				if (employeeInfo.containsKey(i)) {
					employee = employeeInfo.get(i);
				}
				employee.address = employeeData[2];
				employee.city = employeeData[3];
				employee.salary = Double.parseDouble(employeeData[4]);
				employee.telnumber = employeeData[5];
				employeeInfo.put(i, employee);
			}
			i++;
		}

		bufferedReader.close();
		if (fileName.equals("UserInfo")) {
			System.out.println("_____________File Read Succesfull______________");
			printInfo();
			authentication();
		}
	}

	private void printInfo() {
		System.out.println("______________Merged Data_______________");
		for (Map.Entry<Integer, user_login> entry : employeeInfo.entrySet()) {
			System.out.println("(" + entry.getKey() + ")" + entry.getValue().userName + "\t" + entry.getValue().userRole + "\t" + entry.getValue().address + "\t" + entry.getValue().city + "\t" + entry.getValue().salary + "\t" + entry.getValue().telnumber);
		}

	}


	Scanner scanner = new Scanner(System.in);
	user_login loginUser = null;

	public void authentication() {
		int i = 1;
		System.out.println("______________________Running Authentication Process___________________________");
		while (i <= 3 && loginUser == null) {
			System.out.println("Please Enter UserName :");
			String use_Name = scanner.nextLine();
			System.out.println("Please Enter PassWord :");
			String passWord = scanner.nextLine();
			for (Map.Entry<Integer, user_login> entry : employeeInfo.entrySet()) {
				if (use_Name.equals(entry.getValue().userName) && passWord.equals(entry.getValue().password)) {
					System.out.println("_______________ Login Successful_______________");
					System.out.println(entry.getValue().userName + entry.getValue().userRole);
					loginUser = entry.getValue();

					break;
				}
			}
			if (loginUser == null) {
				System.out.println("  !!!  Username or PassWord is incorrect....." + " Remaining Try " + (3 - i));
				i++;
			}

		}
		if (i > 3) {
			System.out.println("The System gets closed because the data you have provided is not valid. Please re-confirm it.\n");
			System.exit(1);
		}
		if (loginUser.userRole.equals("Employee")) {
			System.out.println("UserID : " + loginUser.userId + "\n Name : " + loginUser.userName + "\n User Role : " + loginUser.userRole +
					"\n Address : " + loginUser.address + "\n City : " + loginUser.city + "\n Salary : " + loginUser.salary + "\n TelNumber : " + loginUser.telnumber);
		} else if (loginUser.userRole.equals("Manager")) {
			showOption();
			selectChoiceManager();
		} else if (loginUser.userRole.equals("Admin")) {
			showOption();
			selectChoiceAdmin();
		}
	}

	public void showOption() {
		System.out.println("Display a List (Press L) ==> \nSearch for Employee (Press S) ==> \n" +
				" 1. Back to main Menu (Press B) \n" +
				" 2. Press E for Employees");
		if (loginUser.userRole.equals("Admin")) {
			System.out.println("3. Press M for Manager \n" +
					"4. Press A for Admin \n");
		}
		System.out.println("5. All for all" + "\nLog Off (O) " + "\nExit(X)");
	}
	public void selectChoiceManager() {
		System.out.println("Please select Your Choice : ");
		String pressChar = scanner.nextLine();

		switch (pressChar) {

			case "All":
			case "L":
			case "E": {
				System.out.println("Display a List of Employee :");
				for (Map.Entry<Integer, user_login> entry : employeeInfo.entrySet()) {
					if (entry.getValue().userRole.equals("Employee")) {
						System.out.println("UserID : " + entry.getValue().userId + "\t Name : " + entry.getValue().userName + "\t User Role : " + entry.getValue().userRole +
								"\t Address : " + entry.getValue().address + "\t City : " + entry.getValue().city + "\t Salary : " + entry.getValue().salary + "\t TelNumber : " + entry.getValue().telnumber);
					}
				}
				break;
			}
			case "S": {
				System.out.println("Enter the name of Employee you want to search : ");
				String searchName = scanner.nextLine();
				System.out.println("Search Employee Details are :");
				for (Map.Entry<Integer, user_login> entry : employeeInfo.entrySet()) {
					if (searchName.equals(entry.getValue().userName) && loginUser.userRole.equals("Employee")) {
						System.out.println("UserID : " + entry.getValue().userId + "\nName : " + entry.getValue().userName + "\nUser Role : " + entry.getValue().userRole +
								"\nAddress : " + entry.getValue().address + "\nCity : " + entry.getValue().city + "\nSalary : " + entry.getValue().salary + "\nTelNumber : " + entry.getValue().telnumber);
					}
				}

				break;
			}
			case "B": {
				showOption();
				break;
			}

			case "O": {
				System.out.println("You are Log Off");
				authentication();
				break;
			}
			case "X": {
				System.exit(1);
				break;
			}
			default:
				System.out.println("Your Choice is Wrong");
		}
	}




	public void selectChoiceAdmin() {
		System.out.println("Please Enter Your Choice : ");
		String pressChar = scanner.nextLine();
		while (true) {

			switch (pressChar) {
				case "L":
				case "All": {
					System.out.println("Display a List Of All Employees :");
					printInfo();
					break;
				}
				case "S": {
					System.out.println("Enter the name of Employee you want to search : ");
					String searchName = scanner.nextLine();
					System.out.println("Search Employee Details are :");
					for (Map.Entry<Integer, user_login> entry : employeeInfo.entrySet()) {
						if (searchName.equals(entry.getValue().userName)) {
							System.out.println("UserID : " + entry.getValue().userId + "\nName : " + entry.getValue().userName + "\nUser Role : " + entry.getValue().userRole +
									"\nAddress : " + entry.getValue().address + "\nCity : " + entry.getValue().city + "\nSalary : " + (entry.getValue().salary  + 12 * entry.getValue().salary/100) + "\nTelNumber : " + entry.getValue().telnumber);
							break;
						}
					}
					break;
				}
				case "B": {
					showOption();
					break;
				}
				case "E": {
					System.out.println("Display a List of Employee :");
					for (Map.Entry<Integer, user_login> entry : employeeInfo.entrySet()) {
						if (entry.getValue().userRole.equals("Employee")) {
							System.out.println("UserID : " + entry.getValue().userId + "\t Name : " + entry.getValue().userName + "\t User Role : " + entry.getValue().userRole +
									"\t Address : " + entry.getValue().address + "\t City : " + entry.getValue().city + "\t Salary : " + (entry.getValue().salary  + 12 * entry.getValue().salary/100) + "\t TelNumber : " + entry.getValue().telnumber);
						}
					}
					break;
				}
				case "M": {
					System.out.println("Display a List of Manager :");
					for (Map.Entry<Integer, user_login> entry : employeeInfo.entrySet()) {
						if (entry.getValue().userRole.equals("Manager")) {
							System.out.println("UserID : " + entry.getValue().userId + "\t Name : " + entry.getValue().userName + "\t User Role : " + entry.getValue().userRole +
									"\t Address : " + entry.getValue().address + "\t City : " + entry.getValue().city + "\t Salary : " + (entry.getValue().salary  + 12 * entry.getValue().salary/100) + "\t TelNumber : " + entry.getValue().telnumber);
						}
					}
					break;
				}
				case "A": {
					System.out.println("Display a List of Admin :");
					for (Map.Entry<Integer, user_login> entry : employeeInfo.entrySet()) {
						if (entry.getValue().userRole.equals("Admin")) {
							System.out.println("UserID : " + entry.getValue().userId + "\t Name : " + entry.getValue().userName + "\t User Role : " + entry.getValue().userRole +
									"\t Address : " + entry.getValue().address + "\t City : " + entry.getValue().city + "\t Salary : " + (entry.getValue().salary  + 12 * entry.getValue().salary/100) + "\t TelNumber : " + entry.getValue().telnumber);
						}
					}
					break;
				}
				case "O": {
					System.out.println("You are Logged Off");
					break;
				}
				case "X": {
					System.exit(1);
					break;
				}
				default:
					System.out.println("Your Choice is Wrong");
			}
			break;
		}
	}





	public void run () {
		try {
			readfile();
		} catch (IOException | InterruptedException e) {
			e.printStackTrace();
		}
	}

}
