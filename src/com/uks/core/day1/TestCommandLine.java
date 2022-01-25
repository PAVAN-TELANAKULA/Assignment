package com.uks.core.day1;
import java.util.Scanner;
public class TestCommandLine {
    void validate(String username,String password) {
        UserNamePassword userNamePassword = new UserNamePassword(username,password);
        String yourusername = userNamePassword.getUsername();
        String yourpassword = userNamePassword.getPassword();
        String myusername = "pavan08";
        String mypassword = "12345";
        if(yourusername.equals(myusername) && yourpassword.equals(mypassword)) {
            System.out.println("Login Successful");
        }
        else
            System.out.println("username and password is different");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter username : ");
        String username = sc.next();
        System.out.println("Enter password : ");
        String password = sc.next();

        TestCommandLine testCommandLine = new TestCommandLine();
        testCommandLine.validate(username,password);
    }
}
