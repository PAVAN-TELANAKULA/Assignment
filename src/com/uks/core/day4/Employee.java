package com.uks.core.day4;
import java.util.Scanner;

class Employee
{
    protected String firstname;
    protected String lastname;
    Scanner sc = new Scanner(System.in);
    public void readdata()
    {
        System.out.println("FirstName: ");
        firstname = sc.nextLine();
        System.out.println("LastName: ");
        lastname = sc.nextLine();
    }
}
class ProjectLeader extends Employee
{
    protected String mobileNumber;
    protected final String employeeType="PL";
    public void print()
    {
        System.out.println("Mobile Number");
        mobileNumber = sc.nextLine();
        System.out.println("FirstName: " + firstname);
        System.out.println("Lastname: " + lastname);
        System.out.println("EmployeeType: " + employeeType);
        System.out.println("MobileNumber: " + mobileNumber);
    }
}